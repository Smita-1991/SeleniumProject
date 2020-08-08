import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlemultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowEntry=AddSession&hl=en&flowName=GlifWebSignIn");
		String keyString = Keys.CONTROL+Keys.SHIFT.toString()+Keys.ENTER.toString();
		driver.findElement(By.xpath("//div[@class='PrDSKc']/a")).sendKeys(keyString);
		System.out.println("Before switching \n"+driver.getTitle());
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		String parent=iterator.next();
		String child=iterator.next();
		driver.switchTo().window(child);
		
		System.out.println("After switching \n"+driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println("After switching back to parent \n"+driver.getTitle());
	}

}
