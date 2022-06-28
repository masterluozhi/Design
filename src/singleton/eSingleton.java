package singleton;

public class ESingleton {
    private static  ESingleton singleton=new ESingleton();

    private ESingleton() {

    }
    public static  ESingleton getInstance(){
        return  singleton;
    }
}
