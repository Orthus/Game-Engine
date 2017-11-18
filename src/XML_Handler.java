import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XML_Handler {
	static Document mondoc = null;
	static Document spelldoc = null;
	static Document itemdoc = null;
	static Document attackdoc = null;


	public Document Read_File(String file) throws ParserConfigurationException, SAXException, IOException {
        InputStream in = this.getClass().getClassLoader()
        .getResourceAsStream(file);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
        .newInstance();
    DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
//by sending input stream as input to DOM
    Document doc = docBuilder.parse(in);
    return doc;
    }
	public Object Read_Mon(String Mon_ID) throws ParserConfigurationException, SAXException, IOException {
		mondoc = Read_File("/resource/Monsters.xml");
		return null;
	}
	public void Read_Spell() throws ParserConfigurationException, SAXException, IOException {
		spelldoc = Read_File("/resource/Spells.xml");
		}
	public void Read_Item() throws ParserConfigurationException, SAXException, IOException {
		itemdoc = Read_File("/resource/Items.xml");
	}
	public void Read_Attack() throws ParserConfigurationException, SAXException, IOException {
		attackdoc = Read_File("/resource/Attacks.xml");
	}


}
