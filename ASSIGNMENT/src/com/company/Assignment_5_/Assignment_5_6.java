package com.company.Assignment_5_;

import java.util.Scanner;

public class Assignment_5_6 {
    public static void main(String[] args) {
        String s="abc";
        subsequence("","abc");


    }
    public static void subsequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed+ch,unprocessed);
        subsequence(processed,unprocessed);
    }
}

