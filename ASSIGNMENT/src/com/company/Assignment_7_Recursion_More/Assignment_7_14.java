package com.company.Assignment_7_Recursion_More;

import java.util.Scanner;

public class Assignment_7_14 {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     StringBuilder str2=new StringBuilder();
     str2=displaypari(str,0,str2,0);
        System.out.println(str2);


    }

    private static StringBuilder displaypari(String str,int index,StringBuilder str2,int count) {
        if (str.charAt(index)==')') {
            return str2;
        }
        if (str.charAt(index)=='('){
            count=1;
            return displaypari(str,index+1,str2,count);
        }
        if (count==1){
            str2.append(str.charAt(index));
        }
        return displaypari(str,index+1,str2,count);
    }
}


