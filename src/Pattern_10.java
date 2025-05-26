public class Pattern_10 {
    static void printPattern(int n){
        for (int i=n; i>=0; i--){
            System.out.print(i + " ");
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
