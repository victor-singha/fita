import java.util.Arrays;

class Sort {
    public static void main(String args[]) {
        int arr[] = new int[] { 5, 4, 8, 3, 1, 7 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) { // for descending order arr[i] < arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}