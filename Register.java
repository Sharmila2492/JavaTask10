package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.guvi.in/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("name")).sendKeys("Sharmila");
		driver.findElement(By.id("email")).sendKeys("sharmi.43anna@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sharmila@92");
		driver.findElement(By.id("mobileNumber")).sendKeys("9555654554");
		driver.findElement(By.id("signup-btn")).click();

		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("sharmi.43anna@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sharmila@92");
		driver.findElement(By.id("login-btn")).click();
		driver.close();

	}

}
