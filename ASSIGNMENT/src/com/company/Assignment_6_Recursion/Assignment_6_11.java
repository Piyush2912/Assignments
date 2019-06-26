package com.company.Assignment_6_Recursion;

import java.util.Scanner;

public class Assignment_6_11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="abaa";
        System.out.println(find(s1,0,s1.length()-1));
    }

    private static boolean find(String s1,int index,int last) {
        if(index==s1.length()/2){
            return true;

        }
        if(s1.charAt(index)!=s1.charAt(s1.length()-1)){
            return false;

        }
       return find(s1,index+1,last-1);
    }
}
