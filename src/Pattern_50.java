public class Pattern_50 {
    static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i > j) {
                    System.out.print("* ");
                } else {
                    System.out.print((n - j + 1) + " ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
