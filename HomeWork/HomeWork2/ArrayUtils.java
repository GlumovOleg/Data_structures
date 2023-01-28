package HomeWork.HomeWork2;

import java.util.Random;

public class ArrayUtils {

    private static Random random = new Random();

    public static int[] prepareArray() {
        int[] arr = new int[random.nextInt(15) + 5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
