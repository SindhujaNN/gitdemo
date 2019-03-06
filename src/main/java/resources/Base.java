package resources;



import java.io.File;
import java.io.FileInputStream;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {

	public static WebDriver driver;
public Properties prop;
	public WebDriver initialiser() throws IOException
	{
 prop=new Properties();
FileInputStream fis=new FileInputStream("C://Users//navee//maven//src//main//java//resources//data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
if (browserName.equals("chrome"))
{
System.setProperty("webdriver.chrome.driver","C://Users//navee//selenium//chromedriver.exe");
	
	 driver=new ChromeDriver();
	 
}


return driver;
	}

public void getscreenshot(String result) throws IOException 
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	


	//FileUtils.copyFile(src,new File("C://Users//navee//test//"+result+"screenshot.png"));

	FileHandler.copy(src,new File("C://Users//navee//test//"+result+"screenshot.png"));
	

}}


