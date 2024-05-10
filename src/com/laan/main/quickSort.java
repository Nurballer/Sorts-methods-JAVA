package com.laan.quickSort;

public class quickSort {

    public static void sort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high)
            return;
        int pivot = array[low + (high - low) / 2];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) sort(array, low, j);
        if (high > i) sort(array, i, high);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        // Call the sort method with the correct parameters
        quickSort.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
