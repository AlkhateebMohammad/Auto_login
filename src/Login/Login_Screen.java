package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Screen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String testEmail="mhmmed_mhmmed5@hotmail.com";
		String testPass="mhmmed12345";
		
		System.setProperty("webdriver.chrome.driver", "E:\\alkhateeb\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(testEmail);
		
		driver.findElement(By.id("pass")).sendKeys(testPass);
		
		driver.findElement(By.tagName("button")).click();
		

	}

}
