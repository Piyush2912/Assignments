package com.company.Assignment_5_;

import java.util.Scanner;

public class Assignment_5_8 {
    public static void main(String[] args) {
     Scanner s1=new Scanner(System.in);
     String s=s1.nextLine();
        System.out.print(max(s));

    }
    public static char max(String s){
        int count[] = new int[256];
        int len = s.length();
        for (int i=0; i<len; i++)
            count[s.charAt(i)]++;
        int max = -1;
        char result = 0;
        for (int i = 0; i < len; i++) {
            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }
        }

        return result;
    }
}

