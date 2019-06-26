package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pattern1(n,0);
    }

    private static void pattern1(int row, int col) {
        if(row==0){
            return;
        }
        if(row==col){
            System.out.println();
            pattern1(row-1,0);
            return;

        }
        System.out.print("* ");
        pattern1(row,col+1);

    }
}
