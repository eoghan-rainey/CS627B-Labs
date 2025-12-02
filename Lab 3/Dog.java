
//1st PET type is dog
public class Dog extends Pet implements Adoptable {

    //child variables
    final String favouriteToy;
    public boolean adopted;

    //constructor
    public Dog(String petName, String petBreed, int petAge, String petSound, String favouriteToy) {
        super(PetType.DOG, petName, petBreed, petAge, petSound);
        this.favouriteToy = favouriteToy;
        this.adopted = false;

        //screen output to confirm new pet registered
        System.out.println("New pet received! We now have " + Pet.getTotalPets() + " pet(s) available to re-home");
    }

    //petsound abstract method defined at child level
    @Override
    public void petSound() {

        System.out.println(this.getName() + " is playing with his " + this.favouriteToy + " and " + this.getSound() + " happily.");

    }

    //enhance displayInfo message via Override
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(this.getName());
        this.printLegs();
        System.out.println("Favourite toy: " + favouriteToy);
        this.petSound();
        System.out.println();

        System.out.println();
    }

    //display mandatory messaging for adoption
    @Override
    public void showAdoptableTerms() {
        Adoptable.super.showAdoptableTerms();

    }

}
