package Stepdef;

import Utility.util;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	util Util;
	
	@Before
	public void setup() {
		Util = new util();
		Util.Edge_launch("https://www.amazon.in/");
		
	}
	
	@After
	public void tearDown() {
		Util.close();
	}
	
}
