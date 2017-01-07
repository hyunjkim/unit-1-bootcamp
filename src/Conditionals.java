import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();

    System.out.print("What is your name? ");
    String name  = scanner.nextLine();
    person.setName(name);
    boolean isShort = false;
    while (!isShort) {
      if (person.getName().length() < 5) {
        System.out.println("Name is too short");
        System.out.println("What is your name? ");
        person = new Person(scanner.next());
        isShort = false;
      } else {
        isShort = true;
      }
    }
    System.out.println("Where are you from? Are you from London or somewhere else");
    String input = scanner.next();
    person.setCity(input);
    boolean fromLondon = false;
    while (!fromLondon) {
      if (person.getCity().toLowerCase().matches("london")) {
        fromLondon = true;
        System.out.println(fromLondon + ", " + person.getName() + " is from London. ");
      } else {
        System.out.println(person.getName() + " is not from London. ");
        fromLondon = true;
      }
    }
  }
}
