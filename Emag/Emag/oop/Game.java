package oop;

public class Game extends Multimedia {
	
	private static final int MAX_NUMBER_OF_DISKS = 10;
	private String gameGenre;
	private int numberOfDiscs;
	private String platform;
	
	

	public Game(String brand, String manufacturer, String model, double price, int quantity, boolean over18,
			String gameGenre, int numberOfDiscs, String platform) {
		super(brand, manufacturer, model, price, quantity, over18);
		this.setGameGenre(gameGenre);
		this.setNumberOfDiscs(numberOfDiscs);
		this.setPlatform(platform);
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
		super.showInfo();
		System.out.println("Game genre:" + this.getGameGenre() + ", number of disc included:" + this.getNumberOfDiscs() + ", Game platform:" + this.getPlatform());
	}
	
}
