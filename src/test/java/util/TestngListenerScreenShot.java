package util;

import base.BaseDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.IOException;

/**
 *功能：通过监听事件实现失败后自动截图
 * ITestResult:是TestNG提供的一个接口,结合@AfterMethod使用类似监听器,可以监听@Test方法的执行状态等信息
 */
public class TestngListenerScreenShot extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult var1) {
        super.onTestSuccess(var1);
    }
    @Override
    public void onTestFailure(ITestResult var1) {
        super.onTestFailure(var1);
        try {
            takeScreenShot(var1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void takeScreenShot(ITestResult varl) throws IOException {
        //使用此类的getInstance()函数，即可得到系统当前已经实例化的该类对象，
        //若当前系统还没有实例化过这个类的对象，则调用此类的构造函数
        BaseDriver baseDriver= (BaseDriver) varl.getInstance();
        baseDriver.takeScreenShot();
    }
    @Override
    public void onTestSkipped(ITestResult var1) {
        super.onTestSkipped(var1);
    }
    @Override
    public void onStart(ITestContext var1) {
        super.onStart(var1);
    }
    @Override
    public void onTestStart(ITestResult iTestResult) {
        super.onTestStart(iTestResult);
    }
    @Override
    public void onFinish(ITestContext var1) {
        super.onFinish(var1);
    }

}
