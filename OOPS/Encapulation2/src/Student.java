public class Student {
    private String name;
    private String rollNO;
    private String department;

    public Student(String name, String rollNO, String department) {
        this.name = name;
        this.rollNO = rollNO;
        this.department = department;
    }

    //    getters
    public String getName() {
        return name;
    }

    public String getRollNO() {
        return rollNO;
    }

    public String getDepartment() {
        return department;
    }

//    setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNO(String rollNO) {
        this.rollNO = rollNO;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
