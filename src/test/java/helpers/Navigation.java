package helpers;

import config.BaseConfigPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends BaseConfigPage {
    /**
     * Вкладка "Forms"
     */
    @FindBy(xpath = "//div[contains(text(),'Forms')]/ancestor::div[@class='element-group']")
    public static WebElement tabForms;

    /**
     * Подвкладкда "Practice Form"
     */
    @FindBy (xpath = "//li[@class='btn btn-light active']")
    public static WebElement subTabPracticeForm;

    public Navigation(){
        PageFactory.initElements(driver,this);
    }

    public static void openTabForm(WebElement webElement){
        tabForms.click();
        webElement.click();
    }







}
