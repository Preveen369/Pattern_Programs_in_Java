public class Pattern_53 {
    static void printPattern(int n) {
        int num = 1;
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n-i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i % 2 != 0){
                    System.out.printf("%d ", num);
                    num++;
                    if (num > 9){
                        num = 1;
                    }
                } else{
                    System.out.printf("%c ", letter);
                    letter++;
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
