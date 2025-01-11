import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> stringMap = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    stringMap.put("Water", 100);
    stringMap.put("Coffee", 45);
    stringMap.put("Soda", 10);

    // Get the value associated with a given key in the Map
    System.out.println(stringMap.get("Soda"));

    // Find the size (number of key/value pairs) of the Map
    System.out.println(stringMap.size());

    // Replace the value associated with a given key (the size of the Map should not change)
    stringMap.replace("Coffee", 30);

    // Check whether the Map contains a given key
    System.out.println(stringMap.containsKey("Water"));

    // Check whether the Map contains a given value
    System.out.println(stringMap.containsValue(10));

    // Iterate over the keys of the Map, printing each key
    for(String key : stringMap.keySet()){
      System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    for(int value : stringMap.values()){
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    for(String key : stringMap.keySet()){
      System.out.println("Key: " + key + " Value: " + stringMap.get(key));
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
