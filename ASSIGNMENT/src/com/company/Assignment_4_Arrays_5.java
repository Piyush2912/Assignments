package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i <ar.length; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }

        System.out.println(Arrays.toString(ar));
        inverse(ar,n);


   }

    private static void inverse(int[] ar,int n) {
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
                int value = ar[i];
                a[value]=i;
                }




        System.out.println(Arrays.toString(a));
            }



}
