// Pattern 16

public class Pattern_16 {
    static void printPattern(int n){
        int rows = n;
        int num = 1;
        for (int i=1; i<=rows; i++){
            for (int k=0; k<=rows-i-1; k++){
                System.out.print("  ");
            }
            int cols = (2*i) - 1;
            for (int j=1; j<=cols; j++){
                System.out.print(num + " ");   
            }
            num += 2;
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input=5;
        printPattern(input);
    }
}
