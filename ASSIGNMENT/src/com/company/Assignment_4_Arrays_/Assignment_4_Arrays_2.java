package com.company.Assignment_4_Arrays_;

import java.util.Scanner;

public class Assignment_4_Arrays_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i <ar.length ; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }
            int m;
        m=s.nextInt();
        System.out.println(Compare(ar,m));

    }

    private static int Compare(int[] ar,int m) {
        for (int i = 0; i < ar.length ; i++) {
            if (ar[i] == m) {
                return i;
            }
        }
        return  -1;
    }


}
