package adapter;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        CarController carController;
        carController =(CarController) XmlUtils.getBuild();
        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
