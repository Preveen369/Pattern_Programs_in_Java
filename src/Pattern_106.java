// Pattern 106

public class Pattern_106 {
    static void printPattern(int n){
        int rows = n;
        for (int i = 1; i<=rows; i++){
            int num = 2 * i - 1;
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
