package webelementexample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementoperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/text-box");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement Fullname=obj.findElement(By.xpath("//input[@placeholder='Full Name']"));
		Fullname.sendKeys("tejaswini");
		WebElement Email = obj.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		Email.sendKeys("teju@gmail.com");
		WebElement Adress = obj.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		Adress.sendKeys("Maharashtra");
		System.out.println(Adress.getTagName());
		WebElement Submit=obj.findElement(By.xpath("//button[@class='btn btn-primary']"));
		//Submit.click();
		System.out.println(Submit.getSize());
		System.out.println(Submit.getText());
		
		//For check box
		obj.get("https://demoqa.com/checkbox");
		WebElement Checkbox=obj.findElement(By.xpath("//label[@for='tree-node-home']"));
		if(!Checkbox.isSelected())
		Checkbox.click();
		WebElement Result=obj.findElement(By.xpath("//div[@id='result']"));
		if(Result.isDisplayed())
		System.out.println(Result.getText());
		
		//for radio button
		obj.get("https://demoqa.com/radio-button");
		WebElement Radio=obj.findElement(By.xpath("//label[@for='yesRadio']"));
		Radio.click();
		WebElement Noradio=obj.findElement(By.xpath("//label[@for='noRadio']"));
		if(Noradio.isEnabled()) {
		System.out.println("test case is pass");
		}else {System.out.println("test case fail");}
		
		
		//Webtables
		obj.get("https://demoqa.com/webtables");
		List<WebElement> Columnname=obj.findElements(By.xpath("//div[@role='columnheader']"));
		System.out.println(Columnname.size());
		Iterator<WebElement> itr=Columnname.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next().getText());
		}
		List<WebElement> Rowname=obj.findElements(By.xpath("//div[@class='rt-tbody']"));
		System.out.println(Rowname.size());
		Iterator<WebElement> Rowitr=Rowname.iterator();
		while(Rowitr.hasNext()) {
			System.out.println(Rowitr.next().getText());
		}
		
		}
		
		}
		
		

	


