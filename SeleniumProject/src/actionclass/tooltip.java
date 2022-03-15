package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/tool-tips");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		Actions driver=new Actions(obj);
		driver.clickAndHold(obj.findElement(By.xpath("//button[@id='toolTipButton']"))).perform();
		//Thread.sleep(1000);
		//System.out.println(obj.findElement(By.className("tooltip.inner")).getText());
	}

}
