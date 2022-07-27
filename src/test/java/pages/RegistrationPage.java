package pages;

import config.BaseConfigPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class RegistrationPage extends BaseConfigPage {

    /**
     * Имя пользователя
     */
    @FindBy (xpath = "//input[@id='firstName']")
    private WebElement regNameFiled;

    /**
     * Фамилия пользователя
     */
    @FindBy (xpath = "//input[@id='lastName']")
    private  WebElement regLastNameFiled;

    /**
     * Email пользователя
     */
    @FindBy (xpath = "//input[@id='userEmail']")
    private WebElement regEmailFiled;

    /**
     * Гендер: Мужчина
     */
    @FindBy (xpath = "//input[@id='gender-radio-1']/..")
    private WebElement regGenderMale;

    /**
     * Гендер: Женщина
     */

    @FindBy (xpath = "//input[@id='gender-radio-2']")
    private WebElement regGenderFemale;

    /**
     * Гендер: Другое
     */
    @FindBy (xpath = "//input[@id='gender-radio-3']")
    private WebElement regGenderOther;

    /**
     * Мобильный номер
     */
    @FindBy (xpath = "//input[@id='userNumber']")
    private WebElement regMobileNumber;

    /**
     * Дата рождения
     */
    @FindBy (xpath = "//input[@id='dateOfBirthInput']")
    private  WebElement regDataOfBirthDay;


    /**
     * Учебные дисциплины
     */
    @FindBy (xpath = "//div[@id='subjectsContainer']")
    private WebElement regEducationalSubjects;

    /**
     * Подразделения учебных дисцеплин
     */
    @FindBy (xpath = "@FindBy (xpath = //div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3'])")
    private WebElement subTabRegEducationalSubjects;
    /**
     * Хобби: спорт
     */
    @FindBy (xpath = "//div[@class='col-md-9 col-sm-12']/div/label[contains(text(),'Sports')]/preceding-sibling::input")
    private WebElement regHobbiesSport;

    /**
     * Хобби: Чтение
     */
    @FindBy (xpath = "//div[@class='col-md-9 col-sm-12']/div/label[contains(text(),'Reading')]/preceding-sibling::input")
    private WebElement regHobbiesReading;

    /**
     * Хобби: Музыка
     */
    @FindBy (xpath = "//div[@class='col-md-9 col-sm-12']/div/label[contains(text(),'Music')]/preceding-sibling::input")
    private WebElement regHobbiesMusic;

    /**
     * Адрес
     */
    @FindBy (xpath = "//textarea[@id='currentAddress']")
    private WebElement regAddress;

    /**
     * Выбор штата
     */
    @FindBy (xpath = "//div[@id='state']")
    private WebElement regState;

    /**
     * Выбор города
     */
    @FindBy (xpath = "//div[@id='city']")
    private WebElement regCity;

    /**
     * Кнопка "отправить"
     */
    @FindBy (xpath = "//button[@id='submit']")
    private WebElement regButtonSubmit;

    /**
     * Элемент загрузки файла
     */
    @FindBy (xpath = "//input[@id='uploadPicture']")
    private WebElement regUploadPicture;

    /**
     * Подвкладкда "Practice Form"
     */
    @FindBy (xpath = "//span[contains(text(),'Practice Form')]")
    public static WebElement subTabPracticeForm;



    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }


    public void fillRegistrationForm(String name, String lastname, String email, String mobile, String subjects,String address){
        subTabPracticeForm.click();
        regNameFiled.sendKeys(name);
        regLastNameFiled.sendKeys(lastname);
        regEmailFiled.sendKeys(email);
        regGenderMale.click();
        regMobileNumber.sendKeys(mobile);
        regEducationalSubjects.click();
        subTabRegEducationalSubjects.sendKeys(subjects);
        regHobbiesSport.click();
        regHobbiesMusic.click();
        regAddress.sendKeys(address);






    }

//    public void addFileToDocument(WebElement element) {
//        String path = "/Users/BMW/Desktop/QA Auto/file/i_003.jpeg";
//        File f = new File(path);
//        element.sendKeys(f.getAbsolutePath());
//    }

    public void uploadFile() throws Exception {
        regUploadPicture.sendKeys("/Users/BMW/Desktop/QA Auto/file/i_003.jpeg");
    }
//    public void dataPick(String dataBirthDay){
//        Actions actionList = new Actions(driver);
//        actionList.clickAndHold(regDataOfBirthDay).sendKeys(dataBirthDay)
//                .release().build().perform();
//    }

    public void dataBirthDay(String idElementBirthDay, String dataBirtDay){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('"+ idElementBirthDay+"').value='"+dataBirtDay+"';");
    }


}
