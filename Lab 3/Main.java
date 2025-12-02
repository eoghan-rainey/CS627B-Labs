//import any required libraries

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //display petstore 'welcome' message
        Adoptable.displayGeneralInfo();

        //new arraylist to store all adoptable pet's info
        ArrayList<Pet> petList = new ArrayList<>();

        System.out.println("We currently have " + Pet.getTotalPets() + " furry friends looking for a new home.\n");

        //create demo pets
        Dog dog1 = new Dog("Rashers", "Unsure......", 3, "woofs", "squeeky bone");
        petList.add(dog1);
        Dog dog2 = new Dog("Lassie", "Labrador", 4, "points his nose towards the old swimming hole", "life-bouy");
        petList.add(dog2);
        Cat cat1 = new Cat("Fluffy", "Domestic", 1, "purrs", "mice");
        petList.add(cat1);
        Cat cat2 = new Cat("Jones", "Ginger", 57, "hisses at you", "monster munch");
        petList.add(cat2);
        Rescue newRescue = new Rescue("Stanley", "Bulldog", 7, "slobbers", "nose");
        petList.add(newRescue);
        System.out.println();

        //print full list using call to (static) method printPetList
        //the list is caregorised by pet type, using instanceof criteria
        Printer.printByType(petList);

        //create new family to adopt a pet
        Family smithFamily = new Family("Smith", "Wicklow", "Jack", "Sarah");

        //print family details - toString used to override content
        System.out.println(smithFamily);

        // adoptPet helper function handle adopotion logic
        Adoption.adoptPet(smithFamily, dog2);

        //when adopted, remove adopted pet from the ArrayList
        petList.remove(dog2);

        //print updated list to confirm removal / latest list
        Printer.printByType(petList);
    }

}
