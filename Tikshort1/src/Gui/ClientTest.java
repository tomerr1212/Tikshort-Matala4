package Gui;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ClientTest {

	
	@Test
	void testUserAdd() {
		String ans=""; 
		ArrayList<String> users = new ArrayList<String>();
		users.add("a");
		ans=ans+users.get(0);
		assertEquals("a", ans);
				 
	}

	
}
