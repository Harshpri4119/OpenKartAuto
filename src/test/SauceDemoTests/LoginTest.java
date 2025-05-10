import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    private String userName = "standard_user";
    private String passWord = "secret_sauce";

    private String wrongPassWord = "Hat";
    private String wrongUserName = "kal";


    @Test
    public void LoginCheckSuccess(){


        loginPage.setUserName(userName);
        loginPage.setPassWord(passWord);
        loginPage.clickLoginButton();
        System.out.println("Login Successfully");
    }

//    @Test
//    public void LoginCheckValidation(){
//        loginPage.setUserName(userName);
//        loginPage.setPassWord(wrongPassWord);
//        loginPage.clickLoginButton();
//
//        String errorMessage = loginPage.getErrorMessage();
//
//        System.out.println(errorMessage);
//
//        Assert.assertTrue(errorMessage.contains("Epic sadface"));
//    }


}
