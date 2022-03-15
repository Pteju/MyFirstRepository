package seleniumcode;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Testjava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.myntra.com/");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		obj.close();
		
		
		

	}

}
