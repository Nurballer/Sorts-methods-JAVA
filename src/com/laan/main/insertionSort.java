package com.laan.main;

public class insertionSort {
    private static void insertSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        insertSort(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
