package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/**
 * Driver的基类
 */
public class BaseDriver {
    WebDriver driver;
    public BaseDriver(String browser){
        SelectDriver selectDriver=new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }
    /**
     * 截图功能
     */
    public void takeScreenShot() throws IOException {
        //获取的是当前的系统时间(以时间作为截图的文件名）
        long time=System.currentTimeMillis();
        String imageTime=String.valueOf(time);
        imageTime=imageTime+".png";
        //获取当前工程路径
        String currentPath=System.getProperty("user.dir");
        //截图存放路径为=工程路径+文件名
        String screenPath=currentPath+"/"+imageTime;
        //截图函数getScreenshotAs()来截取当前窗口
        File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File(screenPath));  //文件名复制到截图
    }
    //关闭driver
    public void stop(){
        System.out.println("stop driver");
        driver.close();
    }

    //封装Element的方法
    public WebElement findElement(By by){
        WebElement element=driver.findElement(by);
        return element;
    }
    //封装get，打开网址
    public void get(String url){
        driver.get(url);
    }
}
