package lab2;

public class ConferenceTicket extends Ticket{
    private Speaker speaker1;

     public ConferenceTicket(String eventname, String date, int price, Speaker speaker1) {
        super(eventname, date, price);
        this.speaker1=speaker1;
    }

    @Override
    public void GeneralSummary() {
        System.out.println("Eventname:"+getName()+"Date: "+getDate()+"Price: "+getPrice()+ "Speaker: "+ speaker1);
    }

}
    

