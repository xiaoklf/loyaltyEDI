package pojo;

public class FunctionalGroupTrailer
{
    private String NumberOfTransaction;

    private String FunctionalGroupControlNumber;

    public String getNumberOfTransaction ()
    {
        return NumberOfTransaction;
    }

    public void setNumberOfTransaction (String NumberOfTransaction)
    {
        this.NumberOfTransaction = NumberOfTransaction;
    }

    public String getFunctionalGroupControlNumber ()
    {
        return FunctionalGroupControlNumber;
    }

    public void setFunctionalGroupControlNumber (String FunctionalGroupControlNumber)
    {
        this.FunctionalGroupControlNumber = FunctionalGroupControlNumber;
    }

    
    public String toString()
    {
        return "ClassPojo [NumberOfTransaction = "+NumberOfTransaction+", FunctionalGroupControlNumber = "+FunctionalGroupControlNumber+"]";
    }
}
