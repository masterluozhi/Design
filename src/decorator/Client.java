package decorator;

public class Client {
    public static void main(String[] args) {
        Compenent compenent,compenentbb,compenentS;
        compenent=new Window();
        compenentbb = new ScrollBarDecorator(compenent);
        compenentS= new BalckBorderDecorator(compenentbb);
        compenentS.dispaly();
    }
}
