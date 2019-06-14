package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < ar.length; i++) {
            int aq = s.nextInt();
            ar[i] = aq;
        }
        System.out.println("Enter for 2nd array:");
        int m = s.nextInt();
        int ar2[] = new int[m];
        for (int j = 0; j < ar2.length; j++) {
            int as = s.nextInt();
            ar2[j] = as;
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
        int[] res=add(ar, ar2, n, m);
        for(int str: res){
            System.out.println(str);
        }



    }

    private static int[] add(int[] ar, int[] ar2, int n, int m) {
           int c[]=new int[Math.max(n,m)+1];
           int result=Math.max(n,m);
           int carry=0;
           n=ar.length-1;
           m=ar2.length-1;
           while(n>=0 && m>=0){
               c[result]=(ar[n]+ar2[m])%10+carry;
               carry=(ar[n]+ar2[m])/10;
               result--;
               n--;
               m--;
        }
        while(n>=0){
               c[result]=ar[n]+carry;
               carry=ar[n]/10;
               result--;
               n--;
               }
               while (m>=0){
               c[result]=ar2[m]+carry;
               carry=ar2[m]/10;
               result--;
               m--;

               }
               c[result]=carry;
               return c;

    }


    }




