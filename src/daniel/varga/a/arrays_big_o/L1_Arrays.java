package daniel.varga.a.arrays_big_o;

public class L1_Arrays {

    public static void main(String[] args) {

        // Initialize arrays
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -534;


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("\n*****\n");

        /********************************************************************************************************/

        // Retrieve values
        int[] intArray2 = new int[7];

        intArray2[0] = 20;
        intArray2[1] = 35;
        intArray2[2] = -15;
        intArray2[3] = 7;
        intArray2[4] = 55;
        intArray2[5] = 1;
        intArray2[6] = -534;

        int index = -1;

        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
            if (intArray2[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

        /********************************************************************************************************/

    }
}
