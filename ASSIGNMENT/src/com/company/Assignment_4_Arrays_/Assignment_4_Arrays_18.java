package com.company.Assignment_4_Arrays_;

public class Assignment_4_Arrays_18 {
    public static void main(String[] args) {
     int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
       vwave(ar);
    }

    private static void vwave(int[][] ar) {
        for (int i = 0; i < ar.length; i++){

            if (i%2==0){
                   for (int j = 0; j < ar.length; j++){
                    System.out.print(ar[j][i]+" " );
                }
            }
             else{
                    for (int j = ar.length-1; j >=0 ; j--) {
                    System.out.print(ar[j][i]+" ");
                }
            }
            System.out.println(" ");
        }
    }


}




