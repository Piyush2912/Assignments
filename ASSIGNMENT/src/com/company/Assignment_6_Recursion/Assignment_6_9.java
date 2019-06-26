package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]={9,2,7,4,7,5};
        System.out.println(find(ar,ar.length-1,7));
    }

    private static int find(int[] ar,int index,int n) {
        if(index==-1){
            return -1;

        }
        if(ar[index]==n){
            return index;
        }
       return find(ar,index-1,n);
    }
}
