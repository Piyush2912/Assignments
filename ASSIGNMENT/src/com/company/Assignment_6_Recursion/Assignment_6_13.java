package com.company.Assignment_6_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = {1, 2, 3, 4, 5};
        revarray(ar, 0, 1);
        System.out.println(Arrays.toString(ar));
    }

    private static void revarray(int[] ar, int index, int place) {
        if (index == ar.length) {
            return;

        } else {
            if (ar[index] == place) {
                int temp = ar[index];
                ar[index] = ar[place];
                ar[place] = temp;
                revarray(ar, index + 1, place);
            }
            revarray(ar, 0, place + 1);
        }
    }
}
