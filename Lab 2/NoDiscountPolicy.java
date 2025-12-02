package lab2;

import java.util.List;

public class NoDiscountPolicy implements DiscountPolicy {
    @Override
    public double apply(double subtotal, List<Ticket> tickets) {
        return subtotal;
    }
}
