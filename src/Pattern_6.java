public class Pattern_6 {
    static void printPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++){
                    // print columns
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 3;
        printPattern(input);
    }
}
