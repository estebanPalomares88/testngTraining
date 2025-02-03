package org.example.ui.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.example.ui.pom.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageService {
    Dotenv env = Dotenv.load();
    String url = this.env.get("UI_URL");


    private final LoginPage page = new LoginPage();
    private final WebDriver driver;
    private final WebDriverWait wait;

    public LoginPageService() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        Duration elementTimeOut = Duration.ofSeconds(10);
        this.wait = new WebDriverWait(this.driver, elementTimeOut);
    }

    public void openLoginPage() {
        this.driver.get(this.url);
    }

    public void closeLoginPage() {
        this.driver.close();
    }

    public void typeOnUserInput (String userName) {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getUserInput())));
        this.driver.findElement(this.page.getUserInput()).sendKeys(userName);
    }

    public void typeOnPasswordInput (String pass) {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getPassInput())));
        this.driver.findElement(this.page.getPassInput()).sendKeys(pass);
    }

    public void clickOnLoginButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getLoginButton())));
        this.driver.findElement(this.page.getLoginButton()).click();
    }

    public String getTittleInventory() {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getTittleInventory())));
        return this.driver.findElement(this.page.getTittleInventory()).getText();
    }
}
