package SimpleFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLUtill {
    public static String getShapeType() {
        String nodeValue = null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse("F:\\workspace\\Design\\src\\resourse\\resource.xml");
            NodeList elementsByTagName = document.getElementsByTagName("shapeType");
            Node firstChild = elementsByTagName.item(0).getFirstChild();
            nodeValue = firstChild.getNodeValue().trim();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return nodeValue;
    }
}
