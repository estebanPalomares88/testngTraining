package org.example.ui.controller;

import io.github.cdimascio.dotenv.Dotenv;
import org.example.ui.service.LoginPageService;

import static org.assertj.core.api.Assertions.*;

public class LoginPageController {
    Dotenv env = Dotenv.load();

    private final LoginPageService service = new LoginPageService();

    public void goToLoginPage() {
        this.service.openLoginPage();
    }

    public void closeLoginPage() {
        this.service.closeLoginPage();
    }

    public void sendCredentials(String scenario) {
        String userName = null;
        String pass = this.env.get("PASSWORD");
        switch (scenario) {
            case "valid":
                userName = this.env.get("VALID_USER");
                break;
            default:
                System.out.println("The scenario: " + scenario + " does not exist!");
                assertThat(false).isTrue();
                break;
        }
        this.service.typeOnUserInput(userName);
        this.service.typeOnPasswordInput(pass);
        this.service.clickOnLoginButton();
    }

    public String getTittleInventory() {
        return this.service.getTittleInventory();
    }
}
