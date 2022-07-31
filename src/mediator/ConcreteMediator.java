package mediator;


public class ConcreteMediator extends Mediator{
    //维持各个同事对象的应用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox comboBox;
    @Override
    public void componentChanged(Component c) {
        //单击按钮
        if (c==addButton){
            System.out.println("单击按钮");
            list.update();
            comboBox.update();
            userNameTextBox.update();
        }
        //列表选择客户
        if (c==list){
            System.out.println("列表选择客户");
            comboBox.select();
            userNameTextBox.setText();
        }
        //组合框
        if (c==list){
            System.out.println("组合框户");
            comboBox.select();
            userNameTextBox.setText();
        }
    }
}
