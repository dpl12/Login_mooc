package business;

import base.BaseDriver;
import handle.LoginPageHandle;

import java.io.IOException;

/**
 * 功能：登录的业务层，将多个元素操作组合起来，实现一个业务功能
 */
public class LoginPageBusiness {
    public LoginPageHandle handle;
    public LoginPageBusiness(BaseDriver driver){
        handle=new LoginPageHandle(driver);
    }
    public void login(String username,String password) throws IOException {
        //判断是否是登录界面
        if (handle.assertLoginPage()){
            //实现业务
            handle.sendKeyUser(username);
            handle.sendKeyPassword(password);
            handle.clickAutoSignin();
            handle.clickLoginButton();
        }else {
            System.out.println("页面不存在，请检查网络！");
        }
    }
}
