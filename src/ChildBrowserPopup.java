import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwindowid = driver.getWindowHandles();
		Iterator<String> it = allwindowid.iterator();
		String mainpageid = it.next();
		String childpageid = it.next();
		System.out.println("The id of allwindows are "+allwindowid);
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		WebElement emailidtextbox = driver.findElement(By.xpath("//input[@name='email']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",emailidtextbox);
		Thread.sleep(3000);
		emailidtextbox.click();
		emailidtextbox.sendKeys("Nitin");
		
		
		
		
		
		
	}

}
