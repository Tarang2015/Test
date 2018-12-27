package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/18/2018.
 */
public class BubbleSort {
    public static void main(String args[]){
        int arr[]={64,12,78,90,11,45,7};
        int temp;
        for(int pass=0;pass<arr.length-1;pass++){
            for(int i=0;i<arr.length-1-pass;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] +" ");
}
    }
}
