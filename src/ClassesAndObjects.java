/**
 * Created by alexandraqin on 4/14/15.
 * 1. Cool cats
 * <p>
 * Create 3 cats named Garfield, Pink Panther, and Catwoman.
 * Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
 * Assign each of them an age.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {
        Cat garfield = new Cat("Garfield", 1, "lasgna");
        Cat pinkpanther = new Cat("Pinkpanther", 2, "fish");
        Cat catwoman = new Cat("Catwoman", 0, "tuna");

        Person Hyunjoo = new Person("Hyunjoo");

        isOlder(garfield, pinkpanther);
        isOlder(garfield, catwoman);

        makeBestFriends(garfield, catwoman);

        String kitten = makeKitten(garfield, catwoman);
        System.out.println(kitten);

        adoption(pinkpanther, Hyunjoo);
        adoption(catwoman, Hyunjoo);

        boolean isGarfieldFree = isFree(garfield);
        boolean isPinkpantherFree = isFree(pinkpanther);
        boolean isCatwomanFree = isFree(catwoman);

        System.out.println(isGarfieldFree);
        System.out.println(isPinkpantherFree);
        System.out.println(isCatwomanFree);

        boolean areTheySibs = isSibling(garfield,pinkpanther);
        boolean areTheySibs2 = isSibling(garfield,catwoman);
        boolean areTheySibs3 = isSibling(catwoman,pinkpanther);

        System.out.println(garfield.getName() + " " + pinkpanther.getName() + " are " + areTheySibs + " siblings.");
        System.out.println(garfield.getName() + " " + catwoman.getName() + " are " + areTheySibs2+ " siblings.");
        System.out.println(catwoman.getName() + " " + pinkpanther.getName() + " are " + areTheySibs3+ " siblings.");
    }

    public static void isOlder(Cat one, Cat two) {

        if (one.getAge() > two.getAge()) {
            System.out.println(one.getName() + " is older than " + two.getName());
        } else
            System.out.println(two.getName() + " is older than " + one.getName());
    }

    public static void makeBestFriends(Cat one, Cat two) {
        one.setFavoriteFood("fish");
        two.setFavoriteFood("fish");
    }

    public static String makeKitten(Cat one, Cat two) {

        String kitten = "";
        kitten = one.getName().concat(two.getName());
        return kitten;
    }

    public static void adoption(Cat cat, Person owner) {
        if (!cat.getName().equals("Catwoman")) {
            cat.setOwner(owner);
            System.out.println(owner.getName() + " is now " + cat.getName() + "'s owner!");
        } else
            System.out.println("Catwoman will never be anyone's pet");
    }

    public static boolean isFree(Cat cat) {
        if (cat.getOwner()== null) {
            return true;
        } else
            return false;
    }

    public static boolean isSibling(Cat one, Cat two) {

        boolean isSibling = false;

        if (one.getOwner()== two.getOwner()) {
            isSibling = true;
        } else
            isSibling = false;

        return isSibling;
    }

}
