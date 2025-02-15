package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		drive.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		WebElement iframe = drive.findElement(By.className("demo-frame"));
		drive.switchTo().frame(iframe);
		WebElement ele1 = drive.findElement(By.id("draggable"));

		WebElement ele2 = drive.findElement(By.id("droppable"));
		Actions Obj = new Actions(drive);
		Obj.dragAndDrop(ele1, ele2).build().perform();// drag element from ele1 to ele2

		String txt = ele2.getText();
		System.out.println(txt);

		if (txt.equalsIgnoreCase("Dropped!")) {
			System.out.println("Drag and Drop Succesfully");
		} else {
			System.out.println("Drag and Drop not succesfull");
		}

	}

}

/*
 * Output: Dropped! Drag and Drop Succesfully
 */