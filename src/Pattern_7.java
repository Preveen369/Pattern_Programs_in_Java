// Pattern 7

public class Pattern_7 {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
