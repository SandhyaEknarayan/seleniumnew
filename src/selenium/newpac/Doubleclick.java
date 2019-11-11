package selenium.newpac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","E:\\Sandhya_Java\\Software\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
driver.get("https://www.testandquiz.com/selenium/testing.html");
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)");

WebElement ele = driver.findElement(By.id("dblClkBtn"));
Actions ac = new Actions(driver);

ac.doubleClick(ele).build().perform();

Alert al = driver.switchTo().alert();

Thread.sleep(1000);
System.out.println("success");
System.out.println("alert appears:"+ al.getText());
	}
//sucess
}