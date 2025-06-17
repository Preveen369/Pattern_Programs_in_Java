// Pattern 14

public class Pattern_14 {
    static void printPattern(int n){
        for (int i=0; i<n; i++){
            for (int k=1; k<=i; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=n-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
