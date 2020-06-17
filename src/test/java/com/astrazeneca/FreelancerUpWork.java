package com.astrazeneca;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FreelancerUpWork {

     WebDriver driver;
     WebDriverWait wait;

    public void navegarSitio(String url) {

        System.setProperty("webdriver.chrome.driver", "C:\\libs\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }


    public void verificarLandingPage() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".navbar-brand")));

    }

    public void buscaFreelancer() {

        WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".d-lg-flex [name='q']")));
        textBox.sendKeys("selenium");
        WebElement lupa = driver.findElement(By.cssSelector(".navbar-collapse.d-lg-flex button[type='submit']"));
        lupa.click();

    }

    public void listarFreelancer() {


    }

}
