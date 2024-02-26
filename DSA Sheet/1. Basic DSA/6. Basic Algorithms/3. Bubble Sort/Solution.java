/*Problem Link: https://www.codingninjas.com/studio/problems/bubble-sort_980524?interviewProblemRedirection=true */

import java.util.*;
import java.io.*;

public class Solution {

    // function to perform the bubble sort on an arry
    public static void bubbleSort(int[] arr, int n) {
        // outer loop
        for (int i = 0; i < n - 1; i++) {
            // inner loop for comparing and swapping the adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // compare adjacent elements and swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

    }

}
