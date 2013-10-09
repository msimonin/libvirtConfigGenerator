package org.inria.myriads.libvirt.capabilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author msimonin
 *
 */
@XmlRootElement(name = "machine")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigMachine 
{
    
    /** machine.*/
    @XmlValue
    private String machine_;
    
    
    /** machine canonical. */
    @XmlAttribute(name = "canonical")
    private String machineCanonical_;


    /**
     * @return the machine
     */
    public String getMachine() 
    {
        return machine_;
    }


    /**
     * @param machine the machine to set
     * @return this
     */
    public LibvirtConfigMachine setMachine(String machine) 
    {
        machine_ = machine;
        return this;
    }


    /**
     * @return the machineCanonical
     */
    public String getMachineCanonical() 
    {
        return machineCanonical_;
    }


    /**
     * @param machineCanonical the machineCanonical to set
     * @return this
     */
    public LibvirtConfigMachine setMachineCanonical(String machineCanonical) 
    {
        machineCanonical_ = machineCanonical;
        return this;
    }
    
}
