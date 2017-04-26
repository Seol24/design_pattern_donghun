package design_pattern.singleton.after.staticmathod;

public class Main {
	private static final int THREAD_NUM =5;
	public static void main(String[] args) {
		UserTread[] user = new UserTread[THREAD_NUM];
		for (int i = 0 ; i<THREAD_NUM; i++){
			user[i] = new UserTread((i+1)+"-thread");
			user[i].start();
		}
	}
}
