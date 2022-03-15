package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/select-menu");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		//WebElement multiselect=obj.findElement(By.xpath("//select[@multiple name='cars']"));
		//Select driver=new Select(multiselect);
		//we can reduce code by writing like below
		Select driver=new Select(obj.findElement(By.xpath("//select[@name='cars']")));
		driver.selectByIndex(2);
		driver.selectByIndex(3);
		driver.selectByValue("saab");
		driver.selectByVisibleText("Volvo");
		System.out.println(driver.isMultiple());
		System.out.println((driver.getFirstSelectedOption().getText()));
		
		List<WebElement> options=driver.getAllSelectedOptions();
		Iterator<WebElement> test=options.iterator();
		while(test.hasNext()) {
			System.out.println(test.next().getText());
			}
		driver.deselectByIndex(2);

}
}
