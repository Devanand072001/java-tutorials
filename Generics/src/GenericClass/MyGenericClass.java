package GenericClass;

public class MyGenericClass <Thing> {
    Thing value;

    public MyGenericClass(Thing value) {
        this.value = value;
    }

    public Thing getValue() {
        return value;
    }
}
