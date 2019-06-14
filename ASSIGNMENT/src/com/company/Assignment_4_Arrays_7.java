package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i <ar.length ; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }
        System.out.println("Enter the elements:");
        int ar2[]=new int[n];
        for (int j = 0; j < ar2.length; j++) {
            int as=s.nextInt();
            ar2[j]=as;
        }
        System.out.println(Arrays.toString(ar2));

        System.out.println(inverse(ar,ar2,n));


   }

    private static int inverse(int[] ar,int[] ar2, int n) {
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            int value = ar[i];
            a[value]=i;
        }
        System.out.println(Arrays.toString(a));

        int b[]=new int[n];
        for (int i = 0; i < ar2.length; i++) {
            int value1=ar2[i];
            b[value1]=i;

        }
        System.out.println(Arrays.toString(b));
        int flag=0;
        for (int i = 0; i < ar.length; i++) {
            if(a[i]==b[i]){
                flag=1;
            }
            else{
                flag=0;
            break;
            }
        }
        if(flag==1){
            return 1;
        }
        else{
            return -1;
        }

    }



}
