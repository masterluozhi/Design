package iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Object> objects=new ArrayList<>();
        objects.add("刀");
        objects.add("枪");
        objects.add("剑");
        objects.add("火箭");
        objects.add("榴弹");
        objects.add("坦克");
        AbstractObjectList list;
        AbstractIterator iterator;
        list=new ProductList(objects);
        iterator=list.creatIterator();
        System.out.println("正向遍历");
        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
        System.out.println("逆向遍历");
        while (!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
