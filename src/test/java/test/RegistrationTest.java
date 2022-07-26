package test;

import config.BaseConfigTest;
import helpers.Navigation;
import org.junit.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class RegistrationTest extends BaseConfigTest {

    @Test
    public void registrationCheck(){
        RegistrationPage registrationPage = new HomePage()
                .openFormPage();
        Navigation.openTabForm(Navigation.subTabPracticeForm);
        registrationPage.fillRegistrationForm();




    }

}
