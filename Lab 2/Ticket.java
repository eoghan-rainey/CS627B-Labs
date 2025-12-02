package lab2;

public class Ticket {
    private String eventname;
    private String date;
    private int price;

    public Ticket(String eventname, String date, int price) {
        this.eventname = eventname;
        this.date= date;
        this.price = price;
    }

     // Getters
    public String getName() {
        return eventname;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;

    }

    //Setter

    //General Summary
    public void GeneralSummary() {
        System.out.println("Eventname:"+getName()+"Date: "+getDate()+"Price: "+getPrice());
    }    
}
