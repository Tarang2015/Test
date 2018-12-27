package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/26/2018.
 */
public class PowerTwo {
    public static void main(String args[]){
        int arr[] = {3, 11, 14, 5, 13};
int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(powerOf2(sum)){

                    count++;
                }
            }
        }
        System.out.print(count);
    }

    private static boolean powerOf2(int number){
        if(number<=0){
            return false;
        }

        while(number > 1){
            if(number % 2 != 0){
                return false;
            }
            number = number / 2;
        }
        return true;
    }
}
