package selenium.newpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fblogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "E:\\Sandhya_Java\\Software\\geckodriver.exe");
 
		WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 System.out.println("page opened successfully");
		 WebElement element = driver.findElement(By.name("email"));
			System.out.println(element.getSize().getWidth()); 

		 WebElement password = driver.findElement(By.name("pass"));
		 element.sendKeys("sandhya.patmashe@123");
		 password.sendKeys("pearl_baby");
		 WebElement login = driver.findElement(By.id("u_0_2"));
		 login.click();
			System.out.println(element.getSize().getWidth()); 

		 System.out.println("logged in sucessfully");
			System.out.println(element.getSize().getHeight()); 

	}//sucessful

}
