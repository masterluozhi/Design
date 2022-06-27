package build;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, InstantiationException, IllegalAccessException {
        ActorBuilder builder ;
       builder=(ActorBuilder) XmlUtils111.getBuild();
       ActorController actorControllerr =new  ActorController() ;
       Actor actor;
       actor=actorControllerr.construst(builder);
        System.out.println(actor);
    }
}
