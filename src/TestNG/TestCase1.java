package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 {

	
	@Test
	public void testCase1(){
		System.out.println("First Test Case");
	}
	
	@Parameters({"URL", "username"})
	@Test
	public void testCase2(String urlName, String userName){
		System.out.println("Second Test Case");
		System.out.println(urlName);
		System.out.println(userName);
	}
}
