package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.londonfreelance.org/courses/frames/index.html");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		//switch to by name
		obj.switchTo().frame("content");
		WebElement header=obj.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		obj.switchTo().defaultContent();
		//switch to canbe done by locator
		WebElement frame=obj.findElement(By.xpath("//frame[@name='navbar']"));
		obj.switchTo().frame(frame);
		WebElement Noframe=obj.findElement(By.xpath("//a[text( )='No frames']"));
		System.out.println(Noframe.getText());

	}

}
