package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int first = 0;
        int n = arr.length;
        int last = n - 1;

        while (first <= last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        System.out.printf("The reversed array is: %s\n", Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        // System.err.printf("arr[%d] = %d\n", i, arr[i]);
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.printf("The initial array is: %s\n", Arrays.toString(arr));
        reverseArray(arr);
    }
}
