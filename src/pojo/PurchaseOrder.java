package pojo;

public class PurchaseOrder
{
    private String TransactionSetControlNumber;

    private String PurchaseOrderNumber;

    private String TransactionSetPurposeCode;

    private String PurchaseOrderDate;

    public String getTransactionSetControlNumber ()
    {
        return TransactionSetControlNumber;
    }

    public void setTransactionSetControlNumber (String TransactionSetControlNumber)
    {
        this.TransactionSetControlNumber = TransactionSetControlNumber;
    }

    public String getPurchaseOrderNumber ()
    {
        return PurchaseOrderNumber;
    }

    public void setPurchaseOrderNumber (String PurchaseOrderNumber)
    {
        this.PurchaseOrderNumber = PurchaseOrderNumber;
    }

    public String getTransactionSetPurposeCode ()
    {
        return TransactionSetPurposeCode;
    }

    public void setTransactionSetPurposeCode (String TransactionSetPurposeCode)
    {
        this.TransactionSetPurposeCode = TransactionSetPurposeCode;
    }

    public String getPurchaseOrderDate ()
    {
        return PurchaseOrderDate;
    }

    public void setPurchaseOrderDate (String PurchaseOrderDate)
    {
        this.PurchaseOrderDate = PurchaseOrderDate;
    }

    
    public String toString()
    {
        return "ClassPojo [TransactionSetControlNumber = "+TransactionSetControlNumber+", PurchaseOrderNumber = "+PurchaseOrderNumber+", TransactionSetPurposeCode = "+TransactionSetPurposeCode+", PurchaseOrderDate = "+PurchaseOrderDate+"]";
    }
}
