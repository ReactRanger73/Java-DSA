package Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 19, 26, 33, 45, 73 };
        int key = 33;
        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.printf("Element %d found at index %d%n", key, result);
        else
            System.out.printf("Element %d not found%n", key);
    }
}
