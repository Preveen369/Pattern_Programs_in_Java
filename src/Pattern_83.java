// Pattern 83

public class Pattern_83 {
    static void patternPrint(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n; j++){
                if (i>=j){
                    System.out.print(j + " ");
                } else{
                    System.out.print( "* ");
                } 
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int input = 5;
        patternPrint(input);
    }
}
