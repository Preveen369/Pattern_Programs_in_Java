// Pattern 33

public class Pattern_33 {
    static void printPattern(int n) {
        int rows = 2 * n - 1;
        for (int i = 1; i <= rows; i++) {
            int start = (i <= n) ? i : rows - i + 1;
            for (int k = 1; k <= n - start; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= start; j++) {
                System.out.print((j + Math.abs(n - i)) + "   ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
