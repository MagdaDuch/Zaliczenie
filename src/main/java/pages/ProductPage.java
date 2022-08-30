package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private static WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseSize(){
        WebElement sizeInput = driver.findElement(By.className("form-control-select"));
        sizeInput.sendKeys("M");
    }

    public void chooseQuantity() throws InterruptedException {
        WebElement quantityUp = driver.findElement(By.className("touchspin-up"));
        int i=1;
        for (i=1; i<=5; i++) {
            quantityUp.click();
            Thread.sleep(250);
        }
    }

    public void clickAddToCart(){
        WebElement addToCart = driver.findElement(By.className("add-to-cart"));
        addToCart.click();
    }
}
