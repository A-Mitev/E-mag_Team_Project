package oop;

public class SoundSystem extends AudioVisual {
	
	private boolean radio;
	private boolean mp3Capable;
	private boolean tapeDeck;
	
	public SoundSystem(String brand, String manufacturer, String model, double price, int quantity,
			int audioOutputPower, boolean wifiCapable, boolean remoteControl, boolean aVCablesBundled, boolean radio,
			boolean mp3Capable, boolean tapeDeck) {
		super(brand, manufacturer, model, price, quantity, audioOutputPower, wifiCapable, remoteControl,
				aVCablesBundled);
		this.radio = radio;
		this.mp3Capable = mp3Capable;
		this.tapeDeck = tapeDeck;
	}

	public boolean isRadio() {
		return radio;
	}

	public boolean isMP3Capable() {
		return mp3Capable;
	}

	public boolean isTapeDeck() {
		return tapeDeck;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("has radio option:" + this.isRadio() + ", is MP3 capable:" + this.isMP3Capable() + ", has tapedeck:" + this.isTapeDeck());
	}
	
}
