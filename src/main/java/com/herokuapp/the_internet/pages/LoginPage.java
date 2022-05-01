package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By secureAreaText = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By errorMessageText = By.xpath("//div[@id='flash']");
    By inValidPassword = By.xpath("//div[@id='flash']");


    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);

    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSecureAreaText() {
        return getTextFromElement(secureAreaText);
    }
    public String getErrorMessageText(){
        return getTextFromElement(errorMessageText);
    }
    public String getInValidPassword(){
        return getTextFromElement(inValidPassword);


}}
