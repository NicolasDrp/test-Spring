package co.simplon.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import co.simplon.test.service.BusinessService;

@SpringBootTest
class TestApplicationTests {
	
	@Autowired
	private BusinessService bs;

	@Test
	void testGetTest() {
String expected = "petit test";
		
		String result = bs.getTest().getValue();
		
		assertEquals(expected, result);
	}
}