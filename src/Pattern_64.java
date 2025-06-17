public class Pattern_64 {

    static void printPattern(int n) {
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int space=n-1; space>=i; space--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%c ", letter);
                }
            }
            letter++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
