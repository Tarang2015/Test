package com.ibsplc.demo;

/**
 * Created by A-8677 on 12/27/2018.
 */
public class FrogJump {
    public static void main(String args[]){
        FrogJump j=new FrogJump();
        j.solution(10,200,30);
    }

    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        int count = diff / D;
        if (diff % D > 0) {
            count++;
        }
        return count;
    }
}
