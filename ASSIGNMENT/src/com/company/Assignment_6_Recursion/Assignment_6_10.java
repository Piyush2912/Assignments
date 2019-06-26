package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]={9,2,7,4,7,5};
        System.out.println(find(ar,0,7));
    }

    private static int find(int[] ar,int index,int n) {
        if(index==ar.length){
            return -1;

        }
        if(ar[index]==n){
            System.out.println(index);

        }
       return find(ar,index+1,n);
    }
}
