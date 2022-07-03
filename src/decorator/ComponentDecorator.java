package decorator;

public class ComponentDecorator extends  Compenent{
    private Compenent compenent;

    public ComponentDecorator(Compenent compenent) {
        this.compenent = compenent;
    }

    @Override
    public void dispaly() {
        compenent.dispaly();
    }
}
