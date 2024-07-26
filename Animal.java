class Animal {
    String name;
    String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void makeSound(){
        System.out.println(name + " says: " + sound);
    }
    void playing(){
        System.out.println(name + " is playing "  );

    }


    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", "Woof");
        Animal dinosaur = new Animal("Rex", "ROAR");

        dog.makeSound();
        dinosaur.makeSound();


    }
}
    