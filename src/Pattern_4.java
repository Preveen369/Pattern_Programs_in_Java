// Pattern 4

public class Pattern_4 {
    static void printPattern(int n) {
        for (int i=1; i<n+1; i++){
            for (int j=0; j<n; j++){
                System.out.print(n-j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }    
}
