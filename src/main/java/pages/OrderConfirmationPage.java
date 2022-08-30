package pages;

import org.openqa.selenium.*;

import java.io.File;

public class OrderConfirmationPage {

    private static WebDriver driver;

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkOrderConfirmationVisibility() {
        WebElement orderConfirmationVisibility = driver.findElement(By.cssSelector("h3[class='h1 card-title']"));
        String orderConfirmationText = orderConfirmationVisibility.getText();
        if (orderConfirmationText == "Your order is confirmed") {
            return true;
        } else {
            return false;
        }
    }
}
