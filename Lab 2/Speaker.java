package lab2;

public class Speaker {
    private String name;

    public Speaker(String name) {
        this.name = name;
    }

    public String getSpeaker() {
        return name;
    }

    @Override
    public String toString() {
        return "Speaker{name='" + name;
    }
    
}
