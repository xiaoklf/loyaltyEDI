package pojo;

public class RelatedInstructions
{
    private String ShipmentMethod;

    private String Description;

    private String LocationQualifier;

    public String getShipmentMethod ()
    {
        return ShipmentMethod;
    }

    public void setShipmentMethod (String ShipmentMethod)
    {
        this.ShipmentMethod = ShipmentMethod;
    }

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public String getLocationQualifier ()
    {
        return LocationQualifier;
    }

    public void setLocationQualifier (String LocationQualifier)
    {
        this.LocationQualifier = LocationQualifier;
    }

    
    public String toString()
    {
        return "ClassPojo [ShipmentMethod = "+ShipmentMethod+", Description = "+Description+", LocationQualifier = "+LocationQualifier+"]";
    }
}