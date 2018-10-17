package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import UserPackage2.Credantials;
import UserPackage2.Token;

class TestClass {
	
	private Token token;
	private Credantials credentials;

	
	@BeforeEach
	void initTest() {
		token=new Token("xpto");
		credentials=new Credantials("username","pwd");
	
	}
	
	@Test
	void testClassToken(){		
		assertNotNull(token);
		assertEquals("xpto", token.getValue());
	}
	
	@Test
	void testClassCredentials() {
		assertNotNull(credentials);
		assertEquals("username", credentials.getUsername());
		assertEquals("pwd", credentials.getPassword());	
	}
	
	@Test
	static void test() {
	}
	
	
	
}
