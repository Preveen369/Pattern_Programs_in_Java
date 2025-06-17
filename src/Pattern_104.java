// Pattern 104

public class Pattern_104 {
    static void printPattern(int n){
        int rows = n;
        for (int i = 1; i<=rows; i++){
            for (int k = 1; k<=n-i; k++){
                System.out.print("  ");
            } 
             
            int num = i;
            for (int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num += 1;
            }

            num -= 2;
            for (int j=1; j<i; j++){
                System.out.print(num + " ");
                num -= 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 4;
        printPattern(input);
    }
}
