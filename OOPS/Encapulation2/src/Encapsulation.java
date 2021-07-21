public class Encapsulation {
    /*
     * Encapsulation:
     *   Encapsulation is a process of hiding sensitive data from the users.
     *   Bundling of related methods and fields together.
     *   variable of a class will be hidden to other class, it can be
     * accessed only through the methods of their class.
     * Procedure:
     *   Declare the variable of a class as private.
     *   use getter() and setter() to modify or access the variable.
     *   The data is only readable by using getter().
     *   The data is only writable by using setter().
     * */
    public static void main(String[] args) {
        var student = new Student("Devanand", "191CS151", "CSE");
//        System.out.println(student.name);
        System.err.println("------Getters-----");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll no: " + student.getRollNO());
        System.out.println("Department: " + student.getDepartment());

        student.setName("Bob");
        student.setRollNO("195SD111");
        student.setDepartment("SD");

        System.out.println("----Getters after setters----");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll no: " + student.getRollNO());
        System.out.println("Department: " + student.getDepartment());

    }
}
