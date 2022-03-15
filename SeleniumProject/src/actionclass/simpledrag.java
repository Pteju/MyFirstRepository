package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class simpledrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/dragabble");
		//obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		Actions driver=new Actions(obj);
		WebElement source=obj.findElement(By.id("dragBox"));
	    //driver.moveToElement(source).build().perform();
		//int x=source.getLocation().getX();
		//int y=source.getLocation().getY();
		driver.moveToElement(source).dragAndDropBy(source, 500, -300).build().perform();

	}

}
