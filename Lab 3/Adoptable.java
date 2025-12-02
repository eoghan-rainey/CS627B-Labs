//implement interface to pass mandatory methods to child objects

public interface Adoptable {

    //Show adoption terms to the console.
    // can be overridden at child level
    default void showAdoptableTerms() {
        System.out.println("Adoption terms: Potential owners will be subject to mandatory screening processes.\n");
    }

// default welcome message
    static void displayGeneralInfo() {

        System.out.println("Welcome to Adoptable!\n");
        System.out.println("Find your new furry best friend.\nAll pets guaranteed to come with 4 legs.");
        System.out.println("All animals are available to visit in our Dublin branch.\n");

    }

}
