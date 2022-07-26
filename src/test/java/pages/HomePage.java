package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import config.BaseConfigPage;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseConfigPage{

    /**
     * Раздел "Элементы"
     */
    @FindBy (xpath = "//div[@class='card-body']/h5[contains(text(),'Elements')]")
    private WebElement buttonElements;

    /**
     * Раздел "Формы"
     */

    @FindBy (xpath = "//div[@class='card-body']/h5[contains(text(),'Forms')]")
    private WebElement buttonForms;


    public HomePage() {
        try {
            driver.get("//https://demoqa.com/");

        }catch (Exception e){
            System.out.println("URL не найден");
        }
        PageFactory.initElements(driver,this);
    }

    public RegistrationPage openFormPage(){
        buttonForms.click();
        return new RegistrationPage();
    }


}
