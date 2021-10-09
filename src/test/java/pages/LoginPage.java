package pages;

import utils.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
     WebDriver driver;

	public LoginPage(WebDriver driver) {
		
	PageFactory.initElements(driver,this);
	}	
		
		@FindBy(id="txtusername")
		private WebElement username;
		
		
		@FindBy(id="pass")
		private WebElement Password;
		
		@FindBy(name="submit")
		private WebElement login;

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return Password;
		}

		public WebElement getLogin() {
			return login;
		}
			
	
			
	
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

