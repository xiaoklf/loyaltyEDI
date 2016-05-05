package pojo;

public class Currency
{
    private String EntityIdentifierCode;

    private String CurrencyCode;

    public String getEntityIdentifierCode ()
    {
        return EntityIdentifierCode;
    }

    public void setEntityIdentifierCode (String EntityIdentifierCode)
    {
        this.EntityIdentifierCode = EntityIdentifierCode;
    }

    public String getCurrencyCode ()
    {
        return CurrencyCode;
    }

    public void setCurrencyCode (String CurrencyCode)
    {
        this.CurrencyCode = CurrencyCode;
    }

    
    public String toString()
    {
        return "ClassPojo [EntityIdentifierCode = "+EntityIdentifierCode+", CurrencyCode = "+CurrencyCode+"]";
    }
}
