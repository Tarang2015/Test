package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/21/2018.
 */
public class MissingNum {


        static int getMissingNo (int a[], int n)
        {
            int i, total;

            total  =(n+1)*(n+2)/2;
            int sum=0;
            for (i = 0; i< a.length; i++) {
                sum += a[i];
            }
            return total-sum;
        }

    /* program to test above function */
        public static void main(String args[])
        {
            int a[] = {1,2,4,5,6};
            int miss = getMissingNo(a,5);
            System.out.println(miss);
        }

}
