package Flyweight;

public class Client {
    public static void main(String[] args) {
        LogChessman black,balck1,black2,white,white1,white2;
        IgoChessmanFactory factory ;
         factory = IgoChessmanFactory.getInstance();
        black=factory.getLgoChessman("b");
        balck1=factory.getLgoChessman("b");
        black2=factory.getLgoChessman("b");
        System.out.println(black==black2);
        white=factory.getLgoChessman("w");
        white1=factory.getLgoChessman("w");
        white2=factory.getLgoChessman("w");
        black.disPlay();
        balck1.disPlay();
        black2.disPlay();
        white.disPlay();
        white1.disPlay();
        white2.disPlay();
    }
}
