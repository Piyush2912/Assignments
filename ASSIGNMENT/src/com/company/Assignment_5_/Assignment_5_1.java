package com.company.Assignment_5_;

import java.util.Scanner;

public class Assignment_5_1 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(pallin(s));
    }

    private static boolean pallin(String s) {
        int flag=0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = 1;
                break;
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
}
