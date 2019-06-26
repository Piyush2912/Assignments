package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_7 {
    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  String s1=s.nextLine();
  StringBuilder s2 = new StringBuilder();
  char ch=s1.charAt(s1.length()-1);
  s2=dup(s2,s1,s1.length()-1,0);
            System.out.print(s2);




    }

    private static StringBuilder dup(StringBuilder processed, String unprocessed,int length,int count) {
        if (unprocessed.isEmpty()){
            return processed;
        }
        if (unprocessed.length()==1){
            processed.append(unprocessed.charAt(0));
            for (int i = 0; i < count; i++) {
                processed.append('x');
            }
        }
        else if (unprocessed.charAt(0)=='x'){
            count++;

        }
        else {
            processed.append(unprocessed.charAt(0));
        }
        unprocessed=unprocessed.substring(1);

        return dup(processed,unprocessed,length-1,count);
    }
}


