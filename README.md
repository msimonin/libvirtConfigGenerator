LibvirtConfigGenerator
======================

Marshalling and unmarshalling library of libvirt template.

## Examples

### Build a template from scratch

#### Code

    LibvirtConfigDomain config = new LibvirtConfigDomain();
    config.setType("kvm");
          .setName("debian1");
        
    config.getOs()
      .setType("hvm")
      .setTypeArch("x86_64")
      .setTypeMachine("pc-0.12")
      .setBootDev("hd");
            
    config.getFeatures()
      .enableAcpi()
      .enableApic();
        
    LibvirtConfigDisk disk = new LibvirtConfigDisk();
    disk.setDriverName("qemu")
      .setDriverType("qcow2")
      .setSourceFile("/home/test.img")
      .setTargetBus("virtio")
      .setTargetDev("vda");
    config.addDisk(disk);
        
    LibvirtConfigInterface interf = new LibvirtConfigInterface();
    interf.setType("bridge")
      .setMacAddress("52:54:00:83:25:2b")
      .setSourceBridge("virbr0");
    config.addInterface(interf);
        
    LibvirtConfigSerialConsole serial = new LibvirtConfigSerialConsole();
    serial.setType("pty")
      .setTargetPort("0");
    config.addSerial(serial);
        
    LibvirtConfigSerialConsole console = new LibvirtConfigSerialConsole();
    console.setType("pty")
      .setTargetPort("0")
      .setTargetType("serial");
    config.addConsole(console);
       
    // marshalling    
    jaxbContext = JAXBContext.newInstance(LibvirtConfigDomain.class);
    jaxbMarshaller = jaxbContext.createMarshaller();
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    
    jaxbMarshaller.marshal(config, System.out);

#### Result

    <?xml version="1.0" encoding="UTF-8"?>
    <domain type="kvm">
       <name>debian1</name>
       <memory>131072</memory>
       <vcpus>1</vcpus>
       <os>
          <boot dev="hd"/>
          <type arch="x86_64" machine="pc-0.12">hvm</type>
       </os>
       <features>
          <acpi></acpi>
          <apic></apic>
       </features>
       <devices>
          <emulator>/usr/bin/kvm</emulator>
          <disk device="disk" type="file">
             <driver name="qemu" type="qcow2"/>
             <source file="/home/test.img"/>
             <target bus="virtio" dev="vda"/>
          </disk>
          <interface type="bridge">
             <mac address="52:54:00:83:25:2b"/>
             <source bridge="virbr0"/>
          </interface>
          <serial type="pty">
             <target port="0"/>
          </serial>
          <serial type="pty">
             <target type="serial" port="0"/>
          </serial>
       </devices>
    </domain>
    
### Parse existing templates

For example, we get the capabilities of libvirt in a file:

    $) virsh capabilities > /tmp/cap.xml
    
#### Code
  
    jaxbContext = JAXBContext.newInstance(LibvirtConfigCapabilities.class);
    jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    LibvirtConfigCapabilities cap = (LibvirtConfigCapabilities) jaxbUnmarshaller.unmarshal(new File("/tmp/cap.xml"));
  
  
  
