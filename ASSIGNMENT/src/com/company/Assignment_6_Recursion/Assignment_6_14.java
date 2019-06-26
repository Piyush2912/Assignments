package com.company.Assignment_6_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 int ar[]={5,4,3,7,1};
 bubblesort(ar,4,0);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubblesort(int[] ar,int row,int col) {
if(row==0){
    return;
}
    if(row==col){
    bubblesort(ar,row-1,0);
    return;
    }
    if(ar[col]>ar[col+1]) {
        int temp = ar[col];
        ar[col] = ar[col + 1];
        ar[col + 1] = temp;
    }
    bubblesort(ar, row, col + 1);

    }
}
