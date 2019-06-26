package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_9_A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        dupi(s1, s1.length() - 1, 0);


    }

    private static void dupi(String unprocessed, int length, int count) {
        if (unprocessed.isEmpty()) {
            System.out.println(count);
            return;
        }
        if (unprocessed.length() >= 3) {
            if (unprocessed.charAt(0) == 'h' && unprocessed.charAt(1) == 'i') {
                if (unprocessed.charAt(2) == 't') {

                } else {
                    count++;
                    unprocessed = unprocessed.substring(1);
                }

            }

        } else {
            if (unprocessed.charAt(0) == 'h' && unprocessed.charAt(1) == 'i') {
                {
                    count++;
                    unprocessed = unprocessed.substring(1);
                }


            }
            }
            unprocessed = unprocessed.substring(1);

            dupi(unprocessed, length - 1, count);
        }
    }




