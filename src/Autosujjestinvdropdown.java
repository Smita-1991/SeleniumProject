import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosujjestinvdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BANG");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById('fromPlaceName').value;";
		String city=(String) js.executeScript(script);
		
	
		while(!city.equalsIgnoreCase("BANGALORE AIRPORT")){
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			city=(String) js.executeScript(script);
		}
	}

}
