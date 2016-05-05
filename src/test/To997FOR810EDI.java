package test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class To997FOR810EDI {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		try {
			
			Template template = cfg.getTemplate("src/config/997_PO_EDI.ftl");
			
			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			//ISA*${AuthorizationInformationQualifier}*${AuthorizationInformation}*${SecurityInformationQualifier}*${SecurityInformation}*${InterchangeIDQualifierSender}*${InterchangeSenderID}*${InterchangeIDQualifier}*${InterchangeIDQualifierSender}*${InterchangeSenderID}*${InterchangeIDQualifier}*${InterchangeReceiverID}*${InterchangeDate}*${InterchangeTime}*${InterchangeControlStandardsIdentifier}*${InterchangeControlVersionNumber}*${InterchangeControlNumber}*${AcknowledgementRequested}*${TestIndicator}*>~
			data.put("AuthorizationInformationQualifier", "00");
			data.put("AuthorizationInformation", "          ");
			data.put("SecurityInformationQualifier", "00");
			data.put("SecurityInformation", "          ");
			data.put("InterchangeIDQualifierSender", "12");
			data.put("InterchangeSenderID", "7172557825     ");
			data.put("InterchangeIDQualifier", "ZZ");
			data.put("InterchangeReceiverID", "BI WORLDWIDE   ");
			data.put("InterchangeDate", "110105");
			data.put("InterchangeTime", "1013");
			data.put("InterchangeControlStandardsIdentifier", "<");
			data.put("InterchangeControlVersionNumber", "04030");
			data.put("InterchangeControlNumber", "000010332");
			data.put("AcknowledgementRequested", "0");
			data.put("TestIndicator", "T");
			
			//GS*FA*${ApplicationSenderCode}*${ApplicationReceiverCode}*${Date}*${Time}*${GroupControlNumber}*${ResponsibleAgencyCode}*${Version}~
			data.put("ApplicationSenderCode", "7172557825");
			data.put("ApplicationReceiverCode", "BI WORLDWIDE");
			data.put("Date", "20110105");
			data.put("Time", "1013");
			data.put("GroupControlNumber", "10332");
			data.put("ResponsibleAgencyCode", "X");
			data.put("Version", "004030");

			//ST*${TransactionSetIdentifierCode}*${TransactionSetControlNumber}~
			data.put("TransactionSetIdentifierCode", "997");
			data.put("TransactionSetControlNumber", "0008");
			
			//AK1*${FunctionalIdentifierCode}*${GroupControlNumber}~
			data.put("FunctionalIdentifierCode", "PO");
			data.put("GroupControlNumber", "326080950");

			//AK2*${TransactionSetIdentifierCode}*${TransactionSetControlNumber}~
			data.put("TransactionSetIdentifierCode", "810");
			data.put("TransactionSetControlNumber", "000770559");
			
			//AK5*${TransactionSetAcknowledgementCode}~
			data.put("TransactionSetAcknowledgementCode", "A");
			
			//AK9*${FunctionalGroupAcknowledgementCode}*${NumberOfTransactionSetsIncluded}*${NumberOfReceivedTransactionsSets}*${NumberOfAcceptedTransactionSets}~
			data.put("FunctionalGroupAcknowledgementCode", "A");
			data.put("NumberOfTransactionSetsIncluded", "1");
			data.put("NumberOfReceivedTransactionsSets", "1");
			data.put("NumberOfAcceptedTransactionSets", "1");	
			
			//SE*${NumberOfIncludedSegments}*${TransactionSetControlNumber}~
			data.put("NumberOfIncludedSegments", "16");
			data.put("TransactionSetControlNumber", "0006");
			
			//GE*${NumberOfTransactionSetsIncluded}*${GroupControlNumber}~
			data.put("NumberOfTransactionSetsIncluded", "1");
			data.put("GroupControlNumber", "6");
			
			//IEA*${NumberOfFunctionalGroupsIncluded}*${InterchangeControlNumber}~
			data.put("NumberOfFunctionalGroupsIncluded", "1");
			data.put("InterchangeControlNumber", "000000011");
			
			
			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();

			// File output
			Writer file = new FileWriter (new File("src/output/997PO_0000003257_ACK_04_21_16_200000.txt"));
			template.process(data, file);
			file.flush();
			file.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
