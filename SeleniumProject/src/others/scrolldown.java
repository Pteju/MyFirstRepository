package others;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/text-box/");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		JavascriptExecutor javascript=(JavascriptExecutor) obj;
	//	javascript.executeScript("window.scrollBy(0,100)");
		WebElement Submit=obj.findElement(By.xpath("//button[@class='btn btn-primary']"));
		javascript.executeScript("arguments[0].scrollIntoView();", Submit);

	}

}
