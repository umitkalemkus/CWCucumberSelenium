package runner;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.WIN11);
        cap.setBrowserName("firefox");

        driver = new RemoteWebDriver(new URL("http://192.168.0.161:4444"),cap);

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.quit();




    }

}
