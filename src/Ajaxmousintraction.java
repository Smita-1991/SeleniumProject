import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajaxmousintraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement moveOn=driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"));
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Actions actions=new Actions(driver);
		//Move to specific element
		actions.moveToElement(moveOn).build().perform();
		
		//Enter Capital letter
		//actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//Select text
		actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//rignt click
		actions.moveToElement(search).contextClick().build().perform();
	}

}
