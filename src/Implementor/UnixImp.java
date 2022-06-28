package Implementor;

public class UnixImp implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在unixImp显示");
    }
}
