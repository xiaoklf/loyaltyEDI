package test;

import org.milyn.*;
import org.milyn.container.*;
import org.milyn.io.*;
import org.milyn.payload.JavaResult;
import org.xml.sax.*;
import pojo.Order;
import javax.xml.transform.stream.*;
import java.io.*;
import java.util.*;

/**
 * Simple example EdiToJavaDemo
 * @author Xiao Su
 */
public class EdiToJavaDemo {

    private static byte[] messageIn = readInputMessage();

    private final Smooks smooks;

    protected EdiToJavaDemo() throws IOException, SAXException {
        // Instantiate Smooks with the config...
        smooks = new Smooks("src/config/smooks-EdiToJavaBean.xml");
    }

    protected Order runSmooksTransform(ExecutionContext executionContext) throws IOException, SAXException, SmooksException {
    	try {
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(new Locale("en", "IE"));

            JavaResult javaResult = new JavaResult();

            // Filter the input message to the outputWriter, using the execution context...
            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(messageIn)), javaResult);

            Locale.setDefault(defaultLocale);

            return (Order) javaResult.getBean("order");
        } finally {
            smooks.close();
        }
    }

    public static void main(String[] args) throws IOException, SAXException, SmooksException {
        System.out.println("\n\n==============Message In==============");
        System.out.println(new String(messageIn));
        System.out.println("======================================\n");


        EdiToJavaDemo ediToJava = new EdiToJavaDemo();
        ExecutionContext executionContext = ediToJava.smooks.createExecutionContext();
        Order order = ediToJava.runSmooksTransform(executionContext);

        System.out.println("\n============Order Javabeans===========");
        System.out.println("InterchangeControlHeaderDetail: " + order.getInterchangeControlHeaderDetail());
        System.out.println("\n");
        System.out.println("======================================");
        System.out.println("\n\n");

        pause("Press 'enter' to finish...");
    }

    private static byte[] readInputMessage() {
        try {
        	return StreamUtils.readStream(new FileInputStream("src/input/BIPO_0000003257_04_21_2016_1_34_12.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            return "<no-message/>".getBytes();
        }
    }

    private static void pause(String message) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("> " + message);
            in.readLine();
        } catch (IOException e) {
        }
        System.out.println("\n");
    }

    public Order runSmooksTransform() throws IOException, SAXException {
        ExecutionContext executionContext = smooks.createExecutionContext();
        return (Order)runSmooksTransform(executionContext);
    }
}
