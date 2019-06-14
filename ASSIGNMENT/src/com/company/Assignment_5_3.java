package com.company;

import java.util.Scanner;

public class Assignment_5_3 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       toggle(s);
    }

    private static void toggle(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                System.out.println((char)('a'+(ch-'A')));

            }
            else if (ch>='a' && ch<='z'){
                System.out.println((char)('A'+(ch-'a')));
            }
        }
    }

}
