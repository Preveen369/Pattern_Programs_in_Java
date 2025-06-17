// Pattern 87

public class Pattern_87 {
    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>j)
                System.out.print("* ");
                else{
                    System.out.print((n-j) + " ");
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
