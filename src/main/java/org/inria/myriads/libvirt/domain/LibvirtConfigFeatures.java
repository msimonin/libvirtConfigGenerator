package org.inria.myriads.libvirt.domain;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Features.
 * 
 * @author msimonin
 *
 */
@XmlRootElement(name = "features")
public class LibvirtConfigFeatures
{
    /**acpi.*/
    @XmlElement(name = "acpi")
    private String acpi_;
    
    /** apic. */
    @XmlElement(name = "apic")
    private String apic_;

    /** pae.*/
    @XmlElement(name = "pae")
    private String pae_;
    
    
    /**
     * 
     * Enables acpi.
     * 
     * @return LibvirtConfigFeatures
     */
    public LibvirtConfigFeatures enableAcpi()
    {
        acpi_ = "";
        return this;
    }
    
    /**
     * 
     * Disabe Acpi.
     * 
     * @return LibvirtConfigFeatures
     */
    public LibvirtConfigFeatures disableAcpi()
    {
        acpi_ = null;
        return this;
    }
    

    /**
     * 
     * Enables apic.
     * 
     * @return LibvirtConfigFeatures
     */
    public LibvirtConfigFeatures enableApic()
    {
        apic_ = "";
        return this;
    }
    
    /**
     * 
     * Disabe Apic.
     * 
     * @return LibvirtConfigFeatures
     */
    public LibvirtConfigFeatures disableApic()
    {
        apic_ = null;
        return this;
    }

    /**
     * 
     * Enables apic.
     * 
     * @return LibvirtConfigFeatures
     */
    public LibvirtConfigFeatures enablePae()
    {
        pae_ = "";
        return this;
    }
    
    /**
     * 
     * Disabe pae.
     * 
     * @return LibvirtConfigFeatures
     */
    public LibvirtConfigFeatures disablePae()
    {
        pae_ = null;
        return this;
    }
    
    
}
