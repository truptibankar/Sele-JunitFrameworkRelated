package core.WebDriverFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	private static WebDriver driver = null;
    public static WebDriver getWebDriverForBrowser(String browser){
    	switch(browser.toLowerCase()){
        case "chrome":
            driver = new ChromeDriver();
            break;
        case "firefox":
            driver = new FirefoxDriver();
            break;
        default:
        	System.out.println("No such Browser");
    }
    	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return null;
	

	//public static WebDriver getWebDriverForBrowser(String browser) {
		// TODO Auto-generated method stub
		//return null;
	}
	
}

