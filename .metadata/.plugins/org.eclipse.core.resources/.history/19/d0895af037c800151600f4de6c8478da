package oop;

public abstract class AudioVisual extends Product {

	private static final int MAX_AVAILABLE_SOUND_POWER = 4000;

	private int audioOutputPower;
	private boolean isWiFiCapable;
	private boolean hasRemoteControl;
	private boolean AVCablesBundled;
	

	public AudioVisual(int audioOutputPower, boolean isWiFiCapable, boolean hasRemoteControl, boolean aVCablesBundled) {
		setAudioOutputPower(audioOutputPower);
		setWiFiCapable(isWiFiCapable);
		setHasRemoteControl(hasRemoteControl);
		setAVCablesBundled(aVCablesBundled);
	}

	public int getAudioOutputPower() {
		return audioOutputPower;
	}

	public void setAudioOutputPower(int audioOutputPower) {
		if (audioOutputPower > 0 && audioOutputPower < MAX_AVAILABLE_SOUND_POWER) {
		}
	}

	public boolean isWiFiCapable() {
		return isWiFiCapable;
	}

	public void setWiFiCapable(boolean isWiFiCapable) {
		this.isWiFiCapable = isWiFiCapable;
	}

	public boolean isHasRemoteControl() {
		return hasRemoteControl;
	}

	public void setHasRemoteControl(boolean hasRemoteControl) {
		this.hasRemoteControl = hasRemoteControl;
	}

	public boolean isAVCablesBundled() {
		return AVCablesBundled;
	}

	public void setAVCablesBundled(boolean aVCablesBundled) {
		AVCablesBundled = aVCablesBundled;
	}
}
