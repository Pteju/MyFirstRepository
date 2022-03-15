package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/select-menu");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement dropdown=obj.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select driver=new Select(dropdown);
		//driver.selectByIndex(3);
		//driver.selectByVisibleText("Black");
		driver.selectByValue("red");//only when value attribute is given
		
		//get option
		List<WebElement> options=driver.getOptions();
		Iterator<WebElement> test=options.iterator();
		while(test.hasNext()) {
			System.out.println(test.next().getText());
		}
		//System.out.println(driver.getFirstSelectedOption().getText());
		if(driver.getFirstSelectedOption().getText().equalsIgnoreCase("red"))
		System.out.println("pass");
		else
			System.out.println("fail");

	}

}
