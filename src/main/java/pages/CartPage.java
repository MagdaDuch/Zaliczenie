package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private static WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickProceedToCheckout(){
        WebElement proceedToCheckoutButton1 = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        proceedToCheckoutButton1.click();
        WebElement proceedToCheckoutButton2 = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        proceedToCheckoutButton2.click();
    }
}
