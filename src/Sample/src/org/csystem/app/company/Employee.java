package org.csystem.app.company;

public abstract class Employee implements IEmployee {
    private String m_name;
    private String m_citizenId;
    private String m_address;

    //...

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        //...
        m_name = name;
    }

    public String getCitizenId()
    {
        return m_citizenId;
    }

    public void setCitizenId(String citizenId)
    {
        //...
        m_citizenId = citizenId;
    }

    public String getAddress()
    {
        return m_address;
    }

    public void setAddress(String address)
    {
        //...
        m_address = address;
    }



    //...
}
