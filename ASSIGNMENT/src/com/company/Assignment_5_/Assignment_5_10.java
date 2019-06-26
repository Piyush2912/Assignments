package com.company.Assignment_5_;

import java.util.Scanner;

public class Assignment_5_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 =s.nextLine();

        System.out.println(compression(s1));
    }

    private static StringBuilder compression(String s1) {
        StringBuilder s2 = new StringBuilder(1000);
        int count=1;
        s2.append(s1.charAt(0));
        for (int i = 0; i < s1.length()-1; i++) {
            char ch = s1.charAt(i);
            char ch1 = s1.charAt(i + 1);



            if (ch == ch1) {
                count=count+1;
            }
            else{
                if(count>1)
                    s2.append(count);
                count=1;
                s2.append(ch1);

            }



        }
        if(count>1)
            s2.append(count);
        return s2;
    }
}