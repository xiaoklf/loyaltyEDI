package pojo;

public class CarrierDetails
{
    private String TransportTypeCode;

    private String Routing;

    public String getTransportTypeCode ()
    {
        return TransportTypeCode;
    }

    public void setTransportTypeCode (String TransportTypeCode)
    {
        this.TransportTypeCode = TransportTypeCode;
    }

    public String getRouting ()
    {
        return Routing;
    }

    public void setRouting (String Routing)
    {
        this.Routing = Routing;
    }

    
    public String toString()
    {
        return "ClassPojo [TransportTypeCode = "+TransportTypeCode+", Routing = "+Routing+"]";
    }
}
