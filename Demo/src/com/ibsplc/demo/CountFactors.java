package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/21/2018.
 */
public class CountFactors {
    public static void main(String args[]){
        int n=24;
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.print(count+1);
    }
}
