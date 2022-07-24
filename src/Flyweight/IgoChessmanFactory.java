package Flyweight;

import java.util.Hashtable;

public class IgoChessmanFactory {
    private  static IgoChessmanFactory insatnce = new IgoChessmanFactory();
    private  static Hashtable ht;
    private IgoChessmanFactory(){
        ht=new Hashtable();
        LogChessman black,white;
        black=new BlackIgoChessman();
        white=new WhiteChessman();
        ht.put("b",black);
        ht.put("w",white);
    }
    public  static  IgoChessmanFactory getInstance(){
        return  insatnce;
    }
    public static  LogChessman getLgoChessman(String color){
        return  (LogChessman) ht.get(color);
    }

}
