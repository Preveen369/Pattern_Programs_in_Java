// Pattern 11

public class Pattern_11 {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
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
