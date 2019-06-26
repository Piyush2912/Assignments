package com.company.Assignment_5_;

public class Assignment_5_9 {
    public static void main(String[] args) {
        String s = "abbaaababaabn";
        StringBuilder builder=new StringBuilder(s);
        System.out.println(removestr(builder));


    }
    public static StringBuilder removestr(StringBuilder s ){
        int prev='\0';
        int k=0;
        for (int i = 0; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                s.setCharAt(k++, s.charAt(i));
                prev = s.charAt(i);
            }
        }
        StringBuilder l=new StringBuilder(s.substring(0,k));
return  l;

                 }
            }


