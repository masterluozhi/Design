package Factory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ClientPlus {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        Afactory factory;
        factory=(DatebaseLoggerFactory)XmlUtils.getLogger();
        factory.wirteLog();
    }
}
