package daniel.varga.b.sort.algorithms;

import java.util.*;

public class L10_Bucket_Sort {
    public static void main(String[] args) {

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        L0_Helper_Methods.printResult(intArray);
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // Using linked lists for the buckets.
//            buckets[i] = new LinkedList<>();

            // Using vector for the buckets.
//            buckets[i] = new Vector<>();

            // Using arraylist for the buckets.
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket: buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]) {
                input[j++] = value;
            }
        }
    }

    public static int hash(int value) {
        return value / (int) 10;
    }
}
