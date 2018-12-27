package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/27/2018.
 */
public class OddOccurance{

    int getOddOccurrence(int ar[], int ar_size)
    {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++)
        {
            res = res ^ ar[i];
            System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args)
    {
        OddOccurance occur = new OddOccurance();
        int ar[] = new int[]{9, 3, 9, 3, 9, 7, 9};
        int n = ar.length;
        System.out.println("odd occurance " +occur.getOddOccurrence(ar, n));
    }
}
