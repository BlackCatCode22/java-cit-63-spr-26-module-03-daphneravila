package myanimals;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting count: " + Animal.numofAnimals);

        Cat myCat = new Cat();
        myCat.meow();

        Dog myDog = new Dog();
        myDog.bark();

        System.out.println("Final count: " + Animal.numofAnimals);
    }
}
