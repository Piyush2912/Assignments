package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < ar.length; i++) {
            int aq = s.nextInt();
            ar[i] = aq;
        }

        System.out.println(Arrays.toString(ar));
        selectionsort(ar);
        System.out.println(Arrays.toString(ar));


    }

    private static void selectionsort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
              int max=maxindex(ar,0,ar.length-i-1);
              swapar(ar,max,ar.length-i-1);
        }
    }

    private static void swapar(int[] ar, int start, int end) {
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }

    private static int maxindex(int[] ar, int start, int end) {
        int max=0;
        for (int i = start; i <=end ; i++) {
            if (ar[i]>ar[max]){
                max=i;
            }
        }
        return  max;
    }
}




