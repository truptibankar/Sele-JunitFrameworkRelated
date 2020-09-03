package Base;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.WebDriverFactory.WebDriverFactory;
import junit.framework.Assert;

public class TestBase {
	
	protected WebDriver driver; 
    protected final static String base_url = "https://amazon.in";
    protected final static int implicit_wait_timeout_in_sec = 20;
    
    @Before
    public void set_up(){
    	try
    	{
        driver = WebDriverFactory.getWebDriverForBrowser("chrome");
    	}catch(Exception e){
          e.printStackTrace();
           Assert.fail("Incorrect Browser Sent. Check the Stack Trace");
        }

        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
    }

    @After
    public void clean_up(){
        driver.quit();
    }




}
