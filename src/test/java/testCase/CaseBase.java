package testCase;

import base.BaseDriver;

/**
 * 功能：用例的基类，初始化Driver
 */
public class CaseBase {
    public BaseDriver InitDriver(String browser){
        return new BaseDriver(browser);
    }

}
