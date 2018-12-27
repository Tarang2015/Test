package com.ibsplc.demo;

import java.util.concurrent.*;

/**
 * Created by A-8677 on 12/22/2018.
 */

class CallabelDemo implements Callable<Integer> {
    int num;
    CallabelDemo(int num){
        this.num=num;
    }
    public Integer call() throws  Exception{
 System.out.println(Thread.currentThread().getName() + "processing" + num);
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        Thread.sleep(3000);
        return  sum;
    }
}
public class MyCallable{
    public static  void main(String args[]) throws  Exception{
        ExecutorService service= Executors.newFixedThreadPool(2);
        CallabelDemo [] job={new CallabelDemo(10),new CallabelDemo(20),new CallabelDemo(30),new CallabelDemo(40)};
        Future<Integer> f=null;
        for(CallabelDemo c:job) {
            f = service.submit(c);
            System.out.println(f.isDone());

               System.out.println("wait to com");
                System.out.println(f.isDone());
                System.out.println(f.get());



        }
        service.awaitTermination(0, TimeUnit.SECONDS);
        service.shutdown();

        }

}