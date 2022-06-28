package singleton;

public class LSingletonDoubel {
    private volatile  static  LSingletonDoubel singleton =null;
    private LSingletonDoubel(){

    }
    public static   LSingletonDoubel getSingleton(){
        if (singleton==null){
            synchronized (LSingletonPlus.class){
                if (singleton==null){
                    singleton=new LSingletonDoubel();
                }
            }
        }
        return singleton;
    }

}
