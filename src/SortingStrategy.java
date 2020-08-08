import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//get list of element
//store them in one arraylist.i.e original arraylist
//add original arraylist into one more array list
// sort this arrtaylist by using collection.sort() ie sorted array list
// compare original and sorted list

public class SortingStrategy {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//tr/th[2]")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> fruits=driver.findElements(By.xpath("//tr/td[2]"));		
		
		ArrayList<String> originalList=new ArrayList<String>();

		
		for(int i=0;i<fruits.size();i++){
			originalList.add(fruits.get(i).getText());
		}
		
		
		ArrayList<String> sortedList=new ArrayList<String>();
		for(int i=0;i<originalList.size();i++){
			sortedList.add(originalList.get(i));
		}
		
		Collections.sort(sortedList);
		
		System.out.println("original List is:"+originalList);
		
		
		
		/////////////covert list in discending order
		Collections.reverse(sortedList);		
		
		System.out.println("Sorted List is:"+sortedList);
	
		Assert.assertTrue(originalList.equals(sortedList));
	}

}
