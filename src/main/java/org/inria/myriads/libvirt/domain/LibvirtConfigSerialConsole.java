package org.inria.myriads.libvirt.domain;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 * 
 * Serials, consoles, parallel...
 * 
 * @author msimonin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigSerialConsole
{
    /** type. */
    @XmlAttribute(name = "type")
    private String type_;
    
    /** source. */
    @XmlElement(name = "source")
    private String source_;
    
    /** source path. */
    @XmlPath("source/@path")
    private String sourcePath_;
    
    /** target. */
    @XmlElement(name = "target")
    private String target_;
    
    /** target type. */
    @XmlPath("target/@type")
    private String targetType_;
    
    /** target port. */
    @XmlPath("target/@port")
    private String targetPort_;

    /**
     * @return the sourcePath
     */
    public String getSourcePath()
    {
        return sourcePath_;
    }

    /**
     * @param sourcePath the sourcePath to set
     * @return this
     */
    public LibvirtConfigSerialConsole setSourcePath(String sourcePath)
    {
        sourcePath_ = sourcePath;
        return this;
    }

    /**
     * @return the targetType
     */
    public String getTargetType()
    {
        return targetType_;
    }

    /**
     * @param targetType the targetType to set
     * @return this
     */
    public LibvirtConfigSerialConsole setTargetType(String targetType)
    {
        targetType_ = targetType;
        return this;
    }

    /**
     * @return the targetPort
     */
    public String getTargetPort()
    {
        return targetPort_;
    }

    /**
     * @param targetPort the targetPort to set
     * @return this
     */
    public LibvirtConfigSerialConsole setTargetPort(String targetPort)
    {
        targetPort_ = targetPort;
        return this;
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
    public LibvirtConfigSerialConsole setType(String type)
    {
        type_ = type;
        return this;
    }
}
