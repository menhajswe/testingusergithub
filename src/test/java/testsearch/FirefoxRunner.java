package testsearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxRunner {
    WebDriver driver;
    
    public WebDriver runDriver(String url) {
        driver = new FirefoxDriver();
        driver.get(url);
        return driver;
    }
}
