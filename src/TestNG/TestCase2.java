package TestNG;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 {

	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0]="smita";
		data[0][1]="Vinod";
		data[1][0]="Dhruv";
		data[1][1]="Kanawade";
		
		return data;
	}
	
	
	@Parameters({"URL", "username"})
	@Test
	public void getData2(String urlName, String userName){
		System.out.println("Inside getData 2");
		System.out.println(urlName);
		System.out.print(userName);
	}
	
	@Test(dataProvider="getData")
	public void data(String name, String surName){
		System.out.println(name+" "+surName);
	}
	
}
