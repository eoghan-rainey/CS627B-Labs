package lab2;

import java.util.List;

public class PercentageDiscountPolicy implements DiscountPolicy {
    private final double percent; // e.g., 10.0 for 10%

    public PercentageDiscountPolicy(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("percent must be between 0 and 100");
        }
        this.percent = percent;
    }

    @Override
    public double apply(double subtotal, List<Ticket> tickets) {
        double multiplier = 1.0 - (percent / 100.0);
        return subtotal * multiplier;
    }
}
