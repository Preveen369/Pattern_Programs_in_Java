// Pattern 80

public class Pattern_80 {
    static void printPattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i>=j){
                    System.out.print(i + " ");
                } else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        } 
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
