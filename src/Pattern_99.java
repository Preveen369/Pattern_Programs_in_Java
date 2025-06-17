// Pattern 99

public class Pattern_99 {
    static void printPattern(int n){
        int rows = 2 * n + 1;
        for (int i=0; i<rows; i++){
            int end = (i<=n) ? n-i : i-n;
            for (int j=0; j<=end; j++){
                System.out.print(j + " ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 4;
        printPattern(input);
    }
}
