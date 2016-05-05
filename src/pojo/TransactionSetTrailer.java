package pojo;

public class TransactionSetTrailer
{
    private String TransactionSetControlNumber;

    private String NumberOfSegments;

    public String getTransactionSetControlNumber ()
    {
        return TransactionSetControlNumber;
    }

    public void setTransactionSetControlNumber (String TransactionSetControlNumber)
    {
        this.TransactionSetControlNumber = TransactionSetControlNumber;
    }

    public String getNumberOfSegments ()
    {
        return NumberOfSegments;
    }

    public void setNumberOfSegments (String NumberOfSegments)
    {
        this.NumberOfSegments = NumberOfSegments;
    }

    
    public String toString()
    {
        return "ClassPojo [TransactionSetControlNumber = "+TransactionSetControlNumber+", NumberOfSegments = "+NumberOfSegments+"]";
    }
}
	
