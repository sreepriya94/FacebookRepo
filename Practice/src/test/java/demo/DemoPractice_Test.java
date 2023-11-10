package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPractice_Test {
	@Test
public void practiceMethod()
{
   System.out.println("done");
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	System.out.println("done");
	driver.quit();
}
}
