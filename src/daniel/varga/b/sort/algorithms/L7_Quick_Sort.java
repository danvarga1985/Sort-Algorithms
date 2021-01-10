package daniel.varga.b.sort.algorithms;

public class L7_Quick_Sort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        L0_Helper_Methods.printResult(intArray);
    }

    public static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {

        // This is using the first element as the pivot.
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // Note: empty loop body - used for decrementing j.
            while (i < j && input[--j] >= pivot) ;

            // Put elements less than the pivot to the left side of the pivot.
            if (i < j) {
                input[i] = input[j];
            }

            // Note: empty loop body - used for incrementing i.
            while (i < j && input[++i] <= pivot) ;

            // Put elements greater than the pivot to the right side of the pivot.
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;

        return j;
    }
}
