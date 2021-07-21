public class Main{
    public static void main(String[] args) {
        String name = " devanand v    ";
//        name = name.trim();
//        name = name.toUpperCase();
        /*name = name.trim().toUpperCase();
        System.out.println(name);*/
        String[] Name = name.trim().split(" ");
        Name[0] = Name[0].trim().substring(0,1).toUpperCase().concat(Name[0].substring(1)) ;
        Name[1] = Name[1].trim().substring(0,1).toUpperCase().concat(Name[1].substring(1));
        name = Name[0].concat(" ").concat(Name[1]);
        System.out.println(name);
    }
}
