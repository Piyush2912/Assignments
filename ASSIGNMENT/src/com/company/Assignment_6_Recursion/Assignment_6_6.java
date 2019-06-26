package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]={9,2,7,4,5};
        System.out.println(sort(ar,0));
    }

    private static int sort(int[] ar,int index) {
        if(index==ar.length-1){
            return 1;

        }
        if(ar[index]>ar[index+1]){
            return -1;
        }
       return sort(ar,index+1);
    }
}
