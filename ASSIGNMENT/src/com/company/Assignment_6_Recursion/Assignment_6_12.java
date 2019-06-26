package com.company.Assignment_6_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[]={1,2,3,4,5};
        revarray(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }

    private static void revarray(int[] ar,int index,int last) {
        if(index==ar.length/2){
            return ;

        }
        else{
        int temp=ar[index];
        ar[index]=ar[last];
        ar[last]=temp;
      revarray(ar,index+1,last-1);
    }
}
}
