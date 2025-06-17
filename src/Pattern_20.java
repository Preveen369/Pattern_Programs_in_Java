// Pattern 20

public class Pattern_20 {
    static void printPattern(int n){
        for (int i = 1; i<=n; i++){
            for (int k = 0; k<=n-i-1; k++){
                System.out.print("  ");
            }
            for (int j = 1; j<i; j++){
                System.out.print(j + " ");
            }
            for (int j=i; j>=1; j--){
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
