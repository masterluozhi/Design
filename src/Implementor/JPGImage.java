package Implementor;

public class JPGImage extends  Image{
    @Override
    public void parseFile(String fileName) {
        Matrix m=new Matrix();
        imageImp.doPaint(m);
        System.out.println(fileName="格式伟jpg");
    }
}
