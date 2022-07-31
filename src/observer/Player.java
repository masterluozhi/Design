package observer;

public class Player implements   Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public void help() {
        System.out.println(this.name+"前来资源");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name+"请求支援");
        allyControlCenter.notifyObserver(name);
    }
}
