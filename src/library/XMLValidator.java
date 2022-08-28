package library;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class XMLValidator {
    public static boolean isXmlValid(String xsdPath, String xmlPath) throws ValidationException {

        boolean isXmlValid;
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            javax.xml.validation.Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
            isXmlValid = true;
        } catch (IOException e) {
            throw new ValidationException("Validation can not be performed. Check path to xml or xsd." + e.getMessage());
        } catch (SAXException e) {
            throw new ValidationException("Xml is not valid." + e.getMessage());
        }
        return isXmlValid;
    }
}