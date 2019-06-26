package com.company.Assignment_4_Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_10 {
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
        insertionsort(ar);
        System.out.println(Arrays.toString(ar));


    }

    private static void insertionsort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j > 0; j--) {
                if(ar[j]<ar[j-1]){
                    swapar(ar,j,j-1);
                }
                else{
                    break;
                }

            }
        }
    }
  public static void swapar(int ar[],int start , int end){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
  }

}




