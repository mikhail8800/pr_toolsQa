package pages;

import config.BaseConfigPage;
import org.checkerframework.checker.fenum.qual.Fenum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    private WebElement regEmail;

    /**
     * Гендер: Мужчина
     */
    @FindBy (xpath = "//input[@id='gender-radio-1']")
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
     * Элемент прикрепления файла
     */


}
