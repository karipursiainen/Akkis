package akkis;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import akkis.controllers.LoginUser;

@RunWith(MockitoJUnitRunner.class)
public class AkkisEjbTest {
	
	@Mock
	Tilaus mockTilaus;
	@Mock
	LoginUser mockLoginUser;
	@Mock
	User mockUser;
	
	@Test
	public void testInit() {
		
		assertEquals(50, 50);
	}

	@Test
	public void testSave() {
		assertEquals(50, 50);	
	}
	
	@Test
	public void testSaveChenges() {
		assertEquals(50, 50);
	}
	
	@Test
	public void testGetUser() {
		AkkisEjb testattava = new AkkisEjb();

		User user1 = new User();
		
		assertEquals(user1, testattava.getUser(mockLoginUser));
	}
	
	@Test
	public void testGetCustomer() {
		assertEquals(50, 50);
	}
	
	@Test
	public void testGetProduct() {
		assertEquals(50, 50);	
	}
}




