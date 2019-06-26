package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_4 {
    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  String s1=s.nextLine();
        System.out.println(checkpalin(s1,0,s1.length()-1));

    }

    private static boolean checkpalin(String s1,int l1, int l2) {
        if (l1==l2){
            return true;
        }
        if (s1.charAt(l1)!=s1.charAt(l2)) {
            return false;}
            if (l1<l2+1)
            return checkpalin(s1, l1 + 1, l2 - 1);
return  true;
    }
}


