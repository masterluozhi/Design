package strategy;

public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(11.1);
        Discount discount=new StudentDiscount();

        movieTicket.setDiscount(discount);
        movieTicket.getprice();

    }
}
