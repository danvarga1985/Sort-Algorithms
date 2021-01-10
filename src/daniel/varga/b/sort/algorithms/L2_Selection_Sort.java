package daniel.varga.b.sort.algorithms;

public class L2_Selection_Sort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            L0_Helper_Methods.swap(intArray, lastUnsortedIndex, largest);
        }

        L0_Helper_Methods.printResult(intArray);
    }
}
