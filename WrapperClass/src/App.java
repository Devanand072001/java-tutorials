public class App {
    public static void main(String[] args) {

        /*
         * Integer sampleInteger = new Integer(10);
         * Integer sampleInteger2 = newInteger("10");
         *
         *
         * Double sampleDouble = new Double(3.14);    //these mthods are remove since java 9
         * Double sampleDouble2 = new Double("3.14");
         *
         * Boolean sampleBoolean = new Boolean(true);
         * Boolean sampleBoolean2 = new Boolean("true");
         * Boolean sampleBoolean3 = new Boolean(false);
         *  Boolean sampleBoolean4 = new Boolean("false");
         *  System.out.println(sampleInteger);
         */
        int intNum = 10;
        String stringNum = "50";
        Integer intObj = Integer.valueOf(intNum);
        Integer intObj2 = Integer.valueOf(stringNum);

        int parseInt = Integer.parseInt(stringNum);// string to integer conversion
        String toString = Integer.toString(33);// integer to string conversion
        System.out.println(parseInt);
        System.out.println(toString);

        int intDouble = intObj2.intValue();// convert wrapper to primitive data type
        System.out.println(intDouble);
        System.out.println(intObj);
        System.out.println(intObj2);

        Boolean boolObj = Boolean.valueOf(true);
        Boolean boolObj2 = Boolean.valueOf("true");
        Boolean boolObj3 = Boolean.valueOf("false");
        Boolean boolObj4 = Boolean.valueOf(false);
        Boolean boolObj5 = Boolean.valueOf("abc");// returns false when the parameter passed is other than "true".
        System.out.println(boolObj);
        System.out.println(boolObj2);
        System.out.println(boolObj3);
        System.out.println(boolObj4);
        System.out.println(boolObj5);

        char b = 'g';// character must be with single quotes
        Character sampleCharacter = Character.valueOf('*');// char wrapper class
        char sampleString = sampleCharacter.charValue();// wrapper class to primitive class
        System.out.println(sampleString + " " + b);


    }
}
