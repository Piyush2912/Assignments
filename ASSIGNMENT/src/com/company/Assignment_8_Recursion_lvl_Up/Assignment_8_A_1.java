package com.company.Assignment_8_Recursion_lvl_Up;

import java.util.Scanner;

public class Assignment_8_A_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        subsequencetry("",str,0,0);

    }

    private static void subsequencetry(String processed, String unprocessed,int count,int f) {
        if (unprocessed.length()==0){
            f=1;
        }
        if (unprocessed.isEmpty()){
            //System.out.println(processed);
            count++;
            if (f==1)
            System.out.println(count);
            return ;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

         subsequencetry(processed+ch,unprocessed,count,f);
         subsequencetry(processed,unprocessed,count,f);
    }
}
