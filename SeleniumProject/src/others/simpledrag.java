package others;

import org.openqa.selenium.chrome.ChromeDriver;

public class simpledrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demoqa.com/select-menu");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());

	}

}
