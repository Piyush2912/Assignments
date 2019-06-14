package com.company;

import java.util.Scanner;

public class Assignment_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder builder = new StringBuilder(s);
        StringBuilder builder1=new StringBuilder(s);
        System.out.println(okay(builder,builder1));

    }

    private static StringBuilder okay(StringBuilder builder, StringBuilder builder1) {
        int k=0;
        for (int i = 0; i < builder.length(); i++) {
            char ch=builder.charAt(i);
            if(i%2==0){
                builder1.setCharAt(k,ch);
                k++;
            }
           else if (i%2!=0){
                int t= (int) (builder.charAt(i-1)-builder.charAt(i+1));
               char q=(char)(t);
                builder1.setCharAt(k,q);
            k++;
            }
        }
        return  builder1;
    }
}
