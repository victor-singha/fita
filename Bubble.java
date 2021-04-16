import java.util.*;

class Bubble {
    public static void main(String args[]) {
        int arr[] = new int[] { 6, 3, 4, 5, 1 };
        int n = arr.length;
        int counter = 1;
        while (counter < n) {
            for (int i = 0; i < n - counter; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }
}