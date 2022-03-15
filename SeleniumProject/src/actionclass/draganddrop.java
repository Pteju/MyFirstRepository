package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/droppable");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		Actions driver=new Actions(obj);
		WebElement source=obj.findElement(By.id("draggable"));
		WebElement target=obj.findElement(By.id("droppable"));
		driver.dragAndDrop(source, target).perform();
		obj.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		//WebDriverWait wait=new WebDriverWait(obj,Duration.ofSeconds(6));
		//wait.until(ExpectedConditions.elementToBeClickable(element));

	}

}
