package strategy;

public class VipDiscount implements Discount{
    @Override
    public Double calculate(Double price) {
        return price*0.5;
    }
}
