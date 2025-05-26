public class Pattern_21 {
    static void printPattern(int n){
        for(int i=0; i<n; i++){
            for (int k = 1; k<=i; k++){
                // i no of spaces
                System.out.print("  ");      
            }
            for (int j = 1; j<=n-i; j++){
                // n-i no of numbers
                System.out.print(n-i+ " ");
            }
            System.out.println();
        }   
    }

    public static void main(String[] args){
        int input = 5;
        printPattern(input);
    }
}
