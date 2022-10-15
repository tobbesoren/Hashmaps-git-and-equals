import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        // .put() is used for creating a key - value pair
        myMap.put("Tobbe", 12);
        myMap.put("Zara", 42);
        myMap.put("Lillebror", 6645);
        myMap.put("Stinky", 549);

        System.out.println(myMap.get("Lillebror"));

        // Looping through all keys, printing key and value
        for(String key: myMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + myMap.get(key));
        }

        // .put() is also used to update an existing key
        myMap.put("Lillebror", 333);

        // Looping through all keys, printing updated key and value
        for(String key: myMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + myMap.get(key));
        }

        // Printing hashmap
        System.out.println(myMap);

        // Delete operation. Returns removed value! (It will print 12)
        System.out.println(myMap.remove("Tobbe"));
    }
}