package Factory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        Factory factory;
        Logger logger;
        factory = (FileLoggerFactory) XmlUtils.getLogger();
        logger=factory.createLogger();
        logger.wirteLog();
    }
}
