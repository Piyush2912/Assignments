package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_1 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);

      String str;
      str=s.nextLine();
        int i=Integer.parseInt(str);
        System.out.println(sumkrde(i,0));

    }

    private static int sumkrde(int n,int sum) {
        if (n==0){
            return sum;
        }

        int rem=n%10;
        n=n/10;
        sum=sum+rem;

        return sumkrde(n,sum);
    }
}
