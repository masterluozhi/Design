package strategy;

public class StudentDiscount implements Discount{
    private final Double DISCOUNT=0.2;
    @Override
    public Double calculate(Double price) {
        return price*DISCOUNT;
    }
}
