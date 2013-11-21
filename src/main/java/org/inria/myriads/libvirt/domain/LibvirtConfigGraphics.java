package org.inria.myriads.libvirt.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Simple graphics device.
 * Essentially to support vnc console.
 * 
 * @author msimonin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "graphics")
public class LibvirtConfigGraphics 
{
    /** Type.*/
    @XmlAttribute(name = "type")
    private String type_;
    
    /** Type.*/
    @XmlAttribute(name = "listen")
    private String listen_;
    
    /** Type.*/
    @XmlAttribute(name = "port")
    private String port_;

    /** Keymap.*/
    @XmlAttribute(name = "keymap")
    private String keymap_;

    /**
     * @return the type
     */
    public String getType() 
    {
        return type_;
    }

    /**
     * @param type the type to set
     * @return this.
     */
    public LibvirtConfigGraphics setType(String type) 
    {
        type_ = type;
        return this;
    }

    /**
     * @return the listen
     */
    public String getListen() 
    {
        return listen_;
    }

    
    /**
     * @param listen    the listen address to set
     * @return  this.
     */
    public LibvirtConfigGraphics setListen(String listen) 
    {
        listen_ = listen;
        return this;
    }

    /**
     * @return the port
     */
    public String getPort() 
    {
        return port_;
    }

    /**
     * @param port the port to set
     * @return this.
     */
    public LibvirtConfigGraphics setPort(String port) 
    {
        port_ = port;
        return this;
    }

    /**
     * 
     * @param keymap    the keymap to set
     * return this
     */
    public LibvirtConfigGraphics setKeymap(String keymap)
    {
        keymap_ = keymap;
        return this;
        
    }

    /**
     * @return the keymap
     */
    public String getKeymap() 
    {
        return keymap_;
    }
    
   
}
