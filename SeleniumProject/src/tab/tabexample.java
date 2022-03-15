package tab;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/tabs");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		obj.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
		System.out.println(obj.findElement(By.xpath("//div[@class='tab-content']")).getText());
		
	}
}