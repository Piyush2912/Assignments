package com.company.Assignment_4_Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i <ar.length ; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }
        System.out.println("Enter target no=");
        int target=s.nextInt();
sum(ar,target);
        System.out.println(Arrays.toString(ar));
   }

    private static void sum(int[] ar, int target) {
        int start=0;
        int end=ar.length-1;

        for (int i =start; i <= end; i++) {
            int count = 1;
            while (count < ar.length) {
                if ((ar[i] + ar[count]) == target) {
                    System.out.println(ar[i] + "and" + (ar[count]));
                }
                count++;
            }
        }
        }
    }



