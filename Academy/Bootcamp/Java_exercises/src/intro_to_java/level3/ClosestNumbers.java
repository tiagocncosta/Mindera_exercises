package intro_to_java.level3;

import java.lang.reflect.Array;

public class ClosestNumbers {

    private static final int[] NUMBERS = {23, 45, 67, 123, 26, 33, 31, 4};

    public static void main(String[] args) {
        int[] result = calculateClosestNumbers(NUMBERS); // should return [33,31]

    }

    // Implement a method that takes an array and returns an array with
    // the two consecutive items that have the smallest difference between them
    private static int[] calculateClosestNumbers(int[] numbers) {
        int a[] = {NUMBERS[0], NUMBERS[1]};
        for (int i = 0; i < NUMBERS.length - 1; i++) {
            if (Math.abs(NUMBERS[i + 1] - NUMBERS[i]) < Math.abs(a[1] - a[0])) {
                a[0] = NUMBERS[i];
                a[1] = NUMBERS[i + 1];

            }
        }
        System.out.println(a[0]);
        System.out.println(a[1]);
        return a;
    }
}
