package strategy;

public class MovieTicket {
    private Double price;
    private Discount discount;

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setDiscount(Discount discount){
        this.discount=discount;
    }
    public double getprice(){
        return discount.calculate(this.price);
    }
}
