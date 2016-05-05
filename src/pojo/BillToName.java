package pojo;

public class BillToName
{
    private String EntityIdentifierCode;

    private String BillToName;

    public String getEntityIdentifierCode ()
    {
        return EntityIdentifierCode;
    }

    public void setEntityIdentifierCode (String EntityIdentifierCode)
    {
        this.EntityIdentifierCode = EntityIdentifierCode;
    }

    public String getBillToName ()
    {
        return BillToName;
    }

    public void setBillToName (String BillToName)
    {
        this.BillToName = BillToName;
    }

    
    public String toString()
    {
        return "ClassPojo [EntityIdentifierCode = "+EntityIdentifierCode+", BillToName = "+BillToName+"]";
    }
}
