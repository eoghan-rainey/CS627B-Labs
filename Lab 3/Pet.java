//abstract parent class - we don't want a 'pet' object instantiated
//child classes include dog, cat, rescue

abstract class Pet {

    private String petName;
    private int petAge;
    private String petBreed;
    public static int petCount = 0; //unlike lab example we can start at 0 pets available
    final String SHOP_LOCATION = "Dublin"; //final constant
    private PetType type;
    private String petSound;
    private boolean adopted = false;

    //constructor includes expected variables, including petSound, which is overridden with
    //an appropriate sound at the child level
    public Pet(PetType type, String petName, String petBreed, int petAge, String petSound) {
        this.type = type;
        this.petName = petName;
        this.petAge = petAge;
        this.petSound = petSound;
        this.petBreed = petBreed;
        petCount++;
    }

    //getters; setters not required
    public String getName() {
        return this.petName;
    }

    public String getSound() {
        return this.petSound;
    }

    public abstract void petSound(); //abstract method - override @ child level

    public final void printLegs() {
        System.out.println(" has 4 legs");
    }

    //print general pet info to screen
    public void displayInfo() {
        System.out.println("Pet Type: " + String.valueOf(type).toLowerCase());
        System.out.println("Breed: " + petBreed);
        System.out.println("Pet age: " + petAge);
        System.out.println("Pet location: " + SHOP_LOCATION);

    }

    //return the total number of pets available to adopt
    //no need to set -1 as per lab example as we start with 0 pets
    public static int getTotalPets() {
        return petCount;
    }

}
