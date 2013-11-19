package org.inria.myriads.libvirt.domain;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * 
 * LibvirtConfigDevice.
 * 
 * @author msimonin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "devices")
public class LibvirtConfigDevices
{
    /** emulator.*/
    @XmlElement(name = "emulator")
    private String emulator_;
    
    /** disk.*/
    @XmlElement(name = "disk")
    private ArrayList<LibvirtConfigDisk> disks_;
    
    /** interfaces.*/
    @XmlElement(name = "interface")
    private ArrayList<LibvirtConfigInterface> interfaces_;
    
    /** serials.*/
    @XmlElement(name = "serial")
    private ArrayList<LibvirtConfigSerialConsole> serials_;
    
    /** consoles.*/
    @XmlElement(name = "console")
    private ArrayList<LibvirtConfigSerialConsole> consoles_;
    
    /** graphics.*/
    @XmlElement(name = "graphics")
    private ArrayList<LibvirtConfigGraphics> graphics_;
    
    /**
     * Constructor. 
     */
    public LibvirtConfigDevices()
    {
        disks_ = new ArrayList<LibvirtConfigDisk>();
        interfaces_ = new ArrayList<LibvirtConfigInterface>();
        serials_ = new ArrayList<LibvirtConfigSerialConsole>();
        consoles_ = new ArrayList<LibvirtConfigSerialConsole>();
        graphics_ = new ArrayList<LibvirtConfigGraphics>();
    }

    /**
     * @return the disks
     */
    public ArrayList<LibvirtConfigDisk> getDisks()
    {
        return disks_;
    }

    /**
     * @param disks the disks to set
     * @return this
     */
    public LibvirtConfigDevices setDisks(ArrayList<LibvirtConfigDisk> disks)
    {
        disks_ = disks;
        return this;
    }

    /**
     * @return the interfaces
     */
    public ArrayList<LibvirtConfigInterface> getInterfaces()
    {
        return interfaces_;
    }

    /**
     * @param interfaces the interfaces to set
     * @return this
     */
    public LibvirtConfigDevices setInterfaces(ArrayList<LibvirtConfigInterface> interfaces)
    {
        interfaces_ = interfaces;
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
    public LibvirtConfigDevices setEmulator(String emulator)
    {
        emulator_ = emulator;
        return this;
    }

    /**
     * @return the serials
     */
    public ArrayList<LibvirtConfigSerialConsole> getSerials()
    {
        return serials_;
    }

    /**
     * @param serials the serials to set
     * @return this
     */
    public LibvirtConfigDevices setSerials(ArrayList<LibvirtConfigSerialConsole> serials)
    {
        serials_ = serials;
        return this;
    }

    /**
     * @return the consoles
     */
    public ArrayList<LibvirtConfigSerialConsole> getConsoles()
    {
        return consoles_;
    }

    /**
     * @param consoles the consoles to set
     * @return this
     */
    public LibvirtConfigDevices setConsoles(ArrayList<LibvirtConfigSerialConsole> consoles)
    {
        consoles_ = consoles;
        return this;
    }

    /**
     * 
     * Add a disk.
     * 
     * @param disk  the disk to add.
     * @return this
     */
    public LibvirtConfigDevices addDisk(LibvirtConfigDisk disk) 
    {
        getDisks().add(disk);
        return this;
    }

    /**
     * 
     * Add an interface.
     *  
     * @param interf    the interface to add.
     * @return this
     */
    public LibvirtConfigDevices addInterface(LibvirtConfigInterface interf) 
    {
        getInterfaces().add(interf);
        return this;
    }

    /**
     * 
     * Add a serial.
     * 
     * @param serial    the serial to add.
     * @return this
     */
    public LibvirtConfigDevices addSerial(LibvirtConfigSerialConsole serial) 
    {
        getSerials().add(serial);
        return this;
    }
    
    /**
     * 
     * Add a console.
     * 
     * @param console    the console to add.
     * @return this
     */
    public LibvirtConfigDevices addConsole(LibvirtConfigSerialConsole console) 
    {
        getSerials().add(console);
        return this;
    }

    /**
     * 
     * Add a graphics section.
     * 
     * @param graphics  the graphics to add.
     * @return  this.
     */
    public LibvirtConfigDevices addGraphics(LibvirtConfigGraphics graphics)
    {
        getGraphics().add(graphics);
        return this;
    }

    /**
     * @return the graphics
     */
    public ArrayList<LibvirtConfigGraphics> getGraphics() 
    {
        return graphics_;
    }

   
    /**
     * @param graphics  The graphics to set.
     * @return  this.
     */
    public LibvirtConfigDevices setGraphics(ArrayList<LibvirtConfigGraphics> graphics) 
    {
        graphics_ = graphics;
        return this;
    }
}
