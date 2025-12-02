package lab2;

public class ConcertTicket extends Ticket {
    private Perfomer perfomer1;

     public ConcertTicket(String eventname, String date, int price, Perfomer perfomer1) {
        super(eventname, date, price);
        this.perfomer1 = perfomer1;
    }

    @Override
    public void GeneralSummary() {
        System.out.println("Eventname:"+getName()+"Date: "+getDate()+"Price: "+getPrice()+ "Perfomer: "+ perfomer1);
    }
}


    

