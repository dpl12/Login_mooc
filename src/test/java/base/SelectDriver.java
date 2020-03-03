package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 功能：浏览器的选择
 */
public class SelectDriver {
    public WebDriver driverName(String browser){
        if (browser.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else {
            return new ChromeDriver();
        }
    }
}
