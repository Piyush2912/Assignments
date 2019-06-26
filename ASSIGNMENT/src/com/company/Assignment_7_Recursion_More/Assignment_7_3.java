package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_3 {
    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  String s1=s.nextLine();
  String s2=s.nextLine();
        System.out.println(checkreverse(s1,0,s2,s2.length()-1));

    }

    private static boolean checkreverse(String s1,int l1, String s2,int l2) {
        if (l1==l2){
            return true;
        }
        if (s1.charAt(l1)!=s2.charAt(l2)){
            return false;
        }
        if (l1<l2+1)
        return checkreverse(s1,l1+1,s2,l2-1);

    return true;
    }
}

