package pojo;

public class TransactionTotals
{
    private String NumberofPurchaseOrdersLines;

    public String getNumberofPurchaseOrdersLines ()
    {
        return NumberofPurchaseOrdersLines;
    }

    public void setNumberofPurchaseOrdersLines (String NumberofPurchaseOrdersLines)
    {
        this.NumberofPurchaseOrdersLines = NumberofPurchaseOrdersLines;
    }

    
    public String toString()
    {
        return "ClassPojo [NumberofPurchaseOrdersLines = "+NumberofPurchaseOrdersLines+"]";
    }
}