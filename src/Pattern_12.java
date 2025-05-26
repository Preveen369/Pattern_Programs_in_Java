public class Pattern_12 {
    static void printPattern(int n) {
        for (int i=1; i<n+1; i++){
            for (int j=1; j<n+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int input = 5;
        printPattern(input);
    }
}
