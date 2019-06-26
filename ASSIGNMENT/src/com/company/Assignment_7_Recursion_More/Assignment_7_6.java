package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_6 {
    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  String s1=s.nextLine();
  StringBuilder s2 = new StringBuilder();
  s2=dup(s2,s1,s1.length()-1);
            System.out.print(s2);




    }

    private static StringBuilder dup(StringBuilder processed, String unprocessed,int length) {
        if (unprocessed.isEmpty()){
            return processed;
        }
        if (unprocessed.charAt(length)==unprocessed.charAt(0)){
            processed.append(unprocessed.charAt(0));
        }
        else if (unprocessed.charAt(0)==unprocessed.charAt(1)){

        }
        else {
            processed.append(unprocessed.charAt(0));
        }
        unprocessed=unprocessed.substring(1);

        return dup(processed,unprocessed,length-1);
    }
}


