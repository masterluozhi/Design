package mediator;

public class Clent {
    public static void main(String[] args) {
     //定义中介者对象
     ConcreteMediator concreteMediator;
     concreteMediator=new ConcreteMediator();
     //定义同事对象
        Button button = new Button();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        TextBox textBox = new TextBox();

        button.setMediator(concreteMediator);
        list.setMediator(concreteMediator);
        comboBox.setMediator(concreteMediator);
        textBox.setMediator(concreteMediator);

        concreteMediator.addButton=button;
        concreteMediator.list=list;
        concreteMediator.comboBox=comboBox;
        concreteMediator.userNameTextBox=textBox;

        button.changed();
        System.out.println("------------");
        list.changed();
    }
}
