package org.inria.myriads.libvirt.capabilities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Libvirt capabilities.
 * 
 * @author msimonin
 *
 */
@XmlRootElement(name = "capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigCapabilities 
{
    /** host.*/
    @XmlElement(name = "host")
    private LibvirtConfigHost host_;
    
    /** guests.*/
    @XmlElement(name = "guest")
    private ArrayList<LibvirtConfigGuest> guests_;

    /**
     * 
     */
    public LibvirtConfigCapabilities() 
    {
        host_ = new LibvirtConfigHost();
        guests_ = new ArrayList<LibvirtConfigGuest>();
    }

    /**
     * @return the host
     */
    public LibvirtConfigHost getHost() 
    {
        return host_;
    }

    /**
     * @param host the host to set
     * @return this
     */
    public LibvirtConfigCapabilities setHost(LibvirtConfigHost host) 
    {
        host_ = host;
        return this;
    }

    /**
     * @return the guests
     */
    public ArrayList<LibvirtConfigGuest> getGuests() 
    {
        return guests_;
    }

    /**
     * @param guests the guests to set
     * @return this
     */
    public LibvirtConfigCapabilities setGuests(ArrayList<LibvirtConfigGuest> guests) 
    {
        guests_ = guests;
        return this;
    }
    
    
}
