import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    public WebElement findElement(By locater){
        return driver.findElement(locater);
    }

    public void setText(By element,String text){
        findElement(element).clear();
        findElement(element).sendKeys(text);
    }

    public void clickButton(By element){
        findElement(element).click();
    }
}
