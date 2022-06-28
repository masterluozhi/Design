package singleton;

public class LsingleFinally {
    private LsingleFinally(){

    }
    private static  class  HoldClass{
      private final static LsingleFinally single=new LsingleFinally();
    }
    public static   LsingleFinally getSingleton(){
    return HoldClass.single;
    }
}
