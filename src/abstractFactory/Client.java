package abstractFactory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        SkinFactory factory = (SkinFactory ) XmlUtils.getFactroy();
         factory.createdButton().display();
         factory.createdComboBox().display();
         factory.createdTextFileld().display();
    }
}
