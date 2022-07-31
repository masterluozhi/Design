package observer;

public class ConcreteAllyControlCenter extends AllyControlCenter{
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName+"战队组建成功");
        this.allyName=allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName+"战队紧急通知，盟友"+name+"遭受攻击");
        System.out.println(player);
        for (Object o:player){
            if (!((Observer)o).getName().equalsIgnoreCase(name)){
                 ((Observer) o).help();
            }
        }
    }
}
