// Pattern 95

public class Pattern_95 {
    static void printPattern(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n; j++){
                if (j<=i){
                    System.out.print(i + " ");
                } else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int input=5;
        printPattern(input);
    }
}
