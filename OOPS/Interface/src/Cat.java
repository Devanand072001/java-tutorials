public class Cat implements Prey, Predator {

    @Override
    public void chase() {
        System.out.println("Cat is chasing");

    }

    @Override
    public void run() {
        System.out.println("Cat is running");

    }

}
