package Arrays;

public class ArrayPairs {
    public static void arrayPairs(int[] arr) {
        int n = arr.length;
        int totalPairs = 0;
        if (n < 2) {
            System.out.println("There are no pairs in the array");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.printf("[%d, %d] ", arr[i], arr[j]);
                totalPairs += 1;
            }
            System.out.println();
        }
        System.out.printf("There are %d pairs in the array.", totalPairs);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        arrayPairs(arr);
    }
}
