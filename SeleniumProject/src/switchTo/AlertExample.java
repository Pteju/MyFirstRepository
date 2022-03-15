package switchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/alerts");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		WebElement button=obj.findElement(By.xpath("//button[@id='alertButton']"));
		button.click();
		Alert box =obj.switchTo().alert();
		box.dismiss();
		
		//cancel button
		WebElement button3=obj.findElement(By.xpath("//button[@id='confirmButton']"));
		button3.click();
		Alert box3 =obj.switchTo().alert();
		System.out.println(box3.getText());
		box3.dismiss();
		WebElement result=obj.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(result.getText());
		
		//prompt button
		WebElement button4=obj.findElement(By.xpath("//button[@id='promtButton']"));
		button4.click();
		Alert box4 =obj.switchTo().alert();
		box4.sendKeys("abcd");
		System.out.println(box4.getText());
		box4.accept();
		WebElement result1=obj.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(result1.getText());
		
		
		
		
		
	}

}
