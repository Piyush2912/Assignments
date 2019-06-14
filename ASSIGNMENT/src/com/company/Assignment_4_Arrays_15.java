package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_15 {
    public static void main(String[] args) {
          String s="Hello";
       // System.out.println(s.substring(0,4));
substring(s);
    }
   public static void substring(String s){
       for (int i = 0; i < s.length(); i++) {
           for (int j = i+1; j <=s.length() ; j++) {
               System.out.println(s.substring(i,j));
           }
       }
}
    }




