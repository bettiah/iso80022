package iso80022.pain._001._001._03;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class Schema {

  public static javax.xml.validation.Schema INSTANCE;

  static {
    try {
      INSTANCE =
          SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
              .newSchema(
                  new StreamSource(Schema.class.getResourceAsStream("/pain.001.001.03.xsd")));
    } catch (SAXException e) {
      throw new RuntimeException(e);
    }
  }
}
