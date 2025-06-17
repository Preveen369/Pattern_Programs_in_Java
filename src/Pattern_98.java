// Pattern 98

public class Pattern_98 {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int rowLength = n - i + 1;
            if (i % 2 != 0) {   // odd row -> increasing order
                for (int j = 1; j <= rowLength; j++) {
                    System.out.print(j + " ");
                }
            } else {    // even row -> decreasing order
                for (int j = rowLength; j >= 1; j--) {
                    System.out.print(j + " ");
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
