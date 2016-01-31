package oop;

public class Movies extends Multimedia {
	
	private static final int MIN_MOVIE_LENGTH = 60;
	private static final int MAX_MOVIE_LENGTH = 240;
	private String movieGenre;
	private int runTimeInMinutes;
	private boolean isHD;
	
	public Movies(String brand, String manufacturer, String model, double price, int quantity, boolean over18,
			String movieGenre, int runTimeInMinutes, boolean isHD) {
		super(brand, manufacturer, model, price, quantity, over18);
		this.setMovieGenre(movieGenre);
		this.setRunTimeInMinutes(runTimeInMinutes);
		this.isHD = isHD;
	}

	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		if(!movieGenre.equals(null) && !movieGenre.equals("")){
			this.movieGenre = movieGenre;
		}
	}

	public int getRunTimeInMinutes() {
		return runTimeInMinutes;
	}
	public void setRunTimeInMinutes(int runTimeInMinutes) {
		if(runTimeInMinutes > MIN_MOVIE_LENGTH && runTimeInMinutes < MAX_MOVIE_LENGTH){
			this.runTimeInMinutes = runTimeInMinutes;
		}
	}

	public boolean isHD() {
		return isHD;
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Movie genre:" + this.getMovieGenre() + ", Movie length:" + this.getRunTimeInMinutes() + ", is HD" + this.isHD);
	}
	
}
