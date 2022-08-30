package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

    private static WebDriver driver;

    public MyAccountPage(WebDriver driver) {this.driver = driver;}

    public void clickAddresses(){
        WebElement addresses = driver.findElement(By.cssSelector("a[title='Addresses']"));
        addresses.click();
    }

    public void clickMyStore(){
        WebElement myStore = driver.findElement(By.id("_desktop_logo"));
        myStore.click();
    }
}
