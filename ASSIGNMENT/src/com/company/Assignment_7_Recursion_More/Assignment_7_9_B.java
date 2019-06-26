package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_9_B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        StringBuilder s2=new StringBuilder();
        s2=dupi(s2,s1, s1.length() - 1, 0);
        System.out.println(s2);

    }

    private static StringBuilder dupi(StringBuilder processed,String unprocessed, int length, int count) {
        if (unprocessed.isEmpty()) {
            return processed;
        }
        if (unprocessed.length()>=3)
        if (unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i'&& unprocessed.charAt(2)!='t'){
unprocessed=unprocessed.substring(1);
        }
        else {
            char ch = unprocessed.charAt(0);
            processed.append(ch);
        }
unprocessed=unprocessed.substring(1);

        return dupi(processed,unprocessed, length - 1, count);
        }
    }




