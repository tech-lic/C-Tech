package util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Testxsl {
public static void main(String[] args) throws ParserConfigurationException{
	  // TODO 自动生成方法存根
	  DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	  try
	  {
	   DocumentBuilder db=dbf.newDocumentBuilder();
	   Document doc=db.parse("D:/code/non/src/file1/test1.xml");
	   DOMSource source=new DOMSource(doc);
	   StreamResult result=new StreamResult(new File("file1/test1.html"));
	            StreamSource ss=new StreamSource(new File("D:/code/non/src/file1/test1.xsl"));
	            TransformerFactory tff = TransformerFactory.newInstance();
	            Transformer tf = tff.newTransformer(ss);
	            tf.setOutputProperty("encoding", "utf-8");
	            tf.transform(source, result);
	  }
	        catch(ParserConfigurationException e){e.printStackTrace();}
	        catch(SAXException e){e.printStackTrace();}
	        catch(IOException e){e.printStackTrace();}
	        catch(TransformerConfigurationException e){e.printStackTrace();}
	        catch(TransformerException e){e.printStackTrace();}
	
	
	
	
}
}
