package com.company.Assignment_4_Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i <ar.length ; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }

        System.out.println(Arrays.toString(ar));
Bubblesort(ar);
        System.out.println(Arrays.toString(ar));


   }

    private static void Bubblesort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;

                }
            }

        }
    }

    private static void inverse(int[] ar,int n) {
       

        System.out.println(Arrays.toString(ar));
            }



}
