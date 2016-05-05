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

public class To856EDI {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		try {
			
			Template template = cfg.getTemplate("src/config/856_EDI.ftl");
			
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
			
			//GS*SH*${ApplicationSenderCode}*${ApplicationReceiverCode}*${Date}*${Time}*${GroupControlNumber}*${ResponsibleAgencyCode}*${Version}~
			data.put("ApplicationSenderCode", "7172557825");
			data.put("ApplicationReceiverCode", "BI WORLDWIDE");
			data.put("Date", "20110105");
			data.put("Time", "1013");
			data.put("GroupControlNumber", "10332");
			data.put("ResponsibleAgencyCode", "X");
			data.put("Version", "004030");

			//ST*856*${TransactionSetControlNumber}~
			data.put("TransactionSetControlNumber", "0036");
			
			//BSN*${TransactionSetPurpose}*${ShipNoticeNumber}*${ShipNoticeDate}*${ShipNoticeTime}*${HierarchicalStructureCode}~
			data.put("TransactionSetPurpose", "00");
			data.put("ShipNoticeNumber", "29977");
			data.put("ShipNoticeDate", "20090218");
			data.put("ShipNoticeTime", "1342");
			data.put("HierarchicalStructureCode", "0001");

			//TD5*****${RoutingOriginalCourier}~
			data.put("RoutingOriginalCourier", "U.P.S.");

			//REF*${BillReferenceNumberQualifier}*${BillReferenceNumber}~
			data.put("BillReferenceNumberQualifier", "BM");
			data.put("BillReferenceNumber", "00000000000000000");

			//REF*${PickupReferenceNumberQualifier}*${PickupReferenceNumber}~
			data.put("PickupReferenceNumberQualifier", "P8");
			data.put("PickupReferenceNumber", "1Z1234560300021622");
			
			//DTM*${DateQualifier}*${Date}~
			data.put("DateQualifier", "011");
			data.put("Date", "20090310");
			
			//N1*${ShipToIdentifierCode}*${ShipToName}*${ShipToIdentificationCodeQualifier}*${ShipToIdentificationCode}~
			data.put("ShipToIdentifierCode", "ST");
			data.put("ShipToName", "");
			data.put("ShipToIdentificationCodeQualifier", "92");
			data.put("ShipToIdentificationCode", "0000");
			
			//N1*${ShipFromIdentifierCode}*${ShipFromName}~
			data.put("ShipFromIdentifierCode", "SF");
			data.put("ShipFromName", "SQUEST SALES & SERVICES~");
			
			//N3*${AddressInformation}*${AddressInformation2}~
			data.put("AddressInformation", "11605 MOORE ST.");
			data.put("AddressInformation2", "");
			
			//N4*${CityName}*${State}*${PostalCode}*${CountryCode}~
			data.put("CityName", "BRISTOL");
			data.put("State", "TN");
			data.put("PostalCode", "37620");
			data.put("CountryCode", "USA");
			
			//HL*${HierarchicalIDNumber}*${HierarchicalParentIDNumber}*${HierarchicalLevelCode}~
			data.put("HierarchicalIDNumber", "3");
			data.put("HierarchicalParentIDNumber", "2");
			data.put("HierarchicalLevelCode", "P");
			
			//PRF*${PurchaseOrderNumber}~
			data.put("PurchaseOrderNumber", "0000770561");

			//TD1*${PackingCode}*${LadingQuantity}****${WeightQualifier}*${Weight}*${UnitOfMeasure}~
			data.put("PackingCode", "CTN25");
			data.put("LadingQuantity", "1");
			data.put("WeightQualifier", "G");
			data.put("Weight", "102");
			data.put("UnitOfMeasure", "LB");
			
			//REF*${ReferenceIdentificationQualifier}*${ReferenceIdentificationDescription}~
			data.put("ReferenceIdentificationQualifier", "IA");
			data.put("ReferenceIdentificationDescription", "NONE");
			
			//HL*${HierarchicalIDNumber}*${HierarchicalParentIDNumber}*P~
			data.put("HierarchicalIDNumber", "3");
			data.put("HierarchicalParentIDNumber", "2");
			
			//MAN*${MarksNumberQualifier}*${MarksMeasuresDescription}~
			data.put("MarksNumberQualifier", "GM");
			data.put("MarksMeasuresDescription", "00007939930122244735");
			
			//HL*${HierarchicalIDNumber}*${HierarchicalParentIDNumber}*${HierarchicalLevelCode}~
			data.put("HierarchicalIDNumber", "4");
			data.put("HierarchicalParentIDNumber", "3");
			data.put("HierarchicalLevelCode", "I");
			
			//LIN**${ProductServiceQualifier}*${ProductID}*${ProductServiceQualifier2}*${ProductID2}~
			data.put("ProductServiceQualifier", "SK");
			data.put("ProductID", "24146100");
			data.put("ProductServiceQualifier2", "VA");
			data.put("ProductID2", "X133004");
			
			//SN1**${NumberOfUnitsShipped}*${UnitOfMeasure}**${QuantityOrdered}*${UnitOfMeasure}~
			data.put("NumberOfUnitsShipped", "1");
			data.put("UnitOfMeasure", "EA");
			data.put("QuantityOrdered", "1");
			data.put("UnitOfMeasure", "EA");
			
			//SLN*${AssignedIdentification}**${RelationshipCode}*${Quantity}*${UnitOfMeasure}*${UnitPrice}~
			data.put("AssignedIdentification", "3");
			data.put("RelationshipCode", "I");
			data.put("Quantity", "");
			data.put("UnitOfMeasure", "");
			data.put("UnitPrice", "308");
			
			//PID*${ItemDescriptionType}****${ProductDescription}~
			data.put("ItemDescriptionType", "F");
			data.put("ProductDescription", "1695R CANOE");
			
			//CTT*${NumberOfLineItems}~
			data.put("NumberOfLineItems", "4");
			
			//SE*${NumberOfIncludedSegments}*${TransactionSetControlNumber}~
			data.put("NumberOfIncludedSegments", "33");
			data.put("TransactionSetControlNumber", "0014");
			
			//GE*${NumberOfTransactionSetsIncluded}*${GroupControlNumber}~
			data.put("NumberOfTransactionSetsIncluded", "6");
			data.put("GroupControlNumber", "3");
			
			//IEA*${NumberOfFunctionalGroupsIncluded}*${InterchangeControlNumber}~
			data.put("NumberOfFunctionalGroupsIncluded", "1");
			data.put("InterchangeControlNumber", "000010332");
			
			
			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();

			// File output
			Writer file = new FileWriter (new File("src/output/0000003257_ASN_04_21_16_200000.txt"));
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
