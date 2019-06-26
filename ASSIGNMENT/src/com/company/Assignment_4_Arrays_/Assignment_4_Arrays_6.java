package com.company.Assignment_4_Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_6 {
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
        System.out.println(inverse(ar,n));


   }

    private static int inverse(int[] ar,int n) {
        int a[] = new int[n];
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            int value = ar[i];
            a[value] = i;
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == a[i]) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            return 1;
        }
        else{
            return -1;
        }
    }



}
