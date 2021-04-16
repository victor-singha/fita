public class BinarySearch {
    public static void main(String args[]) {
        // sorted array
        int arr[] = new int[] { 1, 4, 8, 11, 43 };
        int n = arr.length;
        int key = 11;

        int index = binarySearch(arr, n, key);
        System.out.println(index);
    }

    static int binarySearch(int arr[], int n, int key) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
