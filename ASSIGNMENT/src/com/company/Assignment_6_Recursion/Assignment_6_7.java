package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]={9,2,7,4,5};
        System.out.println(find(ar,0,7));
    }

    private static boolean find(int[] ar,int index,int n) {
        if(index==ar.length-1){
            return false;

        }
        if(ar[index]==n){
            return true;
        }
       return find(ar,index+1,n);
    }
}
