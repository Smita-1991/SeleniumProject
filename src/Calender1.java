import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		departureReturnDate(driver,"5","August");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
		departureReturnDate(driver,"5","August");
		
	}
	
	
	public static void departureReturnDate(WebDriver driver, String date, String month) throws InterruptedException{
		
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']/div[2]/div[1]/div[1]")).getText().contains(month)){
		
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();	
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='DayPicker-wrapper']/div[2]/div[1]/div[3]/div/div/div"));
		System.out.println("#######"+dates.size());
		
		for(int i=0;i<dates.size();i++){
			System.out.println("*****"+dates.get(i).getText());
			if(dates.get(i).getText().contains(date)){
				dates.get(i).click();
				break;
			}
		}
	}

}
