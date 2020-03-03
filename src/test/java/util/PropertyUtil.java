package util;

import java.io.*;
import java.util.Properties;

/**
 * 定位元素数据存入的配置文件的工具类
 */
public class PropertyUtil {
    private Properties properties;
    private String filePath;//配置文件的路径
    public PropertyUtil(String filePath) throws IOException {
        this.filePath=filePath;
        this.properties=readProperties();
    }

    /**
     * 读取配置文件
     */
    private Properties readProperties() throws IOException {
        properties=new Properties();
        InputStream inputStream=new FileInputStream(filePath);
        BufferedInputStream inputStream1=new BufferedInputStream(inputStream);
        //load方法其实就是传进去一个输入流，字节流或者字符流
        properties.load(inputStream);
        return properties;
    }

    /**
     * 获取配置文件中的指定数据
     */
    public String getProperty(String key) throws IOException {
        if (properties.containsKey(key)) {
            String userString=properties.getProperty(key);
            return userString;
        }else {
            System.out.println("你获取的key不存在");
            return "";
        }
    }
}
