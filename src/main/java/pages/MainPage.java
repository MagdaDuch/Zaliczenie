package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static WebDriver driver;

    public MainPage(WebDriver driver) {this.driver = driver;}

    public void clickSignIn() {
        WebElement signIn = driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));
        signIn.click();
    }

    public void clickOnProduct(){
        WebElement hummingbirdPrintedSweater = driver.findElement(By.cssSelector("img[src='https://mystore-testlab.coderslab.pl/img/p/2/1/21-home_default.jpg']"));
        hummingbirdPrintedSweater.click();
    }


}

