package testCaseExecution_stepDefinition;

import baseClass.browserSetupMine;
import cucumber.api.java.en.*;
import objectRepository_WebElementPaths.loginPage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class loginPageTest extends browserSetupMine{

  //  WebDriver driver;
    @Given("^CtoK application is launched$")
    public void ctok_application_is_launched() throws Throwable {
        File file = new File(".\\config\\file.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        Thread.sleep(100);

        browserSetupMine bsm = new browserSetupMine();
        bsm.launchBrowser(prop.getProperty("browsername"),prop.getProperty("baseURL"));
     //   bsm.launchBrowser(prop.getProperty("browsername"),prop.getProperty("baseURL"));
        Thread.sleep(100);
    }

    @When("^User Clicks on Signin button$")
    public void user_Clicks_on_Signin_button() throws Throwable {
        loginPage lp = new loginPage();
        lp.setSignIn();


    }

    @When("^User Enters username \"([^\"]*)\"$")
    public void user_Enters_username(String setUserName) throws Throwable {
        loginPage lp = new loginPage();
        lp.username(setUserName);

    }

    @When("^User Enters password \"([^\"]*)\"$")
    public void user_Enters_password(String setPassword) throws Throwable {
        loginPage lp = new loginPage();
        lp.password(setPassword);
    }

    @When("^User Clicks on login button$")
    public void user_Clicks_on_login_button() throws Throwable {
        loginPage lp = new loginPage();
        lp.setLoginSignIn();

    }

    @Then("^User validates the title of the page$")
    public void user_validates_the_title_of_the_page() throws Throwable {
        loginPage lp = new loginPage();
        lp.getTitle();

    }
}
