package com.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;
    private By clickRegister = By.xpath("//span[normalize-space()='My Account']");
    private By register = By.xpath("//a[contains(text(),'Register')]");
    private By firstname = By.id("input-firstname");
    private By lastname = By.id("input-lastname");
    private By email = By.cssSelector("#input-email");
    private By phone = By.cssSelector("#input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private  By policy = By.xpath("//input[@name='agree']");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setClickRegister() {
        driver.findElement(clickRegister).click();
    }

    public void setRegister() {
        driver.findElement(register).click();
    }
    public void fillFormRegister (){
        driver.findElement(firstname).sendKeys("islam");
        driver.findElement(lastname).sendKeys("galal");
        driver.findElement(email).sendKeys("sas@g.com");
        driver.findElement(phone).sendKeys("12112121");
        driver.findElement(password).sendKeys("12121212");
        driver.findElement(confirmPassword).sendKeys("12121212");
        driver.findElement(policy).click();

    }
}