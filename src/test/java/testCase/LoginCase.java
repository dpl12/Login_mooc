package testCase;

import base.BaseDriver;
import business.LoginPageBusiness;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.IOException;


/**
 * 登录慕课网自动化测试用例
 */
public class LoginCase extends CaseBase{
    public BaseDriver driver;
    public LoginPageBusiness loginPageBusiness;
    static Logger logger= Logger.getLogger(LoginCase.class);
    public LoginCase(){
        this.driver=InitDriver("firefox");
        loginPageBusiness=new LoginPageBusiness(driver);
    }
    //慕课网点击登录链接，进入登录界面
    @Test
    public void getLoginHome() throws InterruptedException {
        driver.get("https://www.imooc.com/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".redrain-closeBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("js-signin-btn")).click();
        Thread.sleep(3000);
    }
    //测试登录界面
    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLogin() throws IOException, InterruptedException {
//        logger.debug("这是一条log4j日志");
        logger.info("这是一条log4j日志");
//        logger.error("这是一条log4j error日志");
        loginPageBusiness.login("2794974296@qq.com","dpl12345");
        Thread.sleep(2000);
        driver.stop();
    }
}
