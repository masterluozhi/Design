package observer;

import java.util.ArrayList;
import java.util.List;

//抽象目标类
public abstract class AllyControlCenter {
    protected  String allyName;
    protected List<Observer> player=new ArrayList<Observer>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    public void join(Observer observer){
        player.add(observer);
        System.out.println(observer.getName()+"加入"+this.allyName+"战队");
    }
    public void quit(Observer observer){
        player.remove(observer);
        System.out.println(observer.getName()+"推出"+this.allyName+"战队");
    }
    public abstract void notifyObserver(String name);
}
