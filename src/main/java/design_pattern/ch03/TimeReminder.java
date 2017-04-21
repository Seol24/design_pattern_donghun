package design_pattern.ch03;

public class TimeReminder {
	private MP3 m;
	private TimeProvider tProv;
	
	public void settProv(TimeProvider tProv) {
		this.tProv = tProv;
	}

	public void reminder(){
//		Calendar cal = Calendar.getInstance();
		m = new MP3();
//		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int hour = tProv.getTime();
		
		if (hour >= 22){
			m.playSong();
		}
	}
}
