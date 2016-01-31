package oop;

public class AirConditioner extends HomeTech {
	private int bTUs;
	private int dbs;
	private boolean isSplit;
	
	public AirConditioner(int bTUs, int dbs, boolean isSplit) {
		setbTUs(bTUs);
		setDbs(dbs);
		this.isSplit = isSplit;
	}

	public int getbTUs() {
		return bTUs;
	}

	public void setbTUs(int bTUs) {
		if (bTUs > 0 && bTUs < 99999){
		this.bTUs = bTUs;
		}
	}

	public int getDbs() {
		return dbs;
	}

	public void setDbs(int dbs) {
		if(dbs > 0 && dbs < 200){
		this.dbs = dbs;
		}
	}

	public boolean isSplit() {
		return isSplit;
	}

	@Override
	public void showInfo() {
		System.out.println(this.getBrand() + " " + this.getManufaturer() + " " + this.getPrice());
		System.out.println(this.getbTUs() + " " + this.getDbs() + " " + this.isSplit());
	}

}
