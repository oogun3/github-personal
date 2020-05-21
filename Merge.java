package com.olamide.Apolis;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66};
        int[] b = {1, 2, 3, 4, 5, 6};
        int count = 0;

        int templength = a.length + b.length;
        int[] temp = new int[templength];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            temp[count++] = b[j];
        }
        System.out.println(Arrays.toString(temp));
    }
}
