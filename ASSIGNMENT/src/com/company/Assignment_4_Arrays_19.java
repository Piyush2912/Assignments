package com.company;

public class Assignment_4_Arrays_19 {
    public static void main(String[] args) {
     int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
       clockwisespiral(ar);
    }

    private static void clockwisespiral(int[][] ar) {
int top=0;
int left=0;
int bottom=ar.length-1;
int right=ar.length-1;
while(top<=bottom && left<=right){
    for (int i = left; i <=right ; i++) {
        System.out.print(ar[top][i]+ " ");
    }
    top++;
    System.out.println();
    for(int i=top;i<=bottom;i++){
        System.out.print(ar[i][top]);
    }
    right--;
    System.out.println();

}
    }
}




