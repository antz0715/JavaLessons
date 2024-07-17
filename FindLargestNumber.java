// Input: [3, 5, 7, 2, 8]
// Output: 8
public class FindLargestNumber {
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        System.out.println(findLargest(numbers));  // Output: 8
    }
}
