package base;

import org.openqa.selenium.By;
import util.PropertyUtil;
import java.io.IOException;

/**
 * 功能：定位方式的封装，读取配置文件，返回元素的属性值
 */
public class ByLocation {
    public static By getLocator(String key) throws IOException {
        //使用配置文件中的html元素属性数据(key->value)
        PropertyUtil propertyUtil=new PropertyUtil("element.properties");
        String locator=propertyUtil.getProperty(key);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];

        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else if (locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }else if (locatorType.equals("partialLinkText")){
            return By.partialLinkText(locatorValue);
        }else if(locatorType.equals("tagName")){
            return By.tagName(locatorValue);
        }else if (locatorType.equals("cssSelector")){
            return By.cssSelector(locatorValue);
        }else{
            return By.xpath(locatorValue);
        }
    }
}
