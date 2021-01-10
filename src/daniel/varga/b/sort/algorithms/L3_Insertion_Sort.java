package daniel.varga.b.sort.algorithms;

public class L3_Insertion_Sort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int insertPosition;

            for (insertPosition = firstUnsortedIndex; insertPosition > 0 && intArray[insertPosition - 1] > newElement;
                 insertPosition--) {
                intArray[insertPosition] = intArray[insertPosition - 1];
            }

            intArray[insertPosition] = newElement;
        }

        L0_Helper_Methods.printResult(intArray);
    }
}
