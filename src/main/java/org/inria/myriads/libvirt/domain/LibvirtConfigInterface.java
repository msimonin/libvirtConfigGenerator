package org.inria.myriads.libvirt.domain;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;
/**
 * 
 * Interface.
 * 
 * @author msimonin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "interface")
public class LibvirtConfigInterface
{
    /** Device.*/
    @XmlAttribute(name = "type")
    private String type_;

    /** mac.*/
    @XmlElement(name = "mac")
    private String mac_;
    
    /**mac address.*/
    @XmlPath("mac/@address")
    private String macAddress_;
    
    /** source.*/
    @XmlElement(name = "source")
    private String bridge_;
    
    /** source bridge.*/
    @XmlPath("source/@bridge")
    private String sourceBridge_;
    
    /** target. */
    @XmlElement(name = "target")
    private String target_;
    
    /** target dev. */
    @XmlPath("target/@dev")
    private String targetDev_;
    
    /**
     * @return the type
     */
    public String getType()
    {
        return type_;
    }

    /**
     * @param type the type to set
     * @return this
     */
    public LibvirtConfigInterface setType(String type)
    {
        type_ = type;
        return this;
    }

    /**
     * @return the macAddress
     */
    public String getMacAddress()
    {
        return macAddress_;
    }

    /**
     * @param macAddress the macAddress to set
     * @return this
     */
    public LibvirtConfigInterface setMacAddress(String macAddress) 
    {
        macAddress_ = macAddress;
        return this;
    }
    

    /**
     * @return the sourceBridge
     */
    public String getSourceBridge()
    {
        return sourceBridge_;
    }

    /**
     * @param sourceBridge the sourceBridge to set
     * @return this.
     */
    public LibvirtConfigInterface setSourceBridge(String sourceBridge) 
    {
        sourceBridge_ = sourceBridge;
        return this;
    }

    /**
     * @return the targetDev
     */
    public String getTargetDev() 
    {
        return targetDev_;
    }

    /**
     * @param targetDev the targetDev to set
     */
    public void setTargetDev(String targetDev) 
    {
        this.targetDev_ = targetDev;
    }
}
