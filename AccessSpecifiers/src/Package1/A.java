package Package1;

public class A {
    //can be accessed inside the package only
    String defaultVar = "This is default";
    public String publicVar = "This is public";
    protected String protectedVar = "This is protected";
    private String privateVar = "This is private";

    public String getPrivateVar() {
        return privateVar;
    }
    public String getProtectedVar(){
        return protectedVar;
    }
}
