import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// To get the default position of browser
		System.out.println(driver.manage().window().getPosition());
		// To set the position of browser we need to create object of Point class
		Point p = new Point(100, 40);
		// We need to pass object of point class into the setposition method
		driver.manage().window().setPosition(p);

	}

}
