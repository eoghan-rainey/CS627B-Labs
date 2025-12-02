package lab2;

import java.util.List;

public interface DiscountPolicy {
    /**
     * @param subtotal current subtotal (sum of ticket prices)
     * @param tickets  tickets in the bundle (for contextual rules)
     * @return new total after discount
     */
    double apply(double subtotal, List<Ticket> tickets);
}
