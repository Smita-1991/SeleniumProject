import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEx1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		//globaly declaire implicite wait
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		Decliare explicite wait

		WebDriverWait webDriverWait=new WebDriverWait(driver,5);
		
		String[] neededItems = { "Cucumber", "Beetroot", "Tomato" };
		
		addToCart(driver, neededItems);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println("##########"+driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addToCart(WebDriver driver, String[] neededItems) {
		List<WebElement> vegitables = driver.findElements(By.cssSelector("h4.product-name"));
		List items = Arrays.asList(neededItems);
		int j = 0;
		for (int i = 0; i < vegitables.size(); i++) {

			String name = vegitables.get(i).getText();
			String[] formattedName = name.split("-");
			String finalName = formattedName[0].trim();

			if (items.contains(finalName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				int totalNumbItems = (items.size());
				if (j == totalNumbItems) {
					break;
				}
			}
		}
		
		
	}

}
