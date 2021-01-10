package daniel.varga.b.sort.algorithms;

public class L0_Helper_Methods {

    public static void printResult(int[] arr) {

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
