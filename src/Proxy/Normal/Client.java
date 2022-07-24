package Proxy.Normal;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        Seacher seacher;
        seacher =(Seacher)XmlUtils.getBean();
        String result= seacher.doSeacher("杨过","玉女心经");

    }


}
