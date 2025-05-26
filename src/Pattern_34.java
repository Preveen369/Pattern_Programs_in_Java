public class Pattern_34 {
    static void printPattern(int n){
        for (int i=1; i<=n+1; i++){
            for (int k=0; k<=n-i; k++){
                System.out.print("  ");
            }
            for (int j=n; j>=n-i+1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int k=0; k<i; k++){
                System.out.print("  ");
            }
            for (int j=n; j>=i; j--){
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
