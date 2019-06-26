package com.company.Assignment_4_Arrays_;

import java.util.Scanner;

public class Assignment_4_Arrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[] = new int[5];

        for (int i = 0; i <ar.length ; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }
            System.out.println("Maximum No="+ Maxno(ar));

    }

    private static int Maxno(int[] ar) {
        int count=ar[0];
        for (int i = 0; i < ar.length ; i++) {
            if(ar[i]>count){
                count=ar[i];

            }
        }
        return  count;
    }


}
