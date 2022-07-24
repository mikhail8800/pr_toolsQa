package config;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

abstract public class BaseConfigPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }



}
