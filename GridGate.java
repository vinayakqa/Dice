import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;

public class GridGate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		List<WebElement> results = driver.findElements(By.className("page"));
		results.get(0).findElement(By.cssSelector("a")).click();
		driver.findElement(By.className("greenbox")).click();
		// String s=driver.findElement(By.id("main")).getText();
		// System.out.println(s);
		// int size=driver.findElements(By.tagName("answer")).size();
		// System.out.println(size);
		driver.switchTo().frame("main");
		String s = driver.findElement(By.id("answer")).getAttribute("class");
		System.out.println(s);
		boolean check = true;
		while (check) {
			driver.switchTo().frame("child");
			String s1 = driver.findElement(By.id("answer")).getAttribute("class");
			System.out.println(s1);
			if (s.equals(s1)) {
				System.out.println("matched");
			check=false;
			}
			else {
			//	driver.switchTo().frame("main");
				WebElement link = driver.findElement(By.partialLinkText("Repaint Box 2"));
				link.click();
			}

		}
	}

}
