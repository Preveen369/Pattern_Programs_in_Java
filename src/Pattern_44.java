public class Pattern_44 {
    static void printPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print((i + j + 1) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 4;
        printPattern(input);
    }
}
