import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String faveChar = "Lines";

    // Find the length of the string
    int stringLength = faveChar.length();
    System.out.println(stringLength);

    // Concatenate (add) two strings together and reassign the result
    faveChar = faveChar + " Strings";
    System.out.println(faveChar);

    // Find the value of the character at index 3
    System.out.println(faveChar.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(faveChar.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(Character ch : faveChar.toCharArray()){
      System.out.println(ch);
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("BRUBRUBRU");
    stringList.add("DUHDUHDUH");
    stringList.add("BAHBAHBAH");
    stringList.add("RUHRUHRUH");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinString = String.join(", ", stringList);
    System.out.println(joinString);

    // Check whether two strings are equal
    if (faveChar.equals(stringList.get(2))) {
      System.out.println(true);
    }else{
      System.out.println(false);
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
