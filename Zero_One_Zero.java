public class Zero_One_Zero {
    public static void main(String[] args) {
        // input 3
        // output 0123210
        // input 5
        // output 01234543210
        int n = 3, j = 1;
        for (int i = 0; i <= n * 2; i++) {
            if (i <= n) {
                System.out.println(i);
            } else {
                System.out.println(n - j);
                j++;
            }
        }
    }

}
