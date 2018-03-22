public class TV {
	int kanal = 1; // kanal default 1
	int levelVolume = 1; // level volume default 1
	boolean hidup = false;  // TV secara default mati
	
    public TV() {
	}
	
	public void hidupKan() {
		hidup = true;
	}
	
	public void matiKan() {
		hidup = false;
	}
	
	public void setKanal(int kanalBaru) {
		if (hidup && kanalBaru >= 1 && kanalBaru <= 120)
          kanal = kanalBaru;
    }
    
	public void setVolume(int levelVolumeBaru) {
		if (hidup && levelVolumeBaru >= 1 && levelVolumeBaru <= 7)
        levelVolume = levelVolumeBaru;
    }
    
    public void kanalNaik() {
    	if (hidup && kanal < 120)
          kanal++;
    }
    
    public void kanalTurun() {
    	if (hidup && kanal > 1)
          kanal--;
    }
    
    public void volumeNaik() {
    	if (hidup && levelVolume < 7)
          levelVolume++;
    }
    
    public void volumeTurun() {
    	if (hidup && levelVolume > 1)
          levelVolume--;
    }
}