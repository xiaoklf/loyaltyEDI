package pojo;

public class TransactionSetHeader
{
    private String TransactionSetControlNumber;

    private String TransactionSetIdentifierCode;

    public String getTransactionSetControlNumber ()
    {
        return TransactionSetControlNumber;
    }

    public void setTransactionSetControlNumber (String TransactionSetControlNumber)
    {
        this.TransactionSetControlNumber = TransactionSetControlNumber;
    }

    public String getTransactionSetIdentifierCode ()
    {
        return TransactionSetIdentifierCode;
    }

    public void setTransactionSetIdentifierCode (String TransactionSetIdentifierCode)
    {
        this.TransactionSetIdentifierCode = TransactionSetIdentifierCode;
    }

    
    public String toString()
    {
        return "ClassPojo [TransactionSetControlNumber = "+TransactionSetControlNumber+", TransactionSetIdentifierCode = "+TransactionSetIdentifierCode+"]";
    }
}
