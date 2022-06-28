package singleton;

public class LSingleton {
    private static  LSingleton singleton=null;

    private LSingleton() {

    }
    public static  LSingleton getInstance(){
        if (singleton==null){
            singleton=new LSingleton();
        }
        return  singleton;
    }
}
