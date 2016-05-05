package pojo;

public class BillToAddressInformation
{
    private String AddressInformation;

    public String getAddressInformation ()
    {
        return AddressInformation;
    }

    public void setAddressInformation (String AddressInformation)
    {
        this.AddressInformation = AddressInformation;
    }

    public String toString()
    {
        return "ClassPojo [AddressInformation = "+AddressInformation+"]";
    }
}