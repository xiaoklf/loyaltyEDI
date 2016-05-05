package pojo;

public class ProductDescription
{
    private String ItemDescriptionType;

    private String ProductDescription;

    public String getItemDescriptionType ()
    {
        return ItemDescriptionType;
    }

    public void setItemDescriptionType (String ItemDescriptionType)
    {
        this.ItemDescriptionType = ItemDescriptionType;
    }

    public String getProductDescription ()
    {
        return ProductDescription;
    }

    public void setProductDescription (String ProductDescription)
    {
        this.ProductDescription = ProductDescription;
    }

    
    public String toString()
    {
        return "ClassPojo [ItemDescriptionType = "+ItemDescriptionType+", ProductDescription = "+ProductDescription+"]";
    }
}
