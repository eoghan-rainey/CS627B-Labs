
//simple adoption helper

public class Adoption {

    public static void adoptPet(Family family, Dog pet) {
        System.out.println("Good news! " + pet.getName() + " has a new home with the " + family.getFamilyName() + " family. Before bringing your new pet home, please review our t&c:\n");
        pet.showAdoptableTerms();

        //this isn't actually used at present, leave in for possible future functionality
        pet.adopted = true;
    }

}
