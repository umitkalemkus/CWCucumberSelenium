package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SelenimGridNew {





    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {



       // driver = new RemoteWebDriver(new URL("http://192.168.0.131:4444"), new ChromeOptions());
       // driver = new RemoteWebDriver(new URL("http://192.168.0.131:4444"), new FirefoxOptions());
        driver = new RemoteWebDriver(new URL("http://192.168.0.131:4444"), new InternetExplorerOptions());

        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk/");

        driver.quit();


    }
}
