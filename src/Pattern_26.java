public class Pattern_26 {
    static void printPattern(int n){
        for (int i=0; i<=n; i++){
            for (int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            for (int j=n-i; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int k=0; k<i; k++){
                System.out.print("  ");
            }
            for (int j=i; j<=n; j++){
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
