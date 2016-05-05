package pojo;

public class BaselineItemData
{
    private String BasisUnitPriceCode;

    private String VendorPartNumber;

    private String UPCNumber;

    private String VendorProductQualifier;

    private String Unknown;

    private String BIItemNumber;

    private String UnitPrice;

    private String UPCProductQualifier;

    private String BIProductQualifier;

    private String QuantityOrdered;

    private String UnitMeasure;

    public String getBasisUnitPriceCode ()
    {
        return BasisUnitPriceCode;
    }

    public void setBasisUnitPriceCode (String BasisUnitPriceCode)
    {
        this.BasisUnitPriceCode = BasisUnitPriceCode;
    }

    public String getVendorPartNumber ()
    {
        return VendorPartNumber;
    }

    public void setVendorPartNumber (String VendorPartNumber)
    {
        this.VendorPartNumber = VendorPartNumber;
    }

    public String getUPCNumber ()
    {
        return UPCNumber;
    }

    public void setUPCNumber (String UPCNumber)
    {
        this.UPCNumber = UPCNumber;
    }

    public String getVendorProductQualifier ()
    {
        return VendorProductQualifier;
    }

    public void setVendorProductQualifier (String VendorProductQualifier)
    {
        this.VendorProductQualifier = VendorProductQualifier;
    }

    public String getUnknown ()
    {
        return Unknown;
    }

    public void setUnknown (String Unknown)
    {
        this.Unknown = Unknown;
    }

    public String getBIItemNumber ()
    {
        return BIItemNumber;
    }

    public void setBIItemNumber (String BIItemNumber)
    {
        this.BIItemNumber = BIItemNumber;
    }

    public String getUnitPrice ()
    {
        return UnitPrice;
    }

    public void setUnitPrice (String UnitPrice)
    {
        this.UnitPrice = UnitPrice;
    }

    public String getUPCProductQualifier ()
    {
        return UPCProductQualifier;
    }

    public void setUPCProductQualifier (String UPCProductQualifier)
    {
        this.UPCProductQualifier = UPCProductQualifier;
    }

    public String getBIProductQualifier ()
    {
        return BIProductQualifier;
    }

    public void setBIProductQualifier (String BIProductQualifier)
    {
        this.BIProductQualifier = BIProductQualifier;
    }

    public String getQuantityOrdered ()
    {
        return QuantityOrdered;
    }

    public void setQuantityOrdered (String QuantityOrdered)
    {
        this.QuantityOrdered = QuantityOrdered;
    }

    public String getUnitMeasure ()
    {
        return UnitMeasure;
    }

    public void setUnitMeasure (String UnitMeasure)
    {
        this.UnitMeasure = UnitMeasure;
    }


    public String toString()
    {
        return "ClassPojo [BasisUnitPriceCode = "+BasisUnitPriceCode+", VendorPartNumber = "+VendorPartNumber+", UPCNumber = "+UPCNumber+", VendorProductQualifier = "+VendorProductQualifier+", Unknown = "+Unknown+", BIItemNumber = "+BIItemNumber+", UnitPrice = "+UnitPrice+", UPCProductQualifier = "+UPCProductQualifier+", BIProductQualifier = "+BIProductQualifier+", QuantityOrdered = "+QuantityOrdered+", UnitMeasure = "+UnitMeasure+"]";
    }
}
