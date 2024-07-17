// Input: "racecar"
// Output: true
// Input: "hello"
// Output: false
public class PalindromeCheck {
    public static boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));  // Output: true
        System.out.println(isPalindrome("hello"));    // Output: false
    }
}
