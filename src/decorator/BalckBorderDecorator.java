package decorator;

public class BalckBorderDecorator extends ComponentDecorator {
    public BalckBorderDecorator(Compenent compenent) {
        super(compenent);
    }

    @Override
    public void dispaly() {
        this.setBalckBorder();
        super.dispaly();
    }
    public void setBalckBorder(){
        System.out.println("整加黑年");
    }
}
