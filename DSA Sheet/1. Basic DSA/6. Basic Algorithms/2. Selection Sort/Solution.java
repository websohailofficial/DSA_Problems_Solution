/*Problem Link: https://www.codingninjas.com/studio/problems/selection-sort_981162?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav */

public class Solution {
    public static void selectionSort(int arr[], int n) {
        // loop from start to the 2nd last element
        for (int i = 0; i < n - 1; i++) {
            // set the smallest index to the current index
            int smallestIndex = i;

            // find the smallest number in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                // if the current number is smaller than the one at the smallest index
                if (arr[j] < arr[smallestIndex]) {
                    // update the smallest index
                    smallestIndex = j;
                }
            }

            // swap the found smallest number with the first number in the unsorted part
            if (smallestIndex != i) {
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }
        }
    }
}