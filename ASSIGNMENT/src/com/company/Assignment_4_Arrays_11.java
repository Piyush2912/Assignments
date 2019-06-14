package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i <ar.length ; i++) {
            int aq=s.nextInt();
            ar[i] = aq;
        }
        System.out.println("Add element of another array=");
        int ar1[]=new int[n];
        for (int i = 0; i < ar1.length; i++) {
            int as=s.nextInt();
            ar1[i]=as;
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar1));
        intersection(ar,ar1,n);




   }

    private static void intersection(int[] ar, int[] ar1, int n) {

        ArrayList <Integer> c=new ArrayList<Integer>(n);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar1.length; j++) {
                if(ar[i]==ar1[j]){
                    c.add(ar1[i]);
                }
                else{
                    continue;
                }
            }
        }
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }


}
