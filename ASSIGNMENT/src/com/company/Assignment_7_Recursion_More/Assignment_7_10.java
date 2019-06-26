package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_10 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     counttwins(str,0);
    }

    private static void counttwins(String str,int count) {
        if (str.length()==0){
            System.out.println(count+" "+ "twins");
            return;
        }

        if (str.length()>=3){
                char ch=str.charAt(0);
                if (ch == str.charAt(2)) {
                    count++;}

            }
                str = str.substring(1);
        counttwins(str,count);
    }
}



