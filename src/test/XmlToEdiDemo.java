package test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;
import javax.xml.transform.stream.StreamSource;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.io.StreamUtils;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

public class XmlToEdiDemo {
	  private static byte[] messageIn = readInputMessage();
	  
	    protected static String runSmooksTransform() throws IOException, SAXException, SmooksException {
	    	
	    	Locale defaultLocale = Locale.getDefault();
	    	Locale.setDefault(new Locale("en", "IE"));
	    	
	        // Instantiate Smooks with the config...
	        Smooks smooks = new Smooks("src/config/smooks-EdiToXml.xml");
	        //smooks.createExecutionContext(arg0)
	        try {
	             // Create an exec context - no profiles....
	            ExecutionContext executionContext = smooks.createExecutionContext();

	            StringResult result = new StringResult();

	            

	            // Filter the input message to the outputWriter, using the execution context...
	            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(messageIn)), result);
	            Locale.setDefault(defaultLocale);

	            return result.getResult();
	        } finally {
	            smooks.close();
	        }
	    }

	  
	  private static byte[] readInputMessage() {
	        try {
	            return StreamUtils.readStream(new FileInputStream("src/input/BIPO_0000003257_04_21_2016_1_34_12.txt"));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return "<no-message/>".getBytes();
	        }
	    }
}
