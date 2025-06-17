// Pattern 46
// Pattern to print fibonacci pyramid (type - 2)
public class Pattern_46 {
    static void printPattern(int n) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(num1 + " ");
                } else if (j == 2) {
                    System.out.print(num2 + " ");
                } else {
                    int num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3;
                    System.out.print(num3 + " ");
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