package com.company.Assignment_4_Arrays_;

import java.util.Scanner;

public class Assignment_4_Arrays_19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();

            int ar[][]=new int[m][n];
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    ar[i][j]=s.nextInt();
                }
            }

            spiral(ar,m,n);
        }

    private static void spiral(int[][] ar,int m,int n) {

        int top=0;
        int left=0;
        int bottom=ar.length-1;
        int right=ar[0].length-1;
        //
        while (top<=bottom && left<=right){
             if (top<=bottom)
            for (int k = left; k <=right ; k++) {
                System.out.print(ar[top][k]+", ");
            }
            top++;
            //
            if (right>=left)
            for (int k =top ; k <=bottom ; k++) {
                System.out.print(ar[k][right]+", ");
            }
            right--;
            //
                if (bottom>=top)
                for (int k = right; k >=left ; k--) {
                    System.out.print(ar[bottom][k]+", ");
                }
            bottom--;
            //
            if (top<=bottom)
                for (int k = bottom; k >=top ; k--) {
                    System.out.print(ar[k][left]+", ");
                }
            left++;
            //
        }
        System.out.print("END");
    }


}