public class Pattern_28 {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int k=0; k<=n-i-1; k++){
                System.out.print("  ");
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j + " ");
            }
            for (int j=0; j<=i-1; j++){
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
