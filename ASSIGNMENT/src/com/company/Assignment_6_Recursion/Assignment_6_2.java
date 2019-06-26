package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pattern1(0,0,n);
    }

    private static void pattern1(int row, int col,int n) {
        if(row==n+1){
            return;
        }
        if(row==col){
            System.out.println();
            pattern1(row+1,0,n);
            return;

        }
        System.out.print("* ");
        pattern1(row,col+1,n);

    }
}
