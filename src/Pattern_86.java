// Pattern 86

public class Pattern_86 {
    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>j)
                System.out.print("* ");
                else{
                    System.out.print((n-i) + " ");
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
