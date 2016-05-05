package pojo;

public class POLineComments
{
    private String ReferenceIdentification;

    private String POLineComments;

    private String EntityIdentifierCode;

    public String getReferenceIdentification ()
    {
        return ReferenceIdentification;
    }

    public void setReferenceIdentification (String ReferenceIdentification)
    {
        this.ReferenceIdentification = ReferenceIdentification;
    }

    public String getPOLineComments ()
    {
        return POLineComments;
    }

    public void setPOLineComments (String POLineComments)
    {
        this.POLineComments = POLineComments;
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
        return "ClassPojo [ReferenceIdentification = "+ReferenceIdentification+", POLineComments = "+POLineComments+", EntityIdentifierCode = "+EntityIdentifierCode+"]";
    }
}
