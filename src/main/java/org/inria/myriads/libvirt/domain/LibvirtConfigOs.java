package org.inria.myriads.libvirt.domain;

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
public class LibvirtConfigOs 
{

    /** os type. */
    private String type_;
    
    /** os arch.*/
    private String typeArch_; 
    
    /** os machine.*/
    private String typeMachine_;

    /** boot.*/
    @SuppressWarnings("unused")
    private String boot_;
    
    /** boot dev. */
    private String bootDev_;
    
    /**
     * 
     */
    public LibvirtConfigOs()
    {
        typeArch_ = "x86_64";
        typeMachine_ = "pc-0.12";
        type_ = "hvm";
        bootDev_ = "hd"; 
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
    @XmlPath("type/@arch")
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
    @XmlPath("type/@machine")
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
    @XmlPath("boot/@dev")
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
