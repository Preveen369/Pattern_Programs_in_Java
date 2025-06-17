// Pattern 38

public class Pattern_38 {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int currentRow = n-i+1;

            // Printing spaces for alignment
            for (int j = n; j > currentRow; j--) {
                System.out.print("  ");
            }

            int endCol = 2 * currentRow - 1;
            // Printing numbers with spaces in between
            for (int j = 1; j <= endCol; j++) {
                if (j == 1 || j == endCol) {
                    System.out.print(currentRow + " ");
                } else {
                    System.out.print("  ");
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
