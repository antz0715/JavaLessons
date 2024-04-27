public class FavoriteFoods {
    public static void main(String[] args) {
        // Declare and initialize an array of favorite foods
        String[] foods = {"Pizza", "Ice Cream", "Burger", "Sushi", "Pasta"};

        // Print out the favorite foods
        System.out.println("Here are my favorite foods:");
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + ". " + foods[i]);
        }
    }
}
