package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 22, 19, 7, 33, 14 };
        int key = 33;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.printf("Element found at index %d", index);
        }
    }
}