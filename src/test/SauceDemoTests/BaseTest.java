package org.OrangeHRMTests;

import org.OrangeHRMPages.BasePage;
import org.OrangeHRMPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest extends BasePage {

    protected WebDriver webDriver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected String url = "url";

    @BeforeTest
    public void setUpEnv(){
        basePage = new BasePage();
        loginPage = new LoginPage();

        webDriver = new ChromeDriver();
        basePage.setDriver(webDriver);

        webDriver.manage().window().maximize();
        webDriver.get(url);

    }

    @AfterTest
    public void tearDown(){
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        webDriver.quit();
    }

}
