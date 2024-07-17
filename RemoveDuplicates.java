// Input: [1, 2, 2, 3, 4, 4, 5]
// Output: [1, 2, 3, 4, 5]
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] numbers) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }
        int[] result = new int[uniqueNumbers.size()];
        int index = 0;
        for (int number : uniqueNumbers) {
            result[index++] = number;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(numbers)));  // Output: [1, 2, 3, 4, 5]
    }
}
