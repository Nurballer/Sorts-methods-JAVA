package com.laan.main;

public class mergeSort {


   private static void sort(int[] arr) {
       int n = arr.length;
       if(n == 1) return;

       int mid = n/2;
       int[] l = new int[mid];
       int[] r = new int[n - mid];

       for(int i = 0; i < mid; i++)
           l[i] = arr[i];
       for (int i = 0; i < n - mid; i++)
           r[i] = arr[i + mid];

       sort(l);
       sort(r);
       merge(arr, l, r);

   }

   private static void merge(int[] arr, int[] l, int[] r) {
       int left = l.length;
       int right = r.length;
       int i = 0;
       int j = 0;
       int idx = 0;


       while(i < left && j < right) {
           if (l[i] < r[j]) {
               arr[idx] = l[i];
               i++;
               idx++;
           }
           else {
               arr[idx] = r[j];
               j++;
               idx++;
           }
       }

       for(int ll = i; ll < left; ll++)
           arr[idx++] = l[ll];
       for(int rr = j; rr < right; rr++)
           arr[idx++] = r[rr];
   }
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        sort(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
