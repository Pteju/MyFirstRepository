package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/select-menu");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement dynamic=obj.findElement(By.id("withOptGroup"));
		dynamic.click();
		Thread.sleep(1000);
		obj.findElement(By.id("react-select-2-option-0-0")).click();
		System.out.println(dynamic.getText());
		

	}

}
