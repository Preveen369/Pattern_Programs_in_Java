// Pattern 49

public class Pattern_49 {
    static void printPattern(int n){
        int rows = n;
        for (int i = 1; i<=rows; i++){
            int num = (i % 2 != 0) ? 1 : 2;
            for (int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num += 2;
            }
            
            System.out.println();
        } 
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
