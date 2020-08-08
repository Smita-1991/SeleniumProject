import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exersize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/qaclickacademy.com/practice.php");
		
//		find the link count of full page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		Find the link of footer only
		WebElement footerElement=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerElement.findElements(By.tagName("a")).size());
		
		WebElement descountCoupons=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul"));
		System.out.println(descountCoupons.findElements(By.tagName("a")).size());
		
		for(int i=0;i<descountCoupons.findElements(By.tagName("a")).size();i++){
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			descountCoupons.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
		}
		
		Set<String> windoew=driver.getWindowHandles();
		Iterator<String> iterator=windoew.iterator();
		
		while(iterator.hasNext()){
			driver.switchTo().window(iterator.next());
			System.out.println("page Title is:"+ driver.getTitle());
		}
		
	}

}
