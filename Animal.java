// Define the Animal class with basic attributes and methods
class Animal {
    String name;  // Name of the animal
    String sound; // Sound the animal makes

    // Constructor to initialize the Animal object
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Method to output the sound the animal makes
    void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", "Woof");  // Create an Animal object for a dog
        Animal cat = new Animal("Whiskers", "Meow");  // Create an Animal object for a cat

        // Call the makeSound method on each Animal object
        dog.makeSound();
        cat.makeSound();
    }
}
