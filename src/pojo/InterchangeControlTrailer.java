package pojo;

public class InterchangeControlTrailer
{
    private String NumberOfFunctionalGroupsIncluded;

    private String InterchangeControlNumber;

    public String getNumberOfFunctionalGroupsIncluded ()
    {
        return NumberOfFunctionalGroupsIncluded;
    }

    public void setNumberOfFunctionalGroupsIncluded (String NumberOfFunctionalGroupsIncluded)
    {
        this.NumberOfFunctionalGroupsIncluded = NumberOfFunctionalGroupsIncluded;
    }

    public String getInterchangeControlNumber ()
    {
        return InterchangeControlNumber;
    }

    public void setInterchangeControlNumber (String InterchangeControlNumber)
    {
        this.InterchangeControlNumber = InterchangeControlNumber;
    }

    
    public String toString()
    {
        return "ClassPojo [NumberOfFunctionalGroupsIncluded = "+NumberOfFunctionalGroupsIncluded+", InterchangeControlNumber = "+InterchangeControlNumber+"]";
    }
}
