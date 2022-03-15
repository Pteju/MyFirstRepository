package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class doubleclickexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/buttons");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		Actions driver=new Actions(obj);
		driver.doubleClick(obj.findElement(By.xpath("//button[@id='doubleClickBtn']")));
		driver.perform();
		WebElement result=obj.findElement(By.xpath("//p[@id='doubleClickMessage']"));
		System.out.println(result.getText());
		
		
		
		driver.contextClick(obj.findElement(By.xpath("//button[@id='rightClickBtn']")));
		driver.perform();
		WebElement result1=obj.findElement(By.xpath("//p[@id='rightClickMessage']"));
		System.out.println(result1.getText());
		
		driver.click(obj.findElement(By.xpath("//button[text( )='Click Me']")));
		driver.perform();
		
		
		
		
		


	}

}
