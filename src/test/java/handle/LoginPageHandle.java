package handle;

import base.BaseDriver;
import page.LoginPage;

import java.io.IOException;

/**
 * 登录页面的操作类，用于输入内容、点击事件等
 */
public class LoginPageHandle {
    public BaseDriver driver;
    public LoginPage loginPage;
    public LoginPageHandle(BaseDriver driver){
        this.driver=driver;
        loginPage=new LoginPage(driver);
    }
    //输入用户名
    public void sendKeyUser(String username) throws IOException {
        loginPage.sendKeys(loginPage.getUserElement(),username);
    }
    //输入密码
    public void sendKeyPassword(String password) throws IOException {
        loginPage.sendKeys(loginPage.getPasswordElement(),password);
    }
    //登录的点击事件
    public void clickLoginButton() throws IOException {
        loginPage.click(loginPage.getLoginButtonElement());
    }
    //选中自动登录
    public void clickAutoSignin() throws IOException {
        loginPage.click(loginPage.getAutoSigninElement());
    }
    //判断是否是登录界面
    public boolean assertLoginPage() throws IOException {
        return loginPage.assertElement(loginPage.getUserElement());
    }
}
