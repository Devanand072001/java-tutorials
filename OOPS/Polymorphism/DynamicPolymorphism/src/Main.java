import java.util.Scanner;

public class Main {
    static Scanner animalScanner = new Scanner(System.in);

    public static void main(String[] args)  {
        Animal animal;

        System.out.println("choose the animal:");
        System.out.println("enter '1' for dog and '2' for cat: ");
        int animalChoice = animalScanner.nextInt();
        if (animalChoice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (animalChoice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}
