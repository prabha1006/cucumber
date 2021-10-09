package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}
	//
	public void url(String Url) {
		driver.get(Url);
	}

	public void send(WebElement element ,String value) {
		element.sendKeys(value);
	}

	public void tap (WebElement element) {
		element.click();

	}

	public void closeBrowser() {

		driver.quit();




	}























}
