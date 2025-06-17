// Pattern 90

public class Pattern_90 {
    static void printPattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i){
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
