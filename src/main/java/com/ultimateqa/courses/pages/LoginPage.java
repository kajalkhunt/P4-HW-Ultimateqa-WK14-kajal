package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']/a");
    By verifyWelcomeBackText = By.xpath("//h2[@class='page__heading']");
    By userNameField = By.id("user[email]");
    By userPasswordField = By.id("user[password]");
    By signinButton = By.xpath("//button[@type='submit']");
    By InvalidCredentialMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void clickOnSigninLink(){
        clickOnElement(signLink);
    }
    public void clickOnSigninButton(){
        clickOnElement(signinButton);
    }

    public String verifyWelcomeBackTextMessage(){
        return getTextFromElement(verifyWelcomeBackText);
    }

    public void enterInvalidUserName(String userName){
        sendTextToElement(userNameField, userName);
    }

    public void enterInvalidPassword(String password){
        sendTextToElement(userPasswordField, password);
    }

    public String verifyInvalidCredentialMessage(){
        return getTextFromElement(InvalidCredentialMessage);
    }
}
