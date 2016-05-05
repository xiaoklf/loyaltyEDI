package pojo;

public class PurchaseOrderHeader
{
    private String ReferenceCode;

    private String MessageText;

    public String getReferenceCode ()
    {
        return ReferenceCode;
    }

    public void setReferenceCode (String ReferenceCode)
    {
        this.ReferenceCode = ReferenceCode;
    }

    public String getMessageText ()
    {
        return MessageText;
    }

    public void setMessageText (String MessageText)
    {
        this.MessageText = MessageText;
    }

    
    public String toString()
    {
        return "ClassPojo [ReferenceCode = "+ReferenceCode+", MessageText = "+MessageText+"]";
    }
}
