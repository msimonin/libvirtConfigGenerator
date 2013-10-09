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
@XmlRootElement(name = "volume")
@XmlAccessorType(XmlAccessType.FIELD)
public class LibvirtConfigVolume 
{
    
    /** domain uuid. */
    @XmlElement(name = "key")
    private String key_;
    
    /** domain name. */
    @XmlElement(name = "name")
    private String name_;
    
    /** allocation. */
    @XmlElement(name = "allocation")
    private long allocation_;
    
    /** allocation unit. */
    @XmlPath("allocation/@unit")
    private String allocationUnit_;
    
    /** capacity. */
    @XmlElement(name = "capacity")
    private long capacity_;
    
    /** capacity unit. */
    @XmlPath("capacity/@unit")
    private String capacityUnit_;
    
    /** backing store.*/
    @XmlElement(name = "backingStore")
    private LibvirtConfigVolumeInfo backingStore_;
    
    /** target.*/
    @XmlElement(name = "target")
    private LibvirtConfigVolumeInfo target_;
    
    /** source.*/
    @XmlElement(name = "source")
    private LibvirtConfigVolumeSource source_;
    
    /**
     * 
     */
    public LibvirtConfigVolume()
    {
       
    }

    /**
     * @return the name
     * 
     */
    public String getName() 
    {
        return name_;
    }

    /**
     * @param name the name to set
     * @return the volume.
     */
    public LibvirtConfigVolume setName(String name) 
    {
        this.name_ = name;
        return this;
    }

    /**
     * @return the key
     */
    public String getKey() 
    {
        return key_;
    }

    /**
     * @param key the key to set
     * @return this
     */
    public LibvirtConfigVolume setKey(String key) 
    {
        key_ = key;
        return this;
    }

    /**
     * @return the allocation
     */
    public long getAllocation() 
    {
        return allocation_;
    }

    /**
     * @param allocation the allocation to set
     * @return this
     */
    public LibvirtConfigVolume setAllocation(long allocation) 
    {
        allocation_ = allocation;
        return this;
    }

    /**
     * @return the allocationUnit
     */
    public String getAllocationUnit() 
    {
        return allocationUnit_;
    }

    /**
     * @param allocationUnit the allocationUnit to set
     * @return this
     */
    public LibvirtConfigVolume setAllocationUnit(String allocationUnit) 
    {
        allocationUnit_ = allocationUnit;
        return this;
    }

    /**
     * @return the capacity
     */
    public long getCapacity() 
    {
        return capacity_;
    }

    /**
     * @param capacity the capacity to set
     * @return this
     */
    public LibvirtConfigVolume setCapacity(long capacity) 
    {
        capacity_ = capacity;
        return this;
    }

    /**
     * @return the capacityUnit
     */
    public String getCapacityUnit() 
    {
        return capacityUnit_;
    }

    /**
     * @param capacityUnit the capacityUnit to set
     * @return this
     */
    public LibvirtConfigVolume setCapacityUnit(String capacityUnit) 
    {
        capacityUnit_ = capacityUnit;
        return this;
    }

    /**
     * @return the backingStore
     */
    public LibvirtConfigVolumeInfo getBackingStore() 
    {
        return backingStore_;
    }

    /**
     * @param backingStore the backingStore to set
     * @return this
     */
    public LibvirtConfigVolume setBackingStore(LibvirtConfigVolumeInfo backingStore) 
    {
        backingStore_ = backingStore;
        return this;
    }

    /**
     * @return the target
     */
    public LibvirtConfigVolumeInfo getTarget() 
    {
        return target_;
    }

    /**
     * @param target the target to set
     * @return this
     */
    public LibvirtConfigVolume setTarget(LibvirtConfigVolumeInfo target) 
    {
        target_ = target;
        return this;
    }

    /**
     * @return the source
     */
    public LibvirtConfigVolumeSource getSource() 
    {
        return source_;
    }

    /**
     * @param source the source to set
     * @return this
     */
    public LibvirtConfigVolume setSource(LibvirtConfigVolumeSource source) 
    {
        source_ = source;
        return this;
    }

  
    
}
