import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("firstname")).sendKeys("Nitin");
	driver.findElement(By.name("lastname")).sendKeys("Galande");
	 Dimension sizeofbrowser = driver.manage().window().getSize();
	 System.out.println("The size of the browser is "+sizeofbrowser);
	 driver.findElement(By.name("reg_email__")).sendKeys("noemailidplease");
	 driver.findElement(By.name("reg_passwd__")).sendKeys("sorrybro");
	 WebElement birthDayfield = driver.findElement(By.name("birthday_day"));
	 Select s = new Select(birthDayfield);
	 s.selectByValue("11");
	 Thread.sleep(1000);
	 WebElement monthfield = driver.findElement(By.id("month"));
	 Select s1 = new Select(monthfield);
	 s1.selectByIndex(4);
	 Thread.sleep(1000);
	 WebElement Dropdownyear = driver.findElement(By.id("year"));
	 Select s2 = new Select(Dropdownyear);
	 s2.selectByVisibleText("1995");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	 
	}
	


}
