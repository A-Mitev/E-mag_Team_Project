package oop;

public class AirConditioner extends HomeTech {
	private static final int MAX_DBS_VALUE = 200;
	private static final int MAX_BTU_VALUE = 99999;
	private int bTUs;
	private int dbs;
	private boolean split;

	public AirConditioner(int bTUs, int dbs, boolean split) {
		setbTUs(bTUs);
		setDbs(dbs);
		this.split = split;
	}

	public int getbTUs() {
		return bTUs;
	}

	public void setbTUs(int bTUs) {
		if (bTUs > 0 && bTUs < MAX_BTU_VALUE) {
			this.bTUs = bTUs;
		}
	}

	public int getDbs() {
		return dbs;
	}

	public void setDbs(int dbs) {
		if (dbs > 0 && dbs < MAX_DBS_VALUE) {
			this.dbs = dbs;
		}
	}

	public boolean isSplit() {
		return split;
	}

	@Override
	public void showInfo() {
		System.out.println(this.getBrand() + " " + this.getManufaturer() + " " + this.getPrice());
		System.out.println(this.getbTUs() + " " + this.getDbs() + " " + this.isSplit());
	}

}
