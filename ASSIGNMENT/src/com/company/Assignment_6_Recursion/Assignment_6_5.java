package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        triangle(1,n);

    }
    private static void triangle(int start,int n) {
        if(start==n){
            System.out.print(n+" = ");
            return;
        }
        System.out.print(start +" + ");
        triangle(start+1,n);
    }
}
