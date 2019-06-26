package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_2 {
    public static void main(String[] args) {

      Scanner s=new Scanner(System.in);

      String str;
      str=s.nextLine();
      int i;
        System.out.println(converter(str,0));


    }

    private static int converter(String s,int ans) {
        if (s.isEmpty()){
            return ans;
            }
            char ch=s.charAt(0);
            s=s.substring(1);
            int res=ch-'0';
            ans=ans*10+res;

        return converter(s,ans);
    }
}
