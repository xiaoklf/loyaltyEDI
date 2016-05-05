package pojo;

public class VendorGeographicalLocation
{
    private String State;

    private String CityName;

    private String Postal;

    private String Country;

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public String getCityName ()
    {
        return CityName;
    }

    public void setCityName (String CityName)
    {
        this.CityName = CityName;
    }

    public String getPostal ()
    {
        return Postal;
    }

    public void setPostal (String Postal)
    {
        this.Postal = Postal;
    }

    public String getCountry ()
    {
        return Country;
    }

    public void setCountry (String Country)
    {
        this.Country = Country;
    }

    public String toString()
    {
        return "ClassPojo [State = "+State+", CityName = "+CityName+", Postal = "+Postal+", Country = "+Country+"]";
    }
}
