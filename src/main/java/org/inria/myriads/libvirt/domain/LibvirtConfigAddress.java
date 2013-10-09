package org.inria.myriads.libvirt.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * 
 * Disk config.
 * @author msimonin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "address")
public class LibvirtConfigAddress
{
    /** Device.*/
    @XmlAttribute(name = "bus")
    private String bus_;
   
    /** type.*/
   @XmlAttribute(name = "domain")
   private String domain_;
   
   /** function.*/
   @XmlAttribute(name = "function")
   private String function_;

   /** slot.*/
   @XmlAttribute(name = "slot")
   private String slot_;
   
   /** type.*/
   @XmlAttribute(name = "type")
   private String type_;

/**
 * @return the bus
 */
public String getBus()
{
    return bus_;
}

/**
 * @param bus the bus to set
 */
public void setBus(String bus)
{
    bus_ = bus;
}

/**
 * @return the domain
 */
public String getDomain()
{
    return domain_;
}

/**
 * @param domain the domain to set
 */
public void setDomain(String domain)
{
    domain_ = domain;
}

/**
 * @return the function
 */
public String getFunction()
{
    return function_;
}

/**
 * @param function the function to set
 */
public void setFunction(String function)
{
    function_ = function;
}

/**
 * @return the slot
 */
public String getSlot()
{
    return slot_;
}

/**
 * @param slot the slot to set
 */
public void setSlot(String slot)
{
    slot_ = slot;
}

/**
 * @return the type
 */
public String getType()
{
    return type_;
}

/**
 * @param type the type to set
 */
public void setType(String type)
{
    type_ = type;
}
   
   
   
}
