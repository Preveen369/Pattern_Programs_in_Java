public class Pattern_58 {
    static void printPattern(int n) {
        char letter = 'E';
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.printf("%c ", letter);
                } else {
                    System.out.printf("%d ", i);
                }
            }
            letter -= 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
