package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/17/2018.
 */
public class BinarySearch {
    public static void main(String args[]){


        int arr[]={4,7,10,26,30,35,38,45,55,67};
        int l=0;
        int h=arr.length-1;

        int key = 50;
        while(l<=h) {
    int mid=(l+h)/2;
    if (arr[mid] == key) {
        System.out.println("element " + key + "is found at index " + mid);
        break;
    } else if (key < arr[mid]) {
        h = mid - 1;
    } else {
        l = mid + 1;
    }
}
if(l>h){
    System.out.println("element " + key + "not found ");
}
    }
}
