package stepDef;



import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utils.Base;


public class Login extends Base {

	WebDriver driver;

	@Given("launch the browser")
	public void launch_the_browser() {
		// WebDriverManager.chromedriver().setup();
		//   driver= new ChromeDriver();

	driver=	launchBrowser();




	}


	@Given("open the orange hrm Application")
	public void open_the_orange_hrm_Application() {
		url("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String user, String pass) {
		//WebElement username=driver.findElement(By.id("txtusername"));
		//username.sendKeys(user);
		// WebElement password=driver.findElement(By.id("txtpassword"));
		// password.sendKeys(pass);
		LoginPage lp =new LoginPage(driver);
		send(lp.getUsername(),user);
		send(lp.getPassword(),pass);

	}

	@When("click the login button")
	public void click_the_login_button() {
		//WebElement login=driver.findElement(By.name("submit"));
		LoginPage lp =new LoginPage(driver);
		tap(lp.getLogin());
	}

	@Then("validate the login message")
	public void validate_the_login_message() {
		System.out.println("validate the message");


	}

	@Then("close the browser")
	public void close_the_browser() {
		closeBrowser();
		//driver.quit();
	}



}