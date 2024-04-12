package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tsifri = {1, 2, -4, 3, 9};
        printArray(tsifri);
//        SelectionSort(tsifri);
//        printArray(tsifri);
        Arrays.sort(tsifri);
        printArray(tsifri);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}

//public static void BubbleSort(){

//}
