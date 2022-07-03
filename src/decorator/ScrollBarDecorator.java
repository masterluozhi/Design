package decorator;

public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Compenent compenent) {
        super(compenent);
    }

    @Override
    public void dispaly() {
        this.setScoll();
        super.dispaly();
    }
    public void setScoll(){
        System.out.println("整加滚动条");
    }
}
