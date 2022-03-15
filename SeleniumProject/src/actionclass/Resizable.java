package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/resizable");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		Actions driver=new Actions(obj);
		WebElement source=obj.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
		driver.clickAndHold(source).moveByOffset(50,50).release().build().perform();
	}

}
