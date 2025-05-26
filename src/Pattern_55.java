public class Pattern_55 {
    static void printPattern(int n){
        int rows = n;
        for (int i = 1; i<=rows; i++){
            for (int k = 1; k<=n-i; k++){
                System.out.print("  ");
            }
            
            int num = 1;
            for (int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num *= 2;
            }

            num /= 4;
            for (int j=i-1; j>=1; j--){
                System.out.print(num + " ");
                num /= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
