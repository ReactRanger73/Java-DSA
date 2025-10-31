package Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int[] arr = { 33, 7, 12, 32, 55, 18, 26 };
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }
        System.out.printf("The largest number in the array is %d at index %d", largest, index);
    }
}