public class Main {
    /*
     * Inner class:
     *   A class inside other class.
     *   Used for limiting class inside a scope.
     *   Usually private,but not compulsory.
     *   Helps in grouping classes belongs to other class.
     *   Useful for costum listeners.*/
    public static void main(String[] args) {
        Outside out = new Outside();
        //outside class. inside class = outside class object. inside class object
        Outside.Inside in = out.new Inside();

        System.out.println(out.outsideVar+" "+in.insideVar);
        in.display();
    }
}
