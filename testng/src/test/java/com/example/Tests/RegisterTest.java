package com.example.Tests;

import com.example.PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends RegisterPage
{

    WebDriver driver ;
    String baseUrl = "https://awesomeqa.com/ui/";

    public RegisterTest(WebDriver driver) {
        super(driver);
    }

    @BeforeTest
    public  void baseTest (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);

    }
    @Test
    public void Register(){
       setClickRegister();
       setRegister();
       fillFormRegister();
    }
}
