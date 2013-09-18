package core;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Run {


	public static void main(String[] args) {
		try {
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			//f.setValidating(true);
			f.setIgnoringElementContentWhitespace(true);

			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document doc = parser.parse("http://www.ynet.co.il/Integration/StoryRss545.xml");
			
			NodeList nodes = doc.getElementsByTagName("item");
			
			for ( int i = 0 ; i < nodes.getLength() ; i++ ){
				System.out.println(nodes.item(i).getTextContent());
			}
			
		} catch (Exception e){

		}


	}

}
