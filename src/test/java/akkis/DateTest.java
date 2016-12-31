package akkis;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import akkis.types.Status;

@RunWith(MockitoJUnitRunner.class)
public class DateTest {
	
//	@Mock
//	Status[] mockStatus;

	@Test
	public void testGetStatuses() {
		
		Data testattava = new Data();
		
		assertEquals("", testattava.getStatuses());
	}

}
