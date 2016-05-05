package pojo;

public class FunctionalGroupHeader
{
    private String VersionReleaseIndustryCode;

    private String ApplicationReceiverCode;

    private String Time;

    private String GroupControlNumber;

    private String Date;

    private String ApplicationSenderCode;

    private String ResponsibleAgencyCode;

    private String FunctionalIdentifierCode;

    public String getVersionReleaseIndustryCode ()
    {
        return VersionReleaseIndustryCode;
    }

    public void setVersionReleaseIndustryCode (String VersionReleaseIndustryCode)
    {
        this.VersionReleaseIndustryCode = VersionReleaseIndustryCode;
    }

    public String getApplicationReceiverCode ()
    {
        return ApplicationReceiverCode;
    }

    public void setApplicationReceiverCode (String ApplicationReceiverCode)
    {
        this.ApplicationReceiverCode = ApplicationReceiverCode;
    }

    public String getTime ()
    {
        return Time;
    }

    public void setTime (String Time)
    {
        this.Time = Time;
    }

    public String getGroupControlNumber ()
    {
        return GroupControlNumber;
    }

    public void setGroupControlNumber (String GroupControlNumber)
    {
        this.GroupControlNumber = GroupControlNumber;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    public String getApplicationSenderCode ()
    {
        return ApplicationSenderCode;
    }

    public void setApplicationSenderCode (String ApplicationSenderCode)
    {
        this.ApplicationSenderCode = ApplicationSenderCode;
    }

    public String getResponsibleAgencyCode ()
    {
        return ResponsibleAgencyCode;
    }

    public void setResponsibleAgencyCode (String ResponsibleAgencyCode)
    {
        this.ResponsibleAgencyCode = ResponsibleAgencyCode;
    }

    public String getFunctionalIdentifierCode ()
    {
        return FunctionalIdentifierCode;
    }

    public void setFunctionalIdentifierCode (String FunctionalIdentifierCode)
    {
        this.FunctionalIdentifierCode = FunctionalIdentifierCode;
    }

    
    public String toString()
    {
        return "ClassPojo [VersionReleaseIndustryCode = "+VersionReleaseIndustryCode+", ApplicationReceiverCode = "+ApplicationReceiverCode+", Time = "+Time+", GroupControlNumber = "+GroupControlNumber+", Date = "+Date+", ApplicationSenderCode = "+ApplicationSenderCode+", ResponsibleAgencyCode = "+ResponsibleAgencyCode+", FunctionalIdentifierCode = "+FunctionalIdentifierCode+"]";
    }
}
