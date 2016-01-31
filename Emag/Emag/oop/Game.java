package oop;

public class Game extends Multimedia {
	private static final int MAX_NUMBER_OF_DISKS = 10;
	private String gameGenre;
	private int numberOfDiscs;
	private String platform;
	
	public Game(String gameGenre, int numberOfDiscs, String platform) {
		setGameGenre(gameGenre);
		setNumberOfDiscs(numberOfDiscs);
		setPlatform(platform);
	}

	public String getGameGenre() {
		return gameGenre;
	}

	public void setGameGenre(String gameGenre) {
		if(gameGenre != null && !gameGenre.equals("")){
		this.gameGenre = gameGenre;
		}
	}

	public int getNumberOfDiscs() {
		return numberOfDiscs;
	}

	public void setNumberOfDiscs(int numberOfDiscs) {
		if(numberOfDiscs > 0 && numberOfDiscs < MAX_NUMBER_OF_DISKS){
		this.numberOfDiscs = numberOfDiscs;
		}
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		if(platform != null && platform.equals("")){
		this.platform = platform;
		}
	}

	public void showInfo() {
		System.out.println(this.getBrand() + " " + this.getManufaturer() + " " + this.getPrice());
		System.out.println(this.getGameGenre() + " " + this.getNumberOfDiscs() + " " + this.getPlatform());
	}
	
}
