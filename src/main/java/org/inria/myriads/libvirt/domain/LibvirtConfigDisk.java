package org.inria.myriads.libvirt.domain;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;
/**
 * 
 * Disk config.
 * @author msimonin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "disk")
public class LibvirtConfigDisk
{
    /** Device.*/
    @XmlAttribute(name = "device")
    private String device_;
   
    /** type.*/
   @XmlAttribute(name = "type")
   private String type_;

   /** driver.*/
   @XmlElement(name = "driver")
   private String driver_;
   
   /** driver name.*/ 
   @XmlPath("driver/@name")
   private String driverName_;
   
   /** driver type.*/
   @XmlPath("driver/@type")
   private String driverType_;
   
   /** Cache type.*/
   @XmlPath("driver/@cache")
   private String driverCache_;
   
   /** source.*/
   @XmlElement(name = "source")
   private String source_;
   
   /** souce file.*/
   @XmlPath("source/@file")
   private String sourceFile_;
   
   /** address.*/
   @XmlElement(name = "address")
   private LibvirtConfigAddress address_;
   
   /** target.*/
   @XmlElement(name = "target")
   private String target_;
   
   /** target bus.*/
   @XmlPath("target/@bus")
   private String targetBus_;
   
   /** target dev.*/
   @XmlPath("target/@dev")
   private String targetDev_;
  
   /**
    * Constructor.
    */
   public LibvirtConfigDisk()
   {
       device_ = "disk";
       type_ = "file";
   }
   
    /**
     * @return the device
     */
    public String getDevice()
    {
        return device_;
    }

/**
 * @param device the device to set
 * @return this 
 */
public LibvirtConfigDisk setDevice(String device)
{
    device_ = device;
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
public LibvirtConfigDisk setType(String type)
{
    type_ = type;
    return this;
}

/**
 * @return the driverName
 */
public String getDriverName()
{
    return driverName_;
}

/**
 * @param driverName the driverName to set
 * @return this
 */
public LibvirtConfigDisk setDriverName(String driverName)
{
    driverName_ = driverName;
    return this;
}

/**
 * @return the driverType
 */
public String getDriverType()
{
    return driverType_;
}

/**
 * @param driverType the driverType to set
 * @return this
 */
public LibvirtConfigDisk setDriverType(String driverType)
{
    driverType_ = driverType;
    return this;
}

/**
 * @return the sourceFile
 */
public String getSourceFile()
{
    return sourceFile_;
}

/**
 * @param sourceFile the sourceFile to set
 * @return this
 */
public LibvirtConfigDisk setSourceFile(String sourceFile)
{
    sourceFile_ = sourceFile;
    return this;
}

/**
 * @return the targetBus
 */
public String getTargetBus()
{
    return targetBus_;
}

/**
 * @param targetBus the targetBus to set
 * @return this
 */
public LibvirtConfigDisk setTargetBus(String targetBus)
{
    targetBus_ = targetBus;
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
 * @return this
 */
public LibvirtConfigDisk setTargetDev(String targetDev)
{
    targetDev_ = targetDev;
    return this;
}

/**
 * @return the driverCache
 */
public String getDriverCache() 
{
    return driverCache_;
}

/**
 * @param driverCache the driverCache to set
 */
public LibvirtConfigDisk setDriverCache(String driverCache) 
{
    driverCache_ = driverCache;
    return this;
}
   
   
    
    
}
