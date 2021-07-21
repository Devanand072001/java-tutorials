public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student devanand = new Student("Devanand", "191cs151");
        Student bob = (Student) devanand.clone();

        devanand.display();
        bob.display();
    }
}
