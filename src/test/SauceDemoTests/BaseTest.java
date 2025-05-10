import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BasePage {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected String url = "https://www.saucedemo.com/v1/";



    @BeforeClass
    public void setUpEnv(){
        basePage = new BasePage();
        loginPage = new LoginPage();
        homePage = new HomePage();


        driver = new ChromeDriver();
        basePage.setDriver(driver);
        driver.manage().window().maximize();
        driver.get(url);


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
