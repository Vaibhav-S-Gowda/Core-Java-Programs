import java.util.Scanner;

class LC1317 {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;

            // check if both a and b do not contain 0
            if (!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")) {
                return new int[]{a, b}; // return the pair immediately
            }
        }
        return new int[]{}; // fallback (should never reach here)
    }

    public static void main(String... args) {
        LC1317 obj = new LC1317();
        Scanner scan = new Scanner(System.in);
        int[] result = obj.getNoZeroIntegers(scan.nextInt());

        // print the result properly
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
