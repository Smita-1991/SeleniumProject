import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[2]")).getText().contains("April")){
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[3]")).click();
		}
		//grab the common attribute put it into list and the iterate
		List<WebElement> days=driver.findElements(By.className("day"));
		int count= driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++){
			if(days.get(i).getText().equalsIgnoreCase("23")){
			days.get(i).click();
			break;
			}
		}
		
	}

}
