package util;

 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.OutputStream;
 
 import javax.xml.transform.Result;
 import javax.xml.transform.Source;
 import javax.xml.transform.Transformer;
 import javax.xml.transform.TransformerFactory;
 import javax.xml.transform.sax.SAXResult;
 import javax.xml.transform.stream.StreamSource;
 
	 import org.apache.fop.apps.FOUserAgent;
 import org.apache.fop.apps.Fop;
 import org.apache.fop.apps.FopFactory;
 import org.apache.fop.apps.MimeConstants;

public class Formatter {
 
     public static void main(String[] args) throws Exception {
         File source = new File("D:/code/non/src/file/test.xml");
         File specs = new File("D:/code/non/src/file/test.xsl");
         File target = new File("test.pdf");
         FopFactory fopFactory = FopFactory.newInstance();
         fopFactory.setUserConfig("D:/code/non/src/file/fop-config.xml"); // 读取自定义配置
         FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
         OutputStream out = new FileOutputStream(target);
         out = new java.io.BufferedOutputStream(out);
         try {
            System.out.print("Generating PDF");
             Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
             TransformerFactory factory = TransformerFactory.newInstance();
             Transformer transformer = factory.newTransformer(new StreamSource(specs));
             Source src = new StreamSource(source);
             Result res = new SAXResult(fop.getDefaultHandler());
             transformer.transform(src, res);
             System.out.println("Done.");
         } finally {
             out.close();
         }
     }
 
 }
