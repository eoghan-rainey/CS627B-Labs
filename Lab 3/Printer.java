//printer class created to abstract some screen output from main
//created as abstract as don't want objects instantiated

import java.util.ArrayList;

abstract class Printer {

    //for : each loop used to print all pets in arraylist
    //pets are categorised by Pet type (instanceof either Cat, Dog or Rescue)
    public static void printByType(ArrayList<Pet> pets) {
        for (Pet p : pets) {
            if (p instanceof Dog) {
                Dog d = (Dog) p;
                System.out.println("Dog available: " + d.getName());
                d.displayInfo();
            } else if (p instanceof Cat) {
                Cat c = (Cat) p;
                System.out.println("Cat available: " + c.getName());
                c.displayInfo();
            } else if (p instanceof Rescue) {
                Rescue r = (Rescue) p;
                System.out.println("Rescue available: " + r.getName());
                r.displayInfo();
            }
        }
    }

}
