package observer;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter add;
        add=new ConcreteAllyControlCenter("金庸裙下");

        Observer play1,play2,play3,play4;
        play1=new Player("言难过");
        play2=new Player("言难");
        play3=new Player("难过");
        play4=new Player("言过");
        add.join(play1);
        add.join(play2);
        add.join(play3);
        add.join(play4);
        play1.beAttacked(add);
    }
}
