package org.inria.myriads.libvirt.volume;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 * @author msimonin
 *
 */
@XmlRootElement(name = "info")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigVolumeInfo 
{
    /** path.*/
    @XmlElement(name = "path")
    private String path_;
    
    /** format.*/
    @XmlElement(name = "format")
    private String format_;
    
    /** format type.*/
    @XmlPath("format/@type")
    private String formatType_;

    /** permissions.*/
    @XmlElement(name = "permissions")
    private LibvirtConfigVolumePermissions permissions_;

    /**
     * @return the path
     */
    public String getPath() 
    {
        return path_;
    }

    /**
     * @param path the path to set
     * @return this
     */
    public LibvirtConfigVolumeInfo setPath(String path)
    {
        path_ = path;
        return this;
    }

    /**
     * @return the formatType
     */
    public String getFormatType() 
    {
        return formatType_;
    }

    /**
     * @param formatType the formatType to set
     * @return this
     */
    public LibvirtConfigVolumeInfo setFormatType(String formatType)
    {
        formatType_ = formatType;
        return this;
    }

    /**
     * @return the permissions
     */
    public LibvirtConfigVolumePermissions getPermissions() 
    {
        return permissions_;
    }

    /**
     * @param permissions the permissions to set
     * @return this
     */
    public LibvirtConfigVolumeInfo setPermissions(LibvirtConfigVolumePermissions permissions)
    {
        permissions_ = permissions;
        return this;
    }
    
    
}
