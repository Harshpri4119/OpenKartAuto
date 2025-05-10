import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    private String userName = "standard_user";
    private String passWord = "secret_sauce";


    @Test
    public void valHomePageText(){
//       HomePage homePage = loginPage.LoginSuccessHomePageCheck(userName, passWord);
//       String homePageText = homePage.getHomePageText();
//
//        System.out.println(homePageText);
//
//        Assert.assertTrue(homePageText.contains("Products"));

        loginPage.setUserName(userName);
        loginPage.setPassWord(passWord);
        loginPage.clickLoginButton();

        String homePageText = homePage.getHomePageText();

        System.out.println(homePageText);

        Assert.assertTrue(homePageText.contains("Products"));


    }
}
