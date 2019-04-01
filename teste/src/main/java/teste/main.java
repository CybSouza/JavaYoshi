package teste;

import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class main {

    public static void main(String[] args) {
    	//jdbc java banco - tutorial
    	//usar tread.sleep como timer 
    	//xampp - mysql
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        
        OperatingSystem os = si.getOperatingSystem();
        ComputerSystem computerSystem = hal.getComputerSystem();
        CentralProcessor centralProcessor = hal.getProcessor();
        GlobalMemory gloalMemory = hal.getMemory();
        Baseboard baseboard = computerSystem.getBaseboard();

        System.out.println("baseboard:");
        System.out.println("manufacturer:" + baseboard.getManufacturer());
        System.out.println("model:" + baseboard.getModel());
        System.out.println("version:" + baseboard.getVersion());
        System.out.println("serialnumber:" + baseboard.getSerialNumber());

        System.out.println(os);
    }
}