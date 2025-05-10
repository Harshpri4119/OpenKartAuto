import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By userName = By.xpath("//input[@id='user-name']");
    private By passWord = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//input[@id='login-button']");
    private By errorMessage = By.xpath("//h3[@data-test='error']");

    public void setUserName(String textName) {
        setText(userName, textName);
    }

    public void setPassWord(String textPassWord){
        setText(passWord, textPassWord);
    }

    public void clickLoginButton(){
        clickButton(loginButton);
    }

    public String getErrorMessage(){
       return findElement(errorMessage).getText();
    }

    public HomePage LoginSuccessHomePageCheck(String userName, String passWord){
        setUserName(userName);
        setPassWord(passWord);
        clickButton(loginButton);
        return new HomePage();
    }

}
