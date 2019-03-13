package Gui;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintWriter;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class serverTest {

	
	@Test
	void testuserAdd() {
		ArrayList<String> client = new ArrayList<String>();
		String message ="hello";
		String done = "";
		client.add(message);
		done=done+client.get(0);
		assertEquals(done, message);
	}

}
