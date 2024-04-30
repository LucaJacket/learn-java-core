package com.nbicocchi.exercises.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v) {
        int[] out = new int[v.length];
        int j = 0;

        for (int k : v) {
            if (k != 0) {
                out[j++] = k;
            }
        }

        return out;
    }
}
