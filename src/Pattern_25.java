// Pattern 25
public class Pattern_25 {
    static void printPattern(int n){
        int rows = 2 * n + 1;

        for (int i = 0; i < rows; i++) {
            int start = (i <= n) ? n - i : i - n;
            for (int j = start; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 3;
        printPattern(input);
    }
}
