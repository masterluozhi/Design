package Flyweight;

public abstract  class LogChessman {
    public abstract String getColor();
    public  void disPlay(){
        System.out.println("棋子颜色:"+this.getColor());
    }
}
