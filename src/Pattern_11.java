public class Pattern_11 {
    static void printPattern(int n){
        for (int i=n; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.print(i + "\n");
        }
    }
    public static void main(String[] args){
        int input=5;
        printPattern(input);
    }
}
