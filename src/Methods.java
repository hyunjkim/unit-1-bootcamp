import java.util.Random;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

//        System.out.println(calculate(2));
//        System.out.println(calculate(3));
//        System.out.println(calculate(4));
//
//        System.out.println(calculateSquareRoot(4));
//        System.out.println(calculateSquareRoot(9));
//        System.out.println(calculateSquareRoot(16));

//        String input = scanner.nextLine();
//        System.out.println(toLowerCase(input));
//        System.out.println(toLowerCase("HELLO, WORLD!"));

//        System.out.println(isMultiple(2,3));
//        System.out.println(isMultiple(2,4));
//        System.out.println(isMultiple(5,100));
//        System.out.println(isMultiple(5,101));

//        prettyInteger(4);
//        prettyInteger(10);

    System.out.println(random(1, 1));
  }

  /* QUESTION # 1
   * Write a method called calculateSquare that takes an int as a parameter
   * and returns the square of that integer.
   */
  public static int calculate(int num) {
    return num * num;
  }

  /* QUESTION # 2
   * Write a method called calculateSquareRoot that takes an int as a parameter
   * and returns the square root of that integer.
   */
  public static int calculateSquareRoot(int num) {
    for (int i = 0; i < num; i++) {
      int j = i * i;
      if (j == num) {
        return i;
      }
    }
    return 0;
  }

  /* QUESTION # 3
  * Write a method called toLowerCase that takes a String as a parameter
  * and returns the String in lower case.
  */
  public static String toLowerCase(String input) {
    return input.toLowerCase();
  }

  /* QUESTION # 4
  * Write a method called isMultiple that takes 2 int parameters
  * and determines if the second is a multiple of the first.
  */
  public static boolean isMultiple(int a, int b) {
    boolean isMultiple = false;
    if (b % a == 0) {
      isMultiple = true;
    }
    return isMultiple;
  }

  /* QUESTION # 5
  * Write a method called isMultiple that takes 2 int parameters
  * and determines if the second is a multiple of the first.
  */
  public static void prettyInteger(int num) {
    boolean print = false;
    int i = 0;

    while (!print) {
      if (i < num) {
        System.out.print("*");

        i += 1;
      } else {
        System.out.print(" " + num + " ");
        print = true;
        i = 0;
      }
    }
    while (print) {
      if (i < num) {
        System.out.print("*");
        i += 1;
      } else {
        System.out.println();
        print = false;
      }
    }
  }

  /* QUESTION # 6
  * Write a method called isMultiple that takes 2 int parameters
  * and determines if the second is a multiple of the first.
  */
  public static int random(int a, int b)  {
    Random rand = new Random();
    int num = 0;
    boolean isBetween = false;
    if (a == b) {
      System.out.println("Do not use same numbers! Try Again");
    } else {
      int numB = rand.nextInt(b - 1);
      while (!isBetween) {
        if (numB > a && numB < b) {
          num = numB;
          isBetween = true;
        } else {
          numB = rand.nextInt(b - 1);
          isBetween = false;
        }
      }
    }
    return num;
  }
}
