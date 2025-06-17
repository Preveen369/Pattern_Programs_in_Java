public class Pattern_55 {

    static void printPattern(int n){
        char letter = 'A';
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (i % 2 != 0){
                    System.out.printf("%c ", letter);
                    letter += 1;
                } else{
                    System.out.printf("%d ", j);
                }
            }
            letter = 'A';
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
