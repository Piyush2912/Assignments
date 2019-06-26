package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_11_B {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     counttwins(str,0);
    }

    private static void counttwins(String str,int count) {
        if (str.length()==0){
            System.out.println(count);
            return;
        }

        if (str.length()>=3){
                char ch=str.charAt(0);
                char ch1=str.charAt(1);
                char ch2=str.charAt(2);
                if (ch == 'a'&&ch1=='a'&&ch2=='a') {
                    count++;
                str=str.substring(2);}

            }
                str = str.substring(1);
        counttwins(str,count);
    }
}



