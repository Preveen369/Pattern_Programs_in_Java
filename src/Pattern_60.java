public class Pattern_60 {
    static void printPattern(int n){
        // Initialize the starting number
        int start = 20;

        // Loop through the rows, reducing the number of elements per row
        for (int row = n; row >= 1; row--) {
            // Print the numbers for each row
            for (int num = start - row + 1; num <= start; num++) {
                System.out.print(num + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
            // Update the start for the next row
            start -= row;   
        }
    }
    
    public static void main(String[] args) {
        int input = 4; 
        printPattern(input);
    }
}