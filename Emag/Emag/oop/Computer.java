package oop;

public abstract class Computer extends Product{
	private static final int MAX_HDD_CAPACITY = 2000;
	private static final int MIN_HDD_CAPACITY = 64;
	private static final int MAX_AVAILABLE_RAM_MEMORY = 32000;
	private String operatingSystem;
	private String processor;
	private String graphics;
	private int ramMBs;
	private int hddCapacityGBs;
	private String usbType;
	
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		if(operatingSystem != null && !operatingSystem.equals("")){
		this.operatingSystem = operatingSystem;
		}
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		if(processor != null && !processor.equals("")){
		this.processor = processor;
		}
	}
	public String getGraphics() {
		return graphics;
	}
	public void setGraphics(String graphics) {
		if(graphics != null && graphics.equals("")){
		this.graphics = graphics;
		}
	}
	public int getRamMBs() {
		return ramMBs;
	}
	public void setRamMBs(int ramMBs) {
		if(ramMBs > 0 && ramMBs < MAX_AVAILABLE_RAM_MEMORY )
		this.ramMBs = ramMBs;
	}
	public int getHddCapacityGBs() {
		return hddCapacityGBs;
	}
	public void setHddCapacityGBs(int hddCapacityGBs) {
		if(hddCapacityGBs > MIN_HDD_CAPACITY && hddCapacityGBs < MAX_HDD_CAPACITY){
		this.hddCapacityGBs = hddCapacityGBs;
		}
	}
	public String getUsbType() {
		return usbType;
	}
	public void setUsbType(String usbType) {
		if(usbType != null && !usbType.equals("")){
		this.usbType = usbType;
		}
	}
	
	
}
