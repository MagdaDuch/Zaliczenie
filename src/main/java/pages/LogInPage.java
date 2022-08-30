package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private static WebDriver driver;

    public LogInPage(WebDriver driver) {this.driver = driver;}

    public void logIn(){
        WebElement emailInput = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='password']"));
        WebElement signInButton = driver.findElement(By.id("submit-login"));

        emailInput.sendKeys("kcrdflbsdhckcsyrvq@bvhrk.com");
        passwordInput.sendKeys("haslo1234");
        signInButton.click();
    }


}
