// Pattern 43

public class Pattern_43 {
    static void printPattern(int n){
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1) {
                    System.out.print(j + " ");
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
