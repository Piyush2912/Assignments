package com.company.Assignment_4_Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_4 {
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
        Reverse(ar);
        System.out.println(Arrays.toString(ar));


   }

    private static void Reverse(int[] ar) {

        int end=ar.length-1;
        for (int start = 0; start < end; start++, end--) {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
        }
    }

    private static int Binarysearch(int[] ar,int m) {
        int start=0;
        int last=ar.length-1;

       while (start<=last){
           int mid=(start+last)/2;
            if (ar[mid] == m) {
                return mid;
            } else if (ar[mid]>m){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return  -1;
    }


}
