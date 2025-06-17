// Pattern 97

public class Pattern_97 {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(j + " ");
            }
            for (int j=1; j<i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        } 
    }

    public static void main(String[] args){
        int input = 4;
        printPattern(input);
    }
}
