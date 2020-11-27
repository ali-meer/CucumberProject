package objectRepository_WebElementPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    public WebDriver driver;
    //String baseURL = "https://www.ck12.org/features#dashboard";
    String SignInBtn = "//ul/li/a/span[contains(text(),'sign in')]";
    String usernameTxt = "//input[@name='login']";
    String passwordTxt = "//input[@name='token']";
    String loginSignInBtn = "//input[@value='Sign In']";
    String libraryBtn = "//ul/li[3]/a[contains(text(),'Library')]";
    String dropdownCreateNew = "//a[@id='dropdown-create']";
    String dropdownQuiz = "//ul/li[4]/a[contains(text(),' Quiz')]";

    public void setSignIn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(SignInBtn)).click();
    }

    public void username(String username) throws InterruptedException {
        driver.findElement(By.xpath(usernameTxt)).sendKeys(username);
        Thread.sleep(1000);
    }

    public void password(String password) throws InterruptedException {
        driver.findElement(By.xpath(passwordTxt)).sendKeys(password);
        Thread.sleep(1000);
    }

    public void setLoginSignIn() throws InterruptedException {
        driver.findElement(By.xpath(loginSignInBtn)).click();
        Thread.sleep(3000);
    }

    public void libraryBtn() throws InterruptedException {
        driver.findElement(By.xpath(libraryBtn)).click();
        Thread.sleep(3000);
    }

    public void dropdownCreateNew() throws InterruptedException {
        driver.findElement(By.xpath(dropdownCreateNew)).click();
        Thread.sleep(3000);
    }

    public void dropdownQuiz() throws InterruptedException {
        driver.findElement(By.xpath(dropdownQuiz)).click();
        Thread.sleep(3000);
    }
    public void getTitle() throws InterruptedException {
        String titlePage = driver.getTitle();
        System.out.println(titlePage);
        Thread.sleep(3000);
    }

}
