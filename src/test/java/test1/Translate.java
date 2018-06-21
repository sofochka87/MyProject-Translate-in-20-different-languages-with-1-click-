package test1;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Translate {

	public static void translating(List<String> languages) {
		// Set up Chrome driver path
		WebDriverManager.chromedriver().setup();
         //Invoke Selenium WebDriver
		WebDriver driver = new ChromeDriver();

		String url = "https://www.collinsdictionary.com/us/translator";
		driver.get(url);

		for (String language : languages) {

			

			String keyword = "Hello World!";
			driver.findElement(By.id("input-text")).clear();
			driver.findElement(By.id("input-text")).sendKeys(keyword);
			
			// String language = "Spanish";
			//WebElement select = driver.findElement(By.id("select-output"));
			Select dropDown = new Select(driver.findElement(By.id("select-output")));
			dropDown.selectByVisibleText(language);
			

			driver.findElement(By.className("spinner")).click();

			String answer = driver.findElement(By.id("output-text")).getText();

			System.out.println(keyword + " in " + language + " is " + answer);

		}

		driver.close();
		System.out.println();
		System.out.println("TEST COMPLITED - " + LocalDateTime.now());
	}
}

// *[@id="dict_inner"]
