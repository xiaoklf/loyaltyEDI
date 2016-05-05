package pojo;

public class ReferenceIdentification
{
    private String ReferenceIdentificationQualifier;

    private String ReferenceIdentification;

    public String getReferenceIdentificationQualifier ()
    {
        return ReferenceIdentificationQualifier;
    }

    public void setReferenceIdentificationQualifier (String ReferenceIdentificationQualifier)
    {
        this.ReferenceIdentificationQualifier = ReferenceIdentificationQualifier;
    }

    public String getReferenceIdentification ()
    {
        return ReferenceIdentification;
    }

    public void setReferenceIdentification (String ReferenceIdentification)
    {
        this.ReferenceIdentification = ReferenceIdentification;
    }

    
    public String toString()
    {
        return "ClassPojo [ReferenceIdentificationQualifier = "+ReferenceIdentificationQualifier+", ReferenceIdentification = "+ReferenceIdentification+"]";
    }
}
