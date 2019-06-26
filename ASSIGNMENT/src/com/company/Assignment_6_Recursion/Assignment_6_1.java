package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        oddeven(n);
    }

    private static void oddeven(int n) {
        if (n ==0) {
            System.out.println(n);
return;
        }
        if (n%2!=0){
            System.out.println(n-1);
            oddeven(n-2);

        }
        else{
            oddeven(n-2);
            System.out.println(n-1);
        }
    }
}
