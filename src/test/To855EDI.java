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

public class To855EDI {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		try {
			
			Template template = cfg.getTemplate("src/config/855_EDI.ftl");
			
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
			
			//GS*PR*${ApplicationSenderCode}*${ApplicationReceiverCode}*${Date}*${Time}*${GroupControlNumber}*${ResponsibleAgencyCode}*${Version}~
			data.put("ApplicationSenderCode", "7172557825");
			data.put("ApplicationReceiverCode", "BI WORLDWIDE");
			data.put("Date", "20110105");
			data.put("Time", "1013");
			data.put("GroupControlNumber", "10332");
			data.put("ResponsibleAgencyCode", "X");
			data.put("Version", "004030");

			//ST*855*${TransactionSetControlNumber}~
			data.put("TransactionSetControlNumber", "0001");
			
			//BAK**AC*${PurchaseOrderNumber}*${Date}*${ExpectedShipDate}~
			data.put("PurchaseOrderNumber", "0001382203");
			data.put("Date", "20110104");
			data.put("ExpectedShipDate", "20110105");

			//REF**${PurchaseOrderNumber}~
			data.put("PurchaseOrderNumber", "0001382203");

			//PO1*${AssignedIdentification}*${QuantityOrdered}*${UnitOfMeasure}*${UnitPrice}*${BasisOfUnitPriceCode}*${ProductQualifier}*${ProductIDVendor}*${ProductQualifier}*${ProductID}*${ProductQualifier}*${UPCCode}~
			data.put("AssignedIdentification", "1");
			data.put("QuantityOrdered", "1");
			data.put("UnitOfMeasure", "672.00000");
			data.put("UnitPrice", "");
			data.put("BasisOfUnitPriceCode", "");
			data.put("ProductQualifier", "VP");
			data.put("ProductIDVendor", "01752");
			data.put("ProductQualifier", "BP");
			data.put("ProductID", "Z0054493");
			data.put("ProductQualifier", "UP");
			data.put("UPCCode", "712725017521");

			//ACK*${LineItemStatusCode}*${Quantity}***${ExpectedShipDate}~
			data.put("LineItemStatusCode", "IB");
			data.put("Quantity", "1");
			data.put("ExpectedShipDate", "20111121");
			
			//CTT*${NumberOfLineItems}~
			data.put("NumberOfLineItems", "1");
			
			//SE*${NumberOfIncludedSegments}*${TransactionSetControlNumber}~
			data.put("NumberOfIncludedSegments", "7");
			data.put("TransactionSetControlNumber", "0001");
			
			//GE*${NumberOfTransactionSetsIncluded}*${GroupControlNumber}~
			data.put("NumberOfTransactionSetsIncluded", "");
			data.put("GroupControlNumber", "");
			
			//IEA*${NumberOfFunctionalGroupsIncluded}*${InterchangeControlNumber}~
			data.put("NumberOfFunctionalGroupsIncluded", "1");
			data.put("InterchangeControlNumber", "000010332");
			
			
			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();

			// File output
			Writer file = new FileWriter (new File("src/output/850_0000003257_ACK_04_21_16_200000.txt"));
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
