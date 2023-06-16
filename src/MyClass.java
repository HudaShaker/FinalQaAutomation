import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("http://127.0.0.1:5500/index.html");

 
	driver.findElement(By.xpath("/html/body/form/center/input[1]")).sendKeys("khhuda004@gmail.com");
	
	driver.findElement(By.xpath("/html/body/form/center/input[2]")).sendKeys("12345");
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/form/center/button[2]")).click();
	
	
	
	
	}

}
