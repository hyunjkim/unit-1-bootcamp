import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main(String args[]) {

    usingVariables();
    boolean question2 = isOdd(4);
    String question3 = printHelloWorld();
    ArrayList<Integer> question4 = greatestCommonFactor(18, 24);

    System.out.println(question2);
    System.out.println(question3);
    System.out.println(question4);

  }

  private static void usingVariables() {
    int classNum = 113;
    double longNum = 2.71828;
    String subject = "ComputerScience";

    if(classNum == 113){
      System.out.println("This is room # " + classNum);
    }
    if (longNum == 2.71828){
      System.out.println("e is close to " + longNum);
    }
    if (subject.equals("ComputerScience")){
      System.out.println("I am learning a bit about " + subject);
    }
  }

  public static boolean isOdd(int i) {
    boolean isOdd = false;

    if (i % 2 == 1) {
      isOdd = true;
    } else {
      isOdd = false;
    }
    return isOdd;
  }

  public static String printHelloWorld() {
    String hello = "Hello World";
    return hello;
  }

  public static ArrayList<Integer> greatestCommonFactor(int a, int b) {

    ArrayList<Integer> gcf = new ArrayList<>();
    Set<Integer> noDups = new HashSet<>();

    int numA = 2;
    int numB = 2;

    boolean gcfA = false;
    boolean gcfB = false;

    while (!gcfA) {
      if (a % numA == 0) {
        int aEqual = a / numA;
        a = aEqual;
        noDups.add(numA);
      } else if (a / numA != 0) {
        numA += 1;
        gcfA = false;
      } else {
        gcfA = true;
      }
    }
    while (!gcfB) {
      if (b % numB == 0) {
        int bEqual = b / numB;
        b = bEqual;
        noDups.add(numB);
      } else if (b / numB != 0) {
        numB += 1;
        gcfB = false;
      } else{
        gcfB = true;
      }
    }
    gcf.addAll(noDups);
    return gcf;
  }
}

