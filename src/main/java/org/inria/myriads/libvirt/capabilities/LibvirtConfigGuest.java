package org.inria.myriads.libvirt.capabilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.inria.myriads.libvirt.domain.LibvirtConfigFeatures;

/**
 * @author msimonin
 *
 */
@XmlRootElement(name = "guest")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigGuest 
{
    /** os_type.*/
    @XmlElement(name = "os_type")
    private String osType_;
    
    /** arch. */
    @XmlElement(name = "arch")
    private LibvirtConfigArch arch_;
    
    /** features.*/
    @XmlElement(name = "features")
    private LibvirtConfigFeatures features_;

    
    /**
     * 
     */
    public LibvirtConfigGuest() 
    {
        arch_ = new LibvirtConfigArch();
        features_ = new LibvirtConfigFeatures();
    }

    /**
     * @return the osType
     */
    public String getOsType() 
    {
        return osType_;
    }

    /**
     * @param osType the osType to set
     * @return this
     */
    public LibvirtConfigGuest setOsType(String osType) 
    {
        osType_ = osType;
        return this;
    }

    /**
     * @return the arch
     */
    public LibvirtConfigArch getArch() 
    {
        return arch_;
    }

    /**
     * @param arch the arch to set
     * @return this
     */
    public LibvirtConfigGuest setArch(LibvirtConfigArch arch) 
    {
        arch_ = arch;
        return this;
    }

    /**
     * @return the features
     */
    public LibvirtConfigFeatures getFeatures() 
    {
        return features_;
    }

    /**
     * @param features the features to set
     * @return this
     */
    public LibvirtConfigGuest setFeatures(LibvirtConfigFeatures features) 
    {
        features_ = features;
        return this;
    }
    
    
}
