package oop;

public abstract class Computer extends Product {
	private static final int MAX_HDD_CAPACITY = 2000;
	private static final int MIN_HDD_CAPACITY = 64;
	private static final int MAX_AVAILABLE_RAM_MEMORY = 32000;
	private String operatingSystem;
	private String processor;
	private boolean videoCard;
	private int ramMBs;
	private int hddCapacityGBs;

	public Computer(String brand, String manufacturer, String model, double price, int quantity,
			String operatingSystem, String processor, boolean videoCard, int ramMBs, int hddCapacityGBs) {
		super(brand, manufacturer, model, price, quantity);
		setOperatingSystem(operatingSystem);
		setProcessor(processor);
		this.videoCard = videoCard;
		setRamMBs(ramMBs);
		setHddCapacityGBs(hddCapacityGBs);
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		if (operatingSystem != null && !operatingSystem.equals("")) {
			this.operatingSystem = operatingSystem;
		}
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		if (processor != null && !processor.equals("")) {
			this.processor = processor;
		}
	}

	public boolean hasVideoCard() {
		return videoCard;
	}

	public int getRamMBs() {
		return ramMBs;
	}

	public void setRamMBs(int ramMBs) {
		if (ramMBs > 0 && ramMBs < MAX_AVAILABLE_RAM_MEMORY)
			this.ramMBs = ramMBs;
	}

	public int getHddCapacityGBs() {
		return hddCapacityGBs;
	}

	public void setHddCapacityGBs(int hddCapacityGBs) {
		if (hddCapacityGBs > MIN_HDD_CAPACITY && hddCapacityGBs < MAX_HDD_CAPACITY) {
			this.hddCapacityGBs = hddCapacityGBs;
		}
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.print(this.getOperatingSystem() + " " + this.getProcessor() + " " + this.getHddCapacityGBs() + " " + this.getRamMBs() + " " 
				+ this.hasVideoCard() + " ");
	}
}
