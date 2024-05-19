public class TrianglePattern {
    public static void main(String[] args) {
        int numberOfRows = 10;  // Set the number of rows for the triangle

        // Loop through each row
        for (int i = 1; i <= numberOfRows; i++) {
            // For each row, print stars equal to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
//The outer for loop manages the rows.
// It runs from 1 up to and including the number of rows specified (numberOfRows).

// The inner for loop prints the stars. 
// For each iteration of the outer loop, the inner loop runs as many times as the current row number (i).
// This means that the first row will have one star, the second row two stars, and so on.