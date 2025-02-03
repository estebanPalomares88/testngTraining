package org.example.ui.pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPage {

    private final By userInput = By.xpath("//*[@id=\"user-name\"]"),
            passInput = By.xpath("//*[@id=\"password\"]"),
            loginButton = By.xpath("//*[@id=\"login-button\"]"),
            tittleInventory = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");
}
