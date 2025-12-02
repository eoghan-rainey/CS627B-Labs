//family class created for adoption method
//no need for extensive setters and getters here

public class Family {

    private final String familyName;
    private final String homeTown;
    private final String kidNameOne;
    private final String kidNameTwo;

    public Family(String familyName, String homeTown, String kidNameOne, String kidNameTwo) {
        this.familyName = familyName;
        this.homeTown = homeTown;
        this.kidNameOne = kidNameOne;
        this.kidNameTwo = kidNameTwo;

    }

    public String getFamilyName() {
        return familyName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    //toString for printing family info
    @Override
    public String toString() {
        return ("The " + familyName + " family are looking for a new pet.\n"
                + kidNameOne + " wants a dog, " + kidNameTwo + " wants a cat.\n");
    }

}
