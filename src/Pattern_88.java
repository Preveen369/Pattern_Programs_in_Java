// Pattern 88

public class Pattern_88 {
    static void printPattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0){
                    System.out.print(i + " ");
                } else{
                    System.out.print("* ");
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
