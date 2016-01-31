package oop;

public class Games extends Multimedia {
	private String gameGenre;
	private int numberOfDiscs;
	private String platform;
	
	public String getGameGenre(){
		return gameGenre;
	}
	public int getNumberOfDiscs(){
		return numberOfDiscs;
	}
	public String getPlatform(){
		return platform;
	}
	
	public void showInfo() {
		System.out.println(this.getBrand() + " " + this.getManufaturer() + " " + this.getPrice());
		System.out.println(this.getGameGenre() + " " + this.getNumberOfDiscs() + " " + this.getPlatform());
	}
	
}
