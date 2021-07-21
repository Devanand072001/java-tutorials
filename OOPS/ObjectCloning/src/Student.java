public class Student implements Cloneable {
    String name;
    String rollno;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("Rollno: " + rollno);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
