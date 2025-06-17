// Pattern 9

public class Pattern_9 {
    static void printPattern(int n){
        for (int i=n; i>=1; i--){
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
