package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchPage {

    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(name = "q")
    private WebElement searchText;

    @FindBy(xpath = "//*[text()='Accept all']")
    private WebElement cerez;
    public void cerez(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cerez));
        cerez.click();
    }


    public void searchFor(String key){

        searchText.sendKeys(key+ Keys.ENTER);
    }
}
