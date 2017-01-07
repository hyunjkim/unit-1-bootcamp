/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main(String args[]) {
    loopOneToTen();
//        diffLoopOneToTen();
//        loopOneto(5);
//        loopEvenNums(10);
//        sumOfOneToTen();
//        sumOfOneTo(5);
//        sumOfOneToThousand();
//        printS(3, "Hello");
//        concatString(3,"hello");
//        firstTenFib();
//        firstFib();
//        sumFib(3);
  }

  private static void loopOneToTen() {
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void diffLoopOneToTen() {
    int i = 1;
    do {
      System.out.print(i + " ");
      i++;
    } while (i <= 10);
    System.out.println();
  }

  public static void loopOneto(int num) {
    for (int i = 1; i <= num; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void loopEvenNums(int num) {
    for (int i = 0; i <= 10; i += 2) {
      if (i % 2 == 0 && i != 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void sumOfOneToTen() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i != 1) {
        sum = i + sum;
        System.out.print(sum + " ");
      } else {
        sum = i + i;
        System.out.print(sum + " ");
      }
    }
    System.out.println();
  }

  public static void sumOfOneTo(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      if (i != 1) {
        sum = i + sum;
        System.out.print(sum + " ");
      } else {
        sum = i + i;
        System.out.print(sum + " ");
      }
    }
    System.out.println();
  }

  public static void sumOfOneToThousand() {
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i != 1) {
        sum = i + sum;
        if (i % 15 == 0) {
          System.out.println(sum + " ");
        }
        System.out.print(sum + " ");
      } else {
        sum = i + i;
        System.out.print(sum + " ");
      }
    }
    System.out.println();
  }

  public static void printS(int num, String input) {
    int repeat = 0;
    while (repeat < num) {
      for (int i = 1; i <= num; i++) {
        System.out.print(input + " ");
      }
      repeat += 1;
    }
    if (repeat > num) {
      System.out.println("");
    }
  }

  public static void concatString(int num, String input) {
    for (int i = 0; i < num; i++) {
      input += input;
      System.out.print(input + "   ");
    }
  }

  public static void firstTenFib() {
    int n = 0;
    int sum1 = 0;
    int sum2 = 0;
    int fib2 = 0;
    while (n <= 10) {
      if (n == 0) {
        System.out.print(1 + " ");
        n++;
      } else if (n == 1) {
        System.out.print(1 + " ");
        sum1 = n;
        sum2 = n;
        n++;
      } else {
        fib2 = sum1 + sum2;
        System.out.print(fib2 + " ");
        sum1 = sum2;
        sum2 = fib2;
        n++;
      }
    }
    System.out.println();
  }

  // Modify the method to sum the first ten Fibonnaci numbers.
  public static void firstFib() {
    int n = 0;
    int sum1 = 0;
    int sum2 = 0;
    int fib2 = 0;
    int total = 0;
    while (n <= 10) {
      if (n == 0) {
        System.out.print(1 + " ");
        total += n;
        n++;
      } else if (n == 1) {
        System.out.print(1 + " ");
        sum1 = n;
        sum2 = n;
        total += n;
        n++;
      } else {
        fib2 = sum1 + sum2;
        System.out.print(fib2 + " ");
        total += fib2;
        sum1 = sum2;
        sum2 = fib2;
        n++;
      }
    }
    System.out.println("Total is : " + total);
  }

  // Modify the method to take in an int n and sum the first n Fibonnaci numbers.
  public static void sumFib(int n) {
    int i = 0;
    int sum1 = 0;
    int sum2 = 0;
    int fib2 = 0;
    int total = 0;
    while (i <= n) {
      if (i == 0) {
        System.out.print(1 + " ");
        total += i;
        i++;
      } else if (i == 1) {
        System.out.print(1 + " ");
        sum1 = i;
        sum2 = i;
        total += i;
        i++;
      } else {
        fib2 = sum1 + sum2;
        System.out.print(fib2 + " ");
        total += fib2;
        sum1 = sum2;
        sum2 = fib2;
        i++;
      }
    }
    System.out.println("Total is : " + total);
  }
}
