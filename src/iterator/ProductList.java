package iterator;

import java.util.List;

public class ProductList extends  AbstractObjectList{
    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator creatIterator() {
        return new ProductIterator(this);
    }
//    //商品迭代器，内部类实现
//    private  class ProductIterator implements AbstractIterator{
//
//        @Override
//        public void next() {
//
//        }
//
//        @Override
//        public Boolean isLast() {
//            return null;
//        }
//
//        @Override
//        public void previous() {
//
//        }
//
//        @Override
//        public Boolean isFirst() {
//            return null;
//        }
//
//        @Override
//        public Object getNextItem() {
//            return null;
//        }
//
//        @Override
//        public Object getPreviousItem() {
//            return null;
//        }
//    }
}
