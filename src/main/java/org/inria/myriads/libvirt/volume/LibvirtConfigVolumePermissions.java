package org.inria.myriads.libvirt.volume;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * LibvirtConfigVolumePermissions.
 * 
 * @author msimonin
 *
 */
@XmlRootElement(name = "permissions")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigVolumePermissions
{
    /** owner.*/
    @XmlElement(name = "owner")
    private String owner_;
    
    /** group.*/
    @XmlElement(name = "group")
    private String group_;
    
    /** mode.*/
    @XmlElement(name = "mode")
    private String mode_;
    
    /** label. */
    @XmlElement(name = "label")
    private String label_;

    /**
     * @return the owner
     */
    public String getOwner() 
    {
        return owner_;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) 
    {
        owner_ = owner;
    }

    /**
     * @return the group
     */
    public String getGroup() 
    {
        return group_;
    }

    /**
     * @param group the group to set
     * @return this
     */
    public LibvirtConfigVolumePermissions setGroup(String group) 
    {
        group_ = group;
        return this;
    }

    /**
     * @return the mode
     */
    public String getMode() 
    {
        return mode_;
    }

    /**
     * @param mode the mode to set
     * @return this
     */
    public LibvirtConfigVolumePermissions setMode(String mode) 
    {
        mode_ = mode;
        return this;
    }

    /**
     * @return the label
     */
    public String getLabel() 
    {
        return label_;
    }

    /**
     * @param label the label to set
     * @return this
     */
    public LibvirtConfigVolumePermissions setLabel(String label) 
    {
        label_ = label;
        return this;
    }
    
}
