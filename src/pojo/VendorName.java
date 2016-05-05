package pojo;

public class VendorName
{
    private String VendorName;

    private String EntityIdentifierCode;

    public String getVendorName ()
    {
        return VendorName;
    }

    public void setVendorName (String VendorName)
    {
        this.VendorName = VendorName;
    }

    public String getEntityIdentifierCode ()
    {
        return EntityIdentifierCode;
    }

    public void setEntityIdentifierCode (String EntityIdentifierCode)
    {
        this.EntityIdentifierCode = EntityIdentifierCode;
    }

    
    public String toString()
    {
        return "ClassPojo [VendorName = "+VendorName+", EntityIdentifierCode = "+EntityIdentifierCode+"]";
    }
}