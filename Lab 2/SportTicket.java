package lab2;

public class SportTicket extends Ticket{
    private Team team1;
    private Team team2;

    public SportTicket(String eventname, String date, int price, Team team1,Team team2) {
        super(eventname, date, price);
        this.team1=team1;
        this.team2=team2;
    }

    @Override
    public void GeneralSummary() {
        System.out.println("Eventname:"+getName()+"Date: "+getDate()+"Price: "+getPrice()+ "Team1: "+ team1.getTeam()+ "Team2: "+team2.getTeam());
    }
}
