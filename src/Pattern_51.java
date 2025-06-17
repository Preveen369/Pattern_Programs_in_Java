// Pattern 51

public class Pattern_51 {
    static void printPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int space = n - i; space > 0; space--) {
                System.out.print("    ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.printf("%2d  ", num);
                num = nextValue(num, i, j);
            }
            System.out.println();
        }
    }

    // Corrected logic for generating the pattern
    static int nextValue(int current, int row, int position) {
        if (row == 1) return current + 2;
        if (row == 2) return (position % 2 == 0) ? current + 5 : current + 3;
        if (row == 3) return (position == 3) ? current * 4 : current + 2;
        return current + 1;
    }

    public static void main(String[] args) {
        int input = 3;
        printPattern(input);
    }
}
