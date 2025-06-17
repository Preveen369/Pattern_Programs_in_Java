public class Pattern_54 {

    static void printPattern(int n){
        char letter = 'A';
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (i % 2 != 0){
                    System.out.printf("%c ", letter);
                } else{
                    System.out.printf("%d ", i);
                }
            }
            letter += 1;
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
