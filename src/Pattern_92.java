// Pattern 92

public class Pattern_92 {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (j<i){
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
