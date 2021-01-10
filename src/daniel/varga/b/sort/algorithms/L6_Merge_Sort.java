package daniel.varga.b.sort.algorithms;

import java.util.Arrays;

public class L6_Merge_Sort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        L0_Helper_Methods.printResult(intArray);
    }

    public static void mergeSort(int[] input, int start, int end) {

        // Only return if there's one element in the array.
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        int[] sample = Arrays.copyOfRange(input, 0, end);
        int returnIfOne = end - start;

        // Sort left array.
        mergeSort(input, start, mid);
        // Sort right array.
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        // input[mid - 1 - last element of the left partition; input[mid] - first element of the right partition
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        // Traversing until either the left or the right array is finished.
        while (i < mid && j < end) {
            /*
             Compare current element in left array with current element in right array, and write the smaller of the
             two into the temp array, and increment the temp index.
            */
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
