package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

    private static WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddressConfirmation() {
        WebElement addressesConfirmation = driver.findElement(By.cssSelector("button[name='confirm-addresses']"));
        addressesConfirmation.click();
    }

    public void shippingAndPaymentMethod() throws InterruptedException {
        WebElement shippingMethod = driver.findElement(By.id("checkout-delivery-step"));
        shippingMethod.click();
        Thread.sleep(250);
        WebElement chooseShippingMethod = driver.findElement(By.id("delivery_option_1"));
        chooseShippingMethod.click();
        Thread.sleep(250);
        WebElement continueButton = driver.findElement(By.cssSelector("button[name='confirmDeliveryOption']"));
        continueButton.click();
        WebElement choosePaymentMethod = driver.findElement(By.id("payment-option-1"));
        choosePaymentMethod.click();
    }

    public void clickOrderWithAnObligationToPay(){
        WebElement termsOfServiceAgreement = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        termsOfServiceAgreement.click();
        WebElement orderWithAnObligationToPayButton = driver.findElement(By.cssSelector("div[class='ps-shown-by-js']"));
        orderWithAnObligationToPayButton.click();
    }
}
