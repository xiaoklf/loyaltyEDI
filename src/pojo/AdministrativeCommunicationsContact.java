package pojo;

public class AdministrativeCommunicationsContact
{
    private String BIBuyerFullName;

    private String ContactFunctionCode;

    public String getBIBuyerFullName ()
    {
        return BIBuyerFullName;
    }

    public void setBIBuyerFullName (String BIBuyerFullName)
    {
        this.BIBuyerFullName = BIBuyerFullName;
    }

    public String getContactFunctionCode ()
    {
        return ContactFunctionCode;
    }

    public void setContactFunctionCode (String ContactFunctionCode)
    {
        this.ContactFunctionCode = ContactFunctionCode;
    }


    public String toString()
    {
        return "ClassPojo [BIBuyerFullName = "+BIBuyerFullName+", ContactFunctionCode = "+ContactFunctionCode+"]";
    }
}
