import org.openqa.selenium.By;

public class HomePage {

    private By homePageText = By.xpath("//div[@class='product_label']");

    public String getHomePageText(){
        return findElement(homePageText).getText();
    }
}
