package switchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/browser-windows");
		obj.manage().window().maximize();
		System.out.println(obj.getWindowHandle());
		WebElement tab=obj.findElement(By.xpath("//button[@id='tabButton']"));
		tab.click();
		Set<String> handles=obj.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next().toString());

	}
//2march video
	}
}


