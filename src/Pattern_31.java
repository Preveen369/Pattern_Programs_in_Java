// Pattern 31

public class Pattern_31 {
    static void printPattern(int n){
        for (int i=n; i>=1; i--){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");   
            }
            for (int j=i; j>=1; j--){
                System.out.print(j + " ");   
            }
            System.out.println();
        }
    } 

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
