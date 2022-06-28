package singleton;

public class LSingletonPlus {
    private static  LSingletonPlus singleton =null;
    private LSingletonPlus(){

    }
//   synchronized public static   LSingletonPlus getSingleton(){
//        if (singleton==null){
//            singleton=new LSingletonPlus();
//        }
//        return singleton;
//    }
 public static   LSingletonPlus getSingleton(){
    if (singleton==null){
       synchronized (LSingletonPlus.class){
           singleton=new LSingletonPlus();
       }
    }
    return singleton;
}


}
