package org.inria.myriads.libvirt.capabilities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 * @author msimonin
 *
 */
@XmlRootElement(name = "arch")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigArch 
{
    /** name.*/
    @XmlAttribute(name = "name")
    private String name_;
    
    /** wordsize.*/
    @XmlElement(name = "wordsize")
    private String wordsize_;
    
    /** domain.*/
    @XmlElement(name = "domain")
    private String domain_;
    
    /** domain type.*/
    @XmlPath("domain/@type")
    private String type_;
    
    /** emulator. */
    @XmlElement(name = "emulator")
    private String emulator_;
    
    /** machines. */
    @XmlElement(name = "machine")
    private ArrayList<LibvirtConfigMachine> machines_;
    
    /** loader. */
    @XmlElement(name = "loader")
    private String loader_;
    /**
     * 
     */
    public LibvirtConfigArch() 
    {
        machines_ = new ArrayList<LibvirtConfigMachine>();
    }
    /**
     * @return the name
     */
    public String getName() 
    {
        return name_;
    }

    /**
     * @param name the name to set
     * @return this
     */
    public LibvirtConfigArch setName(String name) 
    {
        name_ = name;
        return this;
    }

    /**
     * @return the wordsize
     */
    public String getWordsize() 
    {
        return wordsize_;
    }

    /**
     * @param wordsize the wordsize to set
     * @return this
     */
    public LibvirtConfigArch setWordsize(String wordsize) 
    {
        wordsize_ = wordsize;
        return this;
    }

    /**
     * @return the domain
     */
    public String getDomain() 
    {
        return domain_;
    }

    /**
     * @param domain the domain to set
     * @return this
     */
    public LibvirtConfigArch setDomain(String domain) 
    {
        domain_ = domain;
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
    public LibvirtConfigArch setType(String type) 
    {
        type_ = type;
        return this;
    }

    /**
     * @return the emulator
     */
    public String getEmulator() 
    {
        return emulator_;
    }

    /**
     * @param emulator the emulator to set
     * @return this
     */
    public LibvirtConfigArch setEmulator(String emulator) 
    {
        emulator_ = emulator;
        return this;
    }

    /**
     * @return the machines
     */
    public ArrayList<LibvirtConfigMachine> getMachines() 
    {
        return machines_;
    }

    /**
     * @param machines the machines to set
     * @return this
     */
    public LibvirtConfigArch setMachines(ArrayList<LibvirtConfigMachine> machines) 
    {
        machines_ = machines;
        return this;
    }

    /**
     * @return the loader
     */
    public String getLoader() 
    {
        return loader_;
    }

    /**
     * @param loader the loader to set
     * @return this
     */
    public LibvirtConfigArch setLoader(String loader) 
    {
        loader_ = loader;
        return this;
    }

  
    
}
