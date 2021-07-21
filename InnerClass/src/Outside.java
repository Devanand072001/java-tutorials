public class Outside {
    String outsideVar = "Hello";
    public class Inside{
        String insideVar = "World";
        public void display(){
            System.out.println(outsideVar+" "+insideVar);
        }
    }
}
