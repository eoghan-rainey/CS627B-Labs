package lab2;

public class Main {
    public static void main(String[] args) {
        // Access packages
        AccessPackage vipConcert = new AccessPackage("Section A • Row 3 • Seat 12", "VIP Lounge", true);
        AccessPackage standardSports = new AccessPackage("Lower Bowl • S112 • Seat 21", "-", true);
        AccessPackage confPro = new AccessPackage("Hall B • Row 8 • Seat 15", "Speaker Meet & Greet", true);

        // Entities
        Perfomer perf = new Perfomer("Aurora Waves");
        Team t1 = new Team("Stockton Sparks");
        Team t2 = new Team("Lodi Lions");
        Speaker sp = new Speaker("Dr. Ada Lovelace");

        // Tickets
        Ticket c = new ConcertTicket("The Neon Lights Tour", "2026-01-15", 130, vipConcert, perf);
        Ticket s = new SportTicket("Championship Semi-Final", "2025-12-10", 90, standardSports, t1, t2);
        Ticket conf = new ConferenceTicket("Future of AI Summit 2026", "2026-02-20", 349, confPro, sp);

        // Bundle + discounts
        TicketBundle bundle = new TicketBundle();
        bundle.addTicket(c);
        bundle.addTicket(s);
        bundle.addTicket(conf);

        DiscountPolicy none = new NoDiscountPolicy();
        DiscountPolicy pct10 = new PercentageDiscountPolicy(10.0);

        System.out.println(bundle.generateBundleSummary());
        System.out.println();
        System.out.println("No Discount -> " + bundle.getFinalTotal(none));
        System.out.println("10% Off -> " + bundle.getFinalTotal(pct10));
    }
}
