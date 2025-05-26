public class Pattern_62 {
    static void printPattern(int n){
        for (int i = 5; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (j == i || j == n - i + 1) {
                    System.out.print(i + " ");
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
