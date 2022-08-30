package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {

    private static WebDriver driver;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newAddress() {
        WebElement createNewAddress = driver.findElement(By.cssSelector("a[data-link-action='add-address']"));
        createNewAddress.click();
    }

    public void addNewAddress(String alias, String address, String city, String zipCode, String country, String phone) {
        WebElement aliasInput = driver.findElement(By.cssSelector("input[name='alias']"));
        WebElement addressInput = driver.findElement(By.cssSelector("input[name='address1']"));
        WebElement cityInput = driver.findElement(By.cssSelector("input[name='city']"));
        WebElement zipCodeInput = driver.findElement(By.cssSelector("input[name='postcode']"));
        WebElement countryInput = driver.findElement(By.cssSelector("select[name='id_country']"));
        WebElement phoneInput = driver.findElement(By.cssSelector("input[name='phone']"));

        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        zipCodeInput.sendKeys(zipCode);
        countryInput.sendKeys(country);
        phoneInput.sendKeys(phone);
    }

    public void clickOnSaveButton() {
        WebElement saveButton = driver.findElement(By.className("btn-primary"));
        saveButton.click();
    }

    public boolean checkAddedAddressVisibility() {
        WebElement addedAddressVisibility = driver.findElement(By.className("alert-success"));
        String addedAddressText = addedAddressVisibility.getText();
        if (addedAddressText == "Address successfully added!") {
            return true;
        } else {
            return false;
        }
    }

}
