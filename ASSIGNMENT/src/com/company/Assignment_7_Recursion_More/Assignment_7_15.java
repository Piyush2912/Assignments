package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(displaypari(str, 0, 0));


    }

    private static boolean displaypari(String str, int index, int count) {
        if (index == str.length()) {
            if (count == 0)
                return true;
            else
                return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                count++;
            }
            if (ch == ')' || ch == '}' || ch == ']') {
                count--;
            }
        }
        return displaypari(str, index + 1, count);

    }
}


