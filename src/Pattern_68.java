public class Pattern_68 {
    static void printPattern(int n) {
        char letter = 'E';
        String space = "";
        for (int i = n; i >= 1; i--) {
            System.out.print(space);
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%c ", letter);
                }
            }
            space += "  ";
            letter -= 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
