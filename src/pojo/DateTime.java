package pojo;

public class DateTime
{
    private String Date;

    private String Qualifier;

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    public String getQualifier ()
    {
        return Qualifier;
    }

    public void setQualifier (String Qualifier)
    {
        this.Qualifier = Qualifier;
    }

    
    public String toString()
    {
        return "ClassPojo [Date = "+Date+", Qualifier = "+Qualifier+"]";
    }
}