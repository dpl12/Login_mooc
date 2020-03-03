package page;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * page层：页面元素的基类，对元素的定位、点击、输入、是否显示的功能进行封装
 */
public class BasePage {
    public BaseDriver baseDriver;
    public BasePage(BaseDriver driver){
        this.baseDriver=driver;
    }

    /**
     * 定位Element
     */
    public WebElement element(By by){
        WebElement element=baseDriver.findElement(by);
        return element;
    }

    /**
     * 元素的点击事件
     */
    public void click(WebElement element){
        if (element!=null){
            element.click();
        }else {
            System.out.println("元素不能点击！");
        }
    }
    /**
     * 封装输入sendkeys
     */
    public void sendKeys(WebElement element,String value){
        if (element!=null){
            element.sendKeys(value);
        }else {
            System.out.println("输入失败");
        }
    }

    /**
     * 判断元素是否显示
     */
    public boolean assertElement(WebElement element){
        return element.isDisplayed();
    }
}
