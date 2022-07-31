package iterator;
//抽象迭代器类
public interface   AbstractIterator {
    void next();
    Boolean isLast();
    void previous();
    Boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();
}
