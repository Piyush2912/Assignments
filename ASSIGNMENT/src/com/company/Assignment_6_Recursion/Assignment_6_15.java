package com.company.Assignment_6_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_15 {
    public static void main(String[] args) {
        double[] sortingList = {9, 5, 3, 7, 4, 8, 6};

        sort(sortingList);

        // recursion completed now print sorted array
        for (int i = 0; i < sortingList.length; i++)
            System.out.println("sorted list is : " + sortingList[i]);
    }

    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);

    }

    public static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // Swap the smallest number in list
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sort the remaining list
            sort(list, low + 1, high);

        }
    }
}
