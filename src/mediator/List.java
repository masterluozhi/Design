package mediator;

public class List extends Component{
    @Override
    public void update() {
        System.out.println("列表整加一项，张无忌");
    }
    public void select(){
        System.out.println("列表选择，小龙女");
    }
}
