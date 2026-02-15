package myanimals;

public class Animal {
    public static int numofAnimals = 0;

    public Animal(){
        numofAnimals++;
        System.out.println("Animals created: " + numofAnimals);
    }
}
