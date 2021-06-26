public class CountPrevLarge {
    public static void main(String[] args) {

        // input: [4,9,5,3,2,10]
        // output: [0,0,1,3,4,0]

        int a[] = new int[] { 4, 9, 5, 3, 2, 10 };
        int b[] = new int[a.length];

        for (int i = 1; i < a.length; i++) {
            int count = 0;
            b[i] = count;
            int trace = i;
            while (trace != 0) {
                if (a[i] < a[i - trace]) {
                    count++;
                    b[i] = count;
                }
                trace--;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
