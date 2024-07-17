// Input: "hello world"
// Output: 3 (e, o, o)
public class CountVowels {
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("hello world"));  // Output: 3
    }
}
