package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_4 {
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
            System.out.print("1 ");
            System.out.println();
            pattern1(row+1,0,n);
            return;

        }
        if(col==0){
            System.out.print("1 ");
        }
        else {
            System.out.print(fact(n)/(fact(n-col)*col)+ " ");
        }
        pattern1(row,col+1,n);

    }
    public  static int fact(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }

        return fact;

    }
}
