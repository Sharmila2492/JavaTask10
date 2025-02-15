package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.className("hasDatepicker")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='22']"));
		ele.click();
		String txt = ele.getText();
		System.out.println("Selected Date is: " + txt);
		driver.quit();
	}
	/*
	 * Output: Selected Date is: 22
	 */

}
