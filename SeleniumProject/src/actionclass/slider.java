package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/slider");
		//obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		Actions driver=new Actions(obj);
		WebElement source=obj.findElement(By.xpath("//div[@class='range-slider__tooltip range-slider__tooltip--auto range-slider__tooltip--bottom']"));
		driver.moveByOffset(40, 0).build().perform();

	}

}
