package com.laan.main;

public class selectionSort {
    private static void selectSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int min_index = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[min_index] > arr[j])
                    min_index = j;
            }
            swap(i, min_index, arr);
        }
    }

    private static void swap(int i, int min_index, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }

    public static void main(String args[]) {
        int[] arr = {1000, 5, 7, 3, 2, 500, 13, 19};
        selectSort(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
