package test;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.payload.JavaResult;
import org.milyn.io.StreamUtils;
import org.milyn.container.ExecutionContext;
import org.xml.sax.SAXException;
import pojo.Order;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/**
 * Simple example XmlToJavaDemo
 * @author Xiao Su
 */

public class XmlToJavaDemo {
    private static byte[] messageIn = readInputMessage();

    protected static Order runSmooks() throws IOException, SAXException, SmooksException {

        // Instantiate Smooks with the config...
        Smooks smooks = new Smooks("src/config/smooks-XmlToJavaBean.xml");
        System.out.print("config ok\n");
        try {
             // Create an exec context - no profiles....
            ExecutionContext executionContext = smooks.createExecutionContext();
            // The result of this transform is a set of Java objects...
            JavaResult result = new JavaResult();

            // Configure the execution context to generate a report...
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

            // Filter the input message to extract, using the execution context...
            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(messageIn)), result);
            //System.out.print((Order) result.getBean("order"));
            return (Order) result.getBean("order");
        } finally {
            smooks.close();
        }
    }

    public static void main(String[] args) throws IOException, SAXException, SmooksException {
        System.out.println("\n\n");
        System.out.println("==============Message In==============");
        System.out.println(new String(messageIn));
        System.out.println("======================================\n");

        Order order = XmlToJavaDemo.runSmooks();

        System.out.println("\n============Order Javabeans===========");
        System.out.println("InterchangeControlHeaderDetail: " + order.getInterchangeControlHeaderDetail());

        System.out.println("\n");

        System.out.println("======================================");
        System.out.println("\n\n");
    }

    private static byte[] readInputMessage() {
        try {
            return StreamUtils.readStream(new FileInputStream("src/output/850_Order.xml"));
        } catch (IOException e) {
            e.printStackTrace();
            return "<no-message/>".getBytes();
        }
    }

}
