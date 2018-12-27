package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/23/2018.
 */
public class MinimumBribes {

    public static void main(String args[]){
        minimumBribes(new int[]{2, 1, 5, 3, 4});

    }


    static void minimumBribes(int[] q) {
        for (int i = 0; i < q.length; i++) {
            if ((q[i] - (i + 1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        // now we just need to count number of Swaps
        int swaps = 0;
        for (int i = 0; i < q.length; i++) {
            for (int j = i + 1; j < q.length; j++) {
                if (q[i] > q[j]) {
                    int tmp = q[j];
                    q[j] = q[i];
                    q[i] = tmp;
                    swaps++;
                }
            }
        }

        System.out.println(swaps);
    } }