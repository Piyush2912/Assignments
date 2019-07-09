package com.company.Assignment_8_Recursion_lvl_Up;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_8_A {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    subsiq("",str);

    }

    private static void subsiq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            StringBuilder builder= new StringBuilder();
            builder=builder.append(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subsiq(processed+ch,unprocessed);
        subsiq(processed,unprocessed);
    }
}
