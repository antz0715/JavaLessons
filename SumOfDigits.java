// Input: 123
// Output: 6 (1 + 2 + 3)
public class SumOfDigits {
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));  // Output: 6
    }
}
