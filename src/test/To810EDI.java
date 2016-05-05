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

public class To810EDI {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		try {
			
			Template template = cfg.getTemplate("src/config/810_EDI.ftl");
			
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

			//ST*810*${TransactionSetControlNumber}~
			data.put("TransactionSetControlNumber", "0001");
			
			//BIG*${InvoiceIssueDate}*${InvoiceNumber}*${PurchaseOrderDate}*${PurchaseOrderNumber}~
			data.put("InvoiceIssueDate", "20080920");
			data.put("InvoiceNumber", "1234567890");
			data.put("PurchaseOrderDate", "20080919");
			data.put("PurchaseOrderNumber", "0000770562");

			//REF*${ReferenceIdentificationQualifier}*${InvoiceNumber}~
			data.put("ReferenceIdentificationQualifier", "0001382203");
			data.put("InvoiceNumber", "0001382203");

			//ITD************${DescriptionsOfTerms}~
			data.put("DescriptionsOfTerms", "testtest");

			//DTM*${DateQualifier}*${Date}~
			data.put("DateQualifier", "011");
			data.put("Date", "20110105");
			
			//IT1**${QuantityInvoiced}*${UnitOfMeasure}*${UnitPrice}**${ProductIDQualifier}*${ProductID}*${ProductIDQualifier2}*${ProductID2}~
			data.put("QuantityInvoiced", "1");
			data.put("UnitOfMeasure", "EA");
			data.put("UnitPrice", "2000.00");
			data.put("ProductIDQualifier", "IN");
			data.put("ProductID", "123456789");
			data.put("ProductIDQualifier2", "VP");
			data.put("ProductID2", "123456789");
			
			//PID*${ItemDescriptionType}****${Description}~
			data.put("ItemDescriptionType", "F");
			data.put("Description", "123456789");
			
			//TDS${TotalAmount}~
			data.put("TotalAmount", "2222.00");
			
			//CAD*****${CarrierDescription}****${ReferenceIdentificationQualifier}~
			data.put("CarrierDescription", "abcdd");
			data.put("ReferenceIdentificationQualifier", "BM");
			
			//SAC*${ServiceChargeIndicator}*${ServiceChargeCode}***${ServiceFreightAmount}~
			data.put("ServiceChargeIndicator", "C");
			data.put("ServiceChargeCode", "D240");
			data.put("ServiceFreightAmount", "20000.00");
			
			//SAC*${EnvironmentalChargeIndicator}*${EnvironmentalChargeCode}***${EnvironmentalFreightAmount}~
			data.put("EnvironmentalChargeIndicator", "C");
			data.put("EnvironmentalChargeCode", "D540");
			data.put("EnvironmentalFreightAmount", "20000.00");
			
			//SAC*${TaxesChargeIndicator}*${TaxesChargeCode}***${TaxesFreightAmount}~
			data.put("TaxesChargeIndicator", "C");
			data.put("TaxesChargeCode", "H850");
			data.put("TaxesFreightAmount", "20000.00");
			
			//TXI*${TaxCodeType}*${TaxAmount}~
			data.put("TaxCodeType", "VA");
			data.put("TaxAmount", "23.08");
			
			//ISS*${NumberOfUnitsShipped}*${UnitOfMeasure}*${Weight}*${UnitOfMeasureCode}~
			data.put("NumberOfUnitsShipped", "12345789");
			data.put("UnitOfMeasure", "EA");
			data.put("Weight", "23.08");
			data.put("UnitOfMeasureCode", "LB");
			
			//CTT*${NumberOfLineItems}~
			data.put("NumberOfLineItems", "2");
			
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
