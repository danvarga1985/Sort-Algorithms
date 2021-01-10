package daniel.varga.b.sort.algorithms;

public class L1_Bubble_Sort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    L0_Helper_Methods.swap(intArray, i, i + 1);
                }
            }
        }

        L0_Helper_Methods.printResult(intArray);
    }

}
