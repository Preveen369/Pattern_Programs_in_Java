// Pattern 21

public class Pattern_21 {
    static void printPattern(int n){
        int rows = n;
        for (int i = rows;  i>=1; i--){
            for (int k=n-i; k>=1; k--){
                System.out.print("  ");
            }
            int cols = (2*i)-1;
            for (int j=cols; j>=1; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 4;
        printPattern(input);
    }
}
