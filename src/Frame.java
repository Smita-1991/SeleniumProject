import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
	
		//Switch to frame with the help of webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Switch to frame with the help of index
//		driver.findElements(By.tagName("iframe")).size();  // only one frame is present
//		driver.switchTo().frame(0);
	
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source,target).build().perform();
		
		driver.switchTo().defaultContent();
		
	}

}
