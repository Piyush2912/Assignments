package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Arrays_17 {
    public static void main(String[] args) {
     int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
       hwave(ar);
    }

    private static void hwave(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {

            if (i%2==0){
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.print(ar[i][j]+" " );
                }
            }
            else
            {
                for (int j = ar.length-1; j >=0; j--) {
                    System.out.print(ar[i][j]+" ");
                }
            }
            System.out.println();
        }
    }


}




