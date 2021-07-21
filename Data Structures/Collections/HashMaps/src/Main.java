import java.util.HashMap;

public class Main {
    /*
     * 1) HashMap implements  the Map interface
     * 2) Same as ArrayList, but with key-value pairs (same as dictionary in python)
     * 3) Stores objects, need to use Wrapper Class.
     * ex: (name, email), (username, userId), (country, capital).
     */
    public static void main(String[] args) {
        /* HashMap<Object, Object> countries = new HashMap<>();*/
        /* HashMap<String, int> countries = new HashMap<>();*/
        /* HashMap<Double, int> countries = new HashMap<>();*/
        HashMap<String, String> countries = new HashMap<>();

        //add key-value
        countries.put("USA", "Washington");
        countries.put("India", "Delhi");
        countries.put("China", "Beijing");
        countries.put("Russia", "Moscow");
        System.out.println(countries);
        System.out.println("Size of HashMap: " + countries.size());

        //remove key-value
        countries.remove("China", "Beijing");
        System.out.println(countries);
        //getting by key
        System.out.println("Key sets: " + countries.keySet());
        System.out.println("value of USE: " + countries.get("USA"));
        //getting by value
        System.out.println("Values: " + countries.values());
        //replacing values
        countries.replace("USA", "Hell's Kitchen");
        //or
        countries.replace("India", "Delhi", "Tamil Nadu");
        System.out.println(countries.values());
        //searching
        System.out.println(countries.containsKey("Thailand"));
        System.out.println(countries.containsValue("Mumbai"));
        //HasMap iteration

        for (String i : countries.keySet()) {
            System.out.println(i + " : " + countries.get(i));
        }

    }
}
