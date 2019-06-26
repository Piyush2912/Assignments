package com.company.Assignment_5_;

import java.util.Scanner;

public class Assignment_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder builder=new StringBuilder(s);
        System.out.println((replacestr(builder)));
    }

    private static StringBuilder replacestr(StringBuilder s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='A' || ch=='Z' || ch=='a' || ch=='z'){
                continue;
            }
            else if (i % 2 == 0) {
                ch = (char) (ch - 1);
                s.setCharAt(i, ch);
            } else if (i % 2 != 0) {
                ch = (char) (ch + 1);
                s.setCharAt(i, ch);
            }
        }
        return  s;
    }
}
