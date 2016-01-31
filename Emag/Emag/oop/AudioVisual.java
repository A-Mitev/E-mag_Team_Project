package oop;

public abstract class AudioVisual extends Product {

	private static final int MAX_AVAILABLE_SOUND_POWER = 4000;
	private int audioOutputPower;
	private boolean wifiCapable;
	private boolean remoteControl;
	private boolean aVCablesBundled;
	

	public AudioVisual(String brand, String manufacturer, String model, double price, int quantity,
			int audioOutputPower, boolean wifiCapable, boolean remoteControl, boolean aVCablesBundled) {
		super(brand, manufacturer, model, price, quantity);
		setAudioOutputPower(audioOutputPower);
		this.wifiCapable = wifiCapable;
		this.remoteControl = remoteControl;
		this.aVCablesBundled = remoteControl;
	}

	public int getAudioOutputPower() {
		return audioOutputPower;
	}

	public void setAudioOutputPower(int audioOutputPower) {
		if (audioOutputPower > 0 && audioOutputPower < MAX_AVAILABLE_SOUND_POWER) {
			this.audioOutputPower = audioOutputPower;
		}
	}

	public boolean isWifiCapable() {
		return wifiCapable;
	}


	public boolean isRemoteControl() {
		return remoteControl;
	}

	public boolean isAVCablesBundled() {
		return aVCablesBundled;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.print("power output:" + this.getAudioOutputPower() + ", is wi-fi:" + this.isWifiCapable() + ", has remote control:" + this.isRemoteControl()
		+ ", has av camble complect:" + this.isAVCablesBundled() + ", ");
	}
	
}
