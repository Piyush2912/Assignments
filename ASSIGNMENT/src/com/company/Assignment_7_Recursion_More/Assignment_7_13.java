package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        okay(str);
    }

    private static boolean okay(String str) {
        if (str.length()==0){
            return false;
        }
        char ch=str.charAt(0);
        char ch1=str.charAt(1);
        char ch2=str.charAt(2);
        if (ch=='a'){
            return false;
        }
        if (str.charAt(str.length()-1)=='a'){
            return false;
        }



        return true;
    }
}


