/* Problem Link: https://www.codingninjas.com/studio/problems/insertion-sort_3155179 */

import java.util.Arrays;

// Solution
public class Solution {

    public static void insertionSort(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // M elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2 };
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        insertionSort(n, arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
