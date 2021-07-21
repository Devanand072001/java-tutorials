package GenericClass;

public class GenericClass {
    public static void main(String[] args) {
        MyIntClass myInt = new MyIntClass(2);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharClass myChar = new MyCharClass('*');
        MyStringClass myString = new MyStringClass("D");

        System.out.println("Normal class");
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

//  Generic class
      /*
      Eg:
      ArrayList<Integer> list = new ArrayList<>();
      HashMap<Integer, String> hashMap = new HashMap<>();
      */
        System.out.println("Generic class");
        MyGenericClass<Integer> integerVar = new MyGenericClass<>(5);
        MyGenericClass<Double> doubleVar = new MyGenericClass<>(4.4);
        MyGenericClass<Character> charVar = new MyGenericClass<>('@');
        MyGenericClass<String> stringVar = new MyGenericClass<>("hello world");

        System.out.println(integerVar.getValue());
        System.out.println(doubleVar.getValue());
        System.out.println(charVar.getValue());
        System.out.println(stringVar.getValue());

        SampleGeneric<String, Integer> student = new SampleGeneric<>("Devanand",19);
        student.Display();
    }
}
class SampleGeneric <Name,Age>{
    Name name;
    Age age;

    public SampleGeneric(Name name, Age age) {
        this.name = name;
        this.age = age;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}