package oop;

public class Music extends Multimedia {
	
	private static final int MIN_TRACKS = 7;
	private static final int MAX_TRACKS = 50;
	private String style;
	private int numberOfTracks;
	
	public Music(String brand, String manufacturer, String model, double price, int quantity, boolean over18,
			String style, int numberOfTracks) {
		super(brand, manufacturer, model, price, quantity, over18);
		this.setStyle(style);
		this.setNumberOfTracks(numberOfTracks);
	}

	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		if(!style.equals(null) && !style.equals("")){
			this.style = style;
		}
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	public void setNumberOfTracks(int numberOfTracks) {
		if(numberOfTracks > MIN_TRACKS && numberOfTracks < MAX_TRACKS){
			this.numberOfTracks = numberOfTracks;
		}
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("music style:" + this.getStyle() + ", number of tracks:" + this.getNumberOfTracks());
	}
	
}
