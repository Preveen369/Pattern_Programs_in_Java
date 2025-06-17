// Pattern 93

public class Pattern_93 {
    static void printPattern(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<i; j++){
                if (j<=i){
                    System.out.print(j + " ");
                } else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int input=5;
        printPattern(input);
    }
}
