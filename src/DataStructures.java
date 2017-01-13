import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {

        HashMap<String, Integer> catInfo = printFiveCats();
        mostFrequestElement(catInfo);

    }

    public DataStructures() {
        super();
    }

    public static HashMap<String, Integer> printFiveCats() {
        HashMap<String, Integer> catInfo = new HashMap<>();
        List<String> catNames = new ArrayList<>();
        Cat cat = new Cat();
        Random rand = new Random();

        catNames.add("Joe");
        catNames.add("Smith");
        catNames.add("Jane");
        catNames.add("Doe");
        catNames.add("Hyunj");
//        catNames.add("Kim");
//        catNames.add("Katie");
//        catNames.add("Betsy");
//        catNames.add("Tommy");
//        catNames.add("Mary");
//        catNames.add("Leon");

        Collections.sort(catNames);
        Iterator<String> itrCats = catNames.iterator();

        while (itrCats.hasNext()) {
            boolean isAdded = true;
            String catName = itrCats.next();
            cat.setName(catName);
            int i = rand.nextInt(6);
            while (isAdded) {
                if (i == 0) {
                    isAdded = false;
                } else {
                    catInfo.put(cat.getName(), i);
                    isAdded = false;
                }
            }
        }

        for (String key : catInfo.keySet()) {
            System.out.print(" # NAME : " + key + "\t" + "\t AGE : " + catInfo.get(key));
            System.out.println();
        }

        return catInfo;
    }

    /*
         * Write a method called mostFrequentElement that takes an ArrayList of Integers
         * and finds the most frequently occurring element in the ArrayList.
         * At the end print the element and its number of occurrences.
         * If there is more than one such element, any one of them may be printed.
         */
    public static void mostFrequestElement(HashMap<String, Integer> input) {
        HashMap<Integer, Integer> common = new HashMap<>();
        List<Integer> sorted = new ArrayList<>();
        int commonAge = 0;
        int count = 0;
        int temp = 0;
        int tempCount = 0;

        for (String key : input.keySet()) {
            sorted.add(input.get(key));
            Collections.sort(sorted);
        }
        System.out.print("\nCat Ages : " + sorted);

        for (int num : sorted) {

            for (int i = 0; i <= input.size() - 1; i++) {
                if (num == sorted.get(i)) {
                    commonAge = num;
                    count++;
                }
            }
            if (count > tempCount) {
                temp = num;
                tempCount = count;
                count = 0;
            } else if (count <= 1){
                temp = 0;
                tempCount = 0;
            } else {
                count = 0;
            }

        }
        commonAge = temp;
        count = tempCount;
        System.out.println("\n\nCommon Age : " + commonAge + " and there are : " + count);
    }
}
