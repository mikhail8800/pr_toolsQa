package test;

import config.BaseConfigTest;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import pages.RegistrationPage;

import java.io.File;

public class RegistrationTest extends BaseConfigTest {


    @Test
    public void registrationCheck() throws Exception {


        RegistrationPage registrationPage = new HomePage()
                .openFormPage();
        registrationPage.fillRegistrationForm(
                "ivan",
                "ivanov",
                "123@gmail.com",
                "79001111111",
                "M",
                "ul.Lenina 22");
        registrationPage.uploadFile();
        registrationPage.dataBirthDay("dateOfBirthInput","21.01.2000");
//        registrationPage.dataPick("23.07.2022");




//        registrationPage.addFileToDocument(regUploadPicture);
//        GenericMethods.fillDateId("dateOfBirth-label","30 Jul 2022");

    }

}
