package webelementexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key_strokes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement username=obj.findElement(By.id("txtUsername"));
		WebElement password=obj.findElement(By.id("txtPassword"));
		WebElement loginbtn=obj.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		
		
		
		
	//	password.sendKeys("admin123");
		//loginbtn.sendKeys(Keys.ENTER);
		//action class have 2 method=keyup and keydown which are applicable for shift,control and alt
		Actions action = new Actions(obj);
	//	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	//action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//username.click();
		//
		
		
		
		
		
		
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//we can use sendkeys to cntl a,ctrl c,ctrlv
		String select=Keys.chord(Keys.CONTROL,"a");
		String copy=Keys.chord(Keys.CONTROL,"c");
		String paste=Keys.chord(Keys.CONTROL,"v");
		username.sendKeys(select);
		username.sendKeys(copy);
		password.click();
		password.sendKeys(paste);
		
		
		
		



	}

}
