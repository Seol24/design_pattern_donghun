package design_pattern.ch03;

import org.apache.log4j.Logger;
import org.junit.Test;

import design_pattern.ch03.TimeReminder;

public class OCPTest {
	private static final Logger log = Logger.getLogger(OCPTest.class);
	
	@Test
	public void testFakeTimeProvider() {
		log.debug("testFakeTimeProvider()");
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
	}

	@Test
	public void testRealTimeProvider() {
		log.debug("testRealTimeProvider()");
		TimeProvider tProvSub = new RealTimeProvider();
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
	}
}
