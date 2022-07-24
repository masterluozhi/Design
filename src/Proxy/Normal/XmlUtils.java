package Proxy.Normal;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlUtils {
    public static  Object getBean() throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document parse = documentBuilder.parse("F:\\workspace\\DesignM\\src\\resourse\\bulid.xml");
        NodeList className = parse.getElementsByTagName("className");
        Node firstChild = className.item(0).getFirstChild();
        String nodeValue = firstChild.getNodeValue().trim();
        Class aClass = Class.forName(nodeValue);
        Object o = aClass.newInstance();
        return  o;
    }
}
