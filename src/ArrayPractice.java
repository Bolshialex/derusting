public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arrString = new String[4]; 

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arrString[0] = "Java";
    arrString[1] = "HTML";
    arrString[2] = "CSS";
    arrString[3] = "C#";

    // Get the value of the array at index 2
    System.out.println(arrString[2]);

    // Get the length of the array
    System.out.println(arrString.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < arrString.length; i++){
      System.out.println(arrString[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for(String str : arrString){
      System.out.println(str);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
