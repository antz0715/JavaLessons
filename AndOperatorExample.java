public class AndOperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Using && (AND) operator
        boolean result1 = (a < b) && (b < c); // true && true -> true
        boolean result2 = (a > b) && (b < c); // false && true -> false

        System.out.println("Result1: " + result1); // Output: Result1: true
        System.out.println("Result2: " + result2); // Output: Result2: false
    }
}
