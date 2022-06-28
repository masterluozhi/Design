package Implementor;

public class WindowsImp implements  ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在window下显示");
    }
}
