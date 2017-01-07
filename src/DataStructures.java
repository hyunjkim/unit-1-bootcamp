import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 * 2. Most Frequent Element
 * <p>
 * Write a method called mostFrequentElement that takes an ArrayList of Integers
 * and finds the most frequently occurring element in the ArrayList.
 * At the end print the element and its number of occurrences.
 * If there is more than one such element, any one of them may be printed.
 */
public class DataStructures {

  public static void main(String args[]) {
    printFiveCats();
    mostFrequestElement();
  }

  public DataStructures() {
    super();
  }

  public static void printFiveCats() {
    ArrayList<String> fiveCats = new ArrayList<>();
    HashMap<String, String> catInfo = new HashMap<>();
    String[] furColor = {"black", "white", "yellow" , "gray", "brown"};
    Random rand = new Random();

    fiveCats.add("Joe");
    fiveCats.add("Smith");
    fiveCats.add("Jane");
    fiveCats.add("Doe");
    fiveCats.add("Hyunjoo");

    Iterator<String> itrCats = fiveCats.iterator();
    int i = rand.nextInt(furColor.length-1);
    while (itrCats.hasNext()) {
      System.out.print(itrCats.next() + " ");
      catInfo.put(itrCats.next(),furColor[i]);

      System.out.println(catInfo);
    }

  }

  public static void mostFrequestElement() {

  }
}
