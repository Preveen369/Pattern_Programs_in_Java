// Pattern 24

public class Pattern_24 {
    static void printPattern(int n){
        int rows = 2 * n + 1;      
        for(int i=1; i<=rows; i++){
            int end = (i <= n) ? n-i+1 : i-n-1;
            for(int j=n; j>=end; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 3;
        printPattern(input);
    }
}
