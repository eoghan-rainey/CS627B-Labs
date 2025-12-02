
//2st PET type is cat
public class Cat extends Pet implements Adoptable {

    //child variables
    final String favouriteFood;
    public boolean adopted;

    //constructor
    public Cat(String petName, String petBreed, int petAge, String petSound, String favouriteFood) {
        super(PetType.CAT, petName, petBreed, petAge, petSound);
        this.favouriteFood = favouriteFood;
        this.adopted = false;

        //screen output to confirm new pet registered
        System.out.println("New pet received! We now have " + Pet.getTotalPets() + " pet(s) available to re-home");

    }

    //petsound abstract method defined at child level
    @Override
    public void petSound() {

        System.out.println(this.getName() + " is eating her " + this.favouriteFood + " and " + this.getSound() + " happily.");

    }

    //enhance displayInfo message via Override
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(this.getName());
        this.printLegs();
        System.out.println("Favourite food: " + favouriteFood);
        this.petSound();
        System.out.println();
        System.out.println();
    }

    //display mandatory messaging for adoption
    @Override
    public void showAdoptableTerms() {

        Adoptable.super.showAdoptableTerms();
        System.out.println("Please call ahead to confirm we have the right cat for you!");

    }

}
