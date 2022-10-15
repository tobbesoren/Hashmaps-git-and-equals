import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Tobbe", 12);
        myMap.put("Zara", 42);
        myMap.put("Lillebror", 871);
        myMap.put("Stinky", 549);

        System.out.println(myMap.get("Lillebror"));
    }
}