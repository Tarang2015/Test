package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/15/2018.
 */
public class StackOperation {

   private int  []arr;
   private int size;
   private int top;

    public StackOperation(int size) {

        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public void push(int val){
        arr[++top]=val;
    }
    public int pop(){
        int val=arr[top--];
        return val;
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
StackOperation op=new StackOperation(10);
op.push(34);
        op.push(21);
        op.push(67);
        op.push(11);
        op.display();
        op.pop();
        System.out.println();
        op.display();

    }
}
