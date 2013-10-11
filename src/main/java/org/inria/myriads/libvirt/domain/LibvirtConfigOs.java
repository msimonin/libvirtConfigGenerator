package org.inria.myriads.libvirt.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 * 
 * Os section.
 * 
 * @author msimonin
 *
 */
@XmlRootElement(name = "os")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigOs 
{

    /** os type. */
    @XmlElement(name = "type")
    private String type_;
    
    /** os arch.*/
    @XmlPath("type/@arch")
    private String typeArch_; 
    
    /** os machine.*/
    @XmlPath("type/@machine")
    private String typeMachine_;

    /** boot.*/
    @XmlElement(name = "boot")
    private String boot_;
    
    /** boot dev. */
    @XmlPath("boot/@dev")
    private String bootDev_;
    

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
    public LibvirtConfigOs setType(String type)
    {
        type_ = type;
        return this;
    }


    /**
     * @return the typeArch
     */
    public String getTypeArch()
    {
        return typeArch_;
    }


    /**
     * @param typeArch the typeArch to set
     * @return this
     */
    public LibvirtConfigOs setTypeArch(String typeArch)
    {
        typeArch_ = typeArch;
        return this;
    }


    /**
     * @return the typeMachine
     */
    public String getTypeMachine()
    {
        return typeMachine_;
    }


    /**
     * @param typeMachine the typeMachine to set
     * @return this
     */
    public LibvirtConfigOs setTypeMachine(String typeMachine)
    {
        typeMachine_ = typeMachine;
        return this;
    }



    /**
     * @return the bootDev
     */
    public String getBootDev()
    {
        return bootDev_;
    }


    /**
     * @param bootDev the bootDev to set
     * @return this
     */
    public LibvirtConfigOs setBootDev(String bootDev)
    {
        bootDev_ = bootDev;
        return this;
    }

    
    
    
    
    
}
