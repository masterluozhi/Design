package common;

import Implementor.XmlUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        FunctionButton functionButton = new FunctionButton();
        Command command;
        command=(Command) XmlUtils.getBuild("111");
        functionButton.setCommand(command);
    }
}
