package pojo;

public class ShipToName
{
    private String Name;

    private String EntityIdentifierCode;

    private String IdentificationCodeQualifier;

    private String IdentificationCode;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getEntityIdentifierCode ()
    {
        return EntityIdentifierCode;
    }

    public void setEntityIdentifierCode (String EntityIdentifierCode)
    {
        this.EntityIdentifierCode = EntityIdentifierCode;
    }

    public String getIdentificationCodeQualifier ()
    {
        return IdentificationCodeQualifier;
    }

    public void setIdentificationCodeQualifier (String IdentificationCodeQualifier)
    {
        this.IdentificationCodeQualifier = IdentificationCodeQualifier;
    }

    public String getIdentificationCode ()
    {
        return IdentificationCode;
    }

    public void setIdentificationCode (String IdentificationCode)
    {
        this.IdentificationCode = IdentificationCode;
    }

    
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", EntityIdentifierCode = "+EntityIdentifierCode+", IdentificationCodeQualifier = "+IdentificationCodeQualifier+", IdentificationCode = "+IdentificationCode+"]";
    }
}
