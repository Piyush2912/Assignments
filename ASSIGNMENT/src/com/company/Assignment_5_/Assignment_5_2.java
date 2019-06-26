package com.company.Assignment_5_;

import java.util.Scanner;

public class Assignment_5_2 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(substring(s));
    }
    public static int substring(String s){
            int count=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String ch=s.substring(i,j);
                if(pallin(ch)==true){
                    count++;
                }
                }
        }
        return count;
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


