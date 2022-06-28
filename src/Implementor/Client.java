package Implementor;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        Image image;
        ImageImp imageImp;
        image=(Image) XmlUtils.getBuild("image");
        imageImp=(ImageImp) XmlUtils.getBuild("os");
        image.setImageImp(imageImp);
        image.parseFile("小龙女");
    }
}
