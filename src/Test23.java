import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println(windowHandle);
Iterator<String> it = windowHandle.iterator();
String mainpageid = it.next();
String childPageID = it.next();

driver.switchTo().window(childPageID);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
driver.switchTo().window(mainpageid);
driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
Set<String> threewindowid = driver.getWindowHandles();

System.out.println(threewindowid);


	}

}
