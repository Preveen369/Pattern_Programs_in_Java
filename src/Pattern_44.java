// Pattern 44

public class Pattern_44 {
    static void printPattern(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
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
