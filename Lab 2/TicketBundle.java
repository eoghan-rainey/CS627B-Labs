package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketBundle {
    private final List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        if (ticket == null) throw new IllegalArgumentException("ticket cannot be null");
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public double getSubtotal() {
        int sum = 0;
        for (Ticket t : tickets) {
            sum += t.getPrice();
        }
        return sum;
    }

    public double getFinalTotal(DiscountPolicy policy) {
        double subtotal = getSubtotal();
        return policy.apply(subtotal, tickets);
    }

    public String generateBundleSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Ticket Bundle =====\n");
        int i = 1;
        for (Ticket t : tickets) {
            sb.append("-- Ticket #").append(i++).append(" --\n")
              .append(t.generateSummary()).append("\n\n");
        }
        sb.append("Bundle Subtotal: ").append(getSubtotal());
        return sb.toString();
    }
}
