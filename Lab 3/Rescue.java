//rescue provides some differentiation to cat & dog

public class Rescue extends Pet {

    // child variables
    final String injuredPart;
    public boolean adopted;

    //constructor
    public Rescue(String petName, String petBreed, int petAge, String petSound, String injuredPart) {
        super(PetType.RESCUE, petName, petBreed, petAge, petSound);
        this.injuredPart = injuredPart;
        this.adopted = false;
    
        //screen output to confirm new pet registered
        System.out.println("New pet received! We now have " + Pet.getTotalPets() + " pet(s) available to re-home");
    }

    //petsound abstract method defined at child level
    @Override
    public void petSound() {
        System.out.println(this.getName() + " is a rescue pet with a sore " + this.injuredPart + " and "
                + this.getSound() + " at you happily.");
    }

    //child override of displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(this.getName());
        this.printLegs();
        System.out.println("Rescue information: " + getName() + " has a sore " + this.injuredPart);
        this.petSound();
        System.out.println();
    }
    
}
