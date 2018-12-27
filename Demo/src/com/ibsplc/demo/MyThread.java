package com.ibsplc.demo;

import java.util.ArrayList;

/**
 * Created by A-8677 on 12/21/2018.
 */
public class MyThread extends  Thread{
static ArrayList<String> l=new ArrayList<String>();
    public void run(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
l.add("B");
    }

    public static void main(String args[]){
        ArrayList<String> l=new ArrayList<String>();
        MyThread t=new MyThread();
        l.add("A");
        l.add("B");
        l.add("C");
        t.start();
        for(String s:l){
            System.out.print(s);
            try {
                Thread.sleep(3000);
            }catch (Exception e){

            }
        }
    }
}
