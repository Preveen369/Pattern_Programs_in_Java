// Pattern 78

public class Pattern_78 {
    static void printPattern(int n, int m){
        for (int i=1; i<=n; i++){
            int num = 1;
            for (int j=0; j<m; j++){
                if (j % 2 != 0){ // odd
                    System.out.print(num + " ");
                    num += 1;
                } else{ // even
                    System.out.print(i + " ");
                } 
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int inputRows = 5;
        int inputCols = 6;
        printPattern(inputRows, inputCols);
    }
}
