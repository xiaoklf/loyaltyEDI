package test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Locale;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.io.StreamUtils;
import org.milyn.payload.StringResult;
import org.xml.sax.SAXException;

public class Simulation {

	public static void main(String[] args) throws IOException, SAXException, SmooksException {
		// 1.KLF reads 850 FROM BI, and covert to original xml
		System.out.println("\n\n==============1.KLF reads 850 FROM BI, and covert to original xml==============");
		EdiToXml.main(args);

		// 2.Covert original xml to format xml what KLF needs
		System.out.println("\n\n==============2.Covert original xml to format xml what KLF needs==============");
		XmlToXml.main(args);

		// 3.KLF Sends 855 997PO TO BI
		System.out.println("\n\n==============3.KLF Sends 855 997PO TO BI==============");
		System.out.println("\n\n==============855==============");
		To855EDI.main(args);
		System.out.println("\n\n==============997==============");
		To997POEDI.main(args);

		// 4.KLF Sends 856ASN TO BI
		System.out.println("\n\n==============4.KLF Sends 856ASN TO BI==============");
		To856EDI.main(args);

		// 5.BI Sends 997FA for 856 back to confirm
		System.out.println("\n\n==============5.BI Sends 997FA for 856 back to confirm=============");
		To997FOR856EDI.main(args);

		// 6.KLF receive 997 to xml
		System.out.println("\n\n==============6.KLF receive 997 to xml=============");
		Edi997ToXml.main(args);

		// 7.KLF Sends 810 TO BI
		System.out.println("\n\n==============7.KLF Sends 810 TO BI==============");
		To810EDI.main(args);

		// 8.BI Sends back 997FA for 810 to confirm
		System.out.println("\n\n==============8.BI Sends back 997FA for 810 to confirm=============");
		To997FOR810EDI.main(args);

		// 9.KLF receive 997 to xml
		System.out.println("\n\n==============9.KLF receive 997 to xml=============");
		Edi997ToXml.main(args);
		pause("Press 'enter' to finish...");
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
}
