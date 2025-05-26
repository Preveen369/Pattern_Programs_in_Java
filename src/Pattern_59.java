public class Pattern_59 {
    static void printPattern(int n){
        int rows = n;
        int start = 1;
        for (int i = 1; i <= rows; i++){
            int num = start;
            for (int j = i; j >= 1; j--){
                System.out.print(num + " ");
                num -= 1;
            }   
            System.out.println();
            start += i+1;
        }
    }

    public static void main(String[] args){
        int input = 4;
        printPattern(input);
    }
}
