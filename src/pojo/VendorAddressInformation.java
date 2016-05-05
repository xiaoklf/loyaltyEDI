package pojo;

public class VendorAddressInformation
{
    private String AddressInformation;

    private String AddressInformation2;

    public String getAddressInformation ()
    {
        return AddressInformation;
    }

    public void setAddressInformation (String AddressInformation)
    {
        this.AddressInformation = AddressInformation;
    }

    public String getAddressInformation2 ()
    {
        return AddressInformation2;
    }

    public void setAddressInformation2 (String AddressInformation2)
    {
        this.AddressInformation2 = AddressInformation2;
    }

    
    public String toString()
    {
        return "ClassPojo [AddressInformation = "+AddressInformation+", AddressInformation2 = "+AddressInformation2+"]";
    }
}
