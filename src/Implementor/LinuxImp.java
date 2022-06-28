package Implementor;

public class LinuxImp implements  ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux操作系统显示");
    }
}
