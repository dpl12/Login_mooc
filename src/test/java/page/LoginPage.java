package page;

import base.BaseDriver;
import base.ByLocation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;

/**
 * 功能：登录的界面类，用于获取元素element
 */
public class LoginPage extends BasePage{

    public LoginPage(BaseDriver driver) {
        super(driver);
    }
    //获取用户名输入框element
    public WebElement getUserElement() throws IOException {
        return element(ByLocation.getLocator("userString"));
    }
    //获取密码输入框element
    public WebElement getPasswordElement() throws IOException {
        return element(ByLocation.getLocator("passwordString"));
    }
    //获取登录按钮element
    public WebElement getLoginButtonElement() throws IOException {
        return element(ByLocation.getLocator("loginButtonString"));
    }
    //获取自动登录element
    public WebElement getAutoSigninElement() throws IOException {
        return element(ByLocation.getLocator("autoSignin"));
    }
}
