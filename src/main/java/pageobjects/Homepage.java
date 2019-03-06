package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver;
	By login=By.cssSelector("div[class='global-nav-login-flydown global-login']");
	By username=By.id("username");
	By password=By.id("password");
	
	public Homepage(WebDriver driver)
	{
	this.driver=driver;
	}
	public WebElement loginn()
	{
		 return driver.findElement(login);
	}
	
	
	
	public WebElement user()
	{
		 return driver.findElement(username);
	}
	
	public WebElement keyword()
	{
		 return driver.findElement(password);
	}
}