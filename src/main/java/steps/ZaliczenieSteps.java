package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.log.Log;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ZaliczenieSteps {

    WebDriver driver;
    @Given("User in on the {string} website")
    public void userInOnTheWebsite(String url) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }


    @When("User clicks {string} button")
    public void userClicksButton(String arg0) {
        MainPage onMainPage = new MainPage(driver);
        onMainPage.clickSignIn();
    }


    @And("User inputs email address and password and clicks SingIn button")
    public void userInputsEmailAddressAndPasswordAndClicksSingInButton() {
        LogInPage onLogInPage = new LogInPage(driver);
        onLogInPage.logIn();
    }

    @And("User clicks Addresses")
    public void userClicksAddresses() {
        MyAccountPage onMyAccountPage = new MyAccountPage(driver);
        onMyAccountPage.clickAddresses();
    }

    @And("User clicks +CreateNewAddress")
    public void userClicksCreateNewAddress() {
        AddressesPage onAddressesPage = new AddressesPage(driver);
        onAddressesPage.newAddress();
    }

    @And("User fills the address form with {string}, {string}, {string}, {string}, {string}, {string} and clicks Save button")
    public void userFillsTheAddressFormWithAndClicksSaveButton(String alias, String address, String city, String zipCode, String country, String phone) {
        AddressesPage onAddressesPage = new AddressesPage(driver);
        onAddressesPage.addNewAddress(alias, address, city, zipCode, country, phone);
        onAddressesPage.clickOnSaveButton();
    }

    @Then("User's address is added")
    public void userSAddressIsAdded() {
        AddressesPage onAddressesPage = new AddressesPage(driver);
        onAddressesPage.checkAddedAddressVisibility();
    }

    @And("User clicks MyStore logo to get back to the main page")
    public void userClicksMyStoreLogoToGetBackToTheMainPage() {
        MyAccountPage onMyAccountPage = new MyAccountPage(driver);
        onMyAccountPage.clickMyStore();
    }

    @And("User chooses to buy HummingbirdPrintedSweater")
    public void userChoosesToBuyHummingbirdPrintedSweater() {
        MainPage onMainPage = new MainPage(driver);
        onMainPage.clickOnProduct();
    }

    @And("User chooses size, quantity and adds product to cart")
    public void userChoosesSizeQuantityAndAddsProductToCart() throws InterruptedException {
        ProductPage onProductPage = new ProductPage(driver);
        onProductPage.chooseSize();
        onProductPage.chooseQuantity();
        onProductPage.clickAddToCart();
    }

    @And("User proceeds to checkout")
    public void userProceedsToCheckout() {
        CartPage onCartPage = new CartPage(driver);
        onCartPage.ClickProceedToCheckout();
    }

    @And("User confirms their address")
    public void userConfirmsTheirAddress() {
        OrderPage onOrderPage = new OrderPage(driver);
        onOrderPage.clickAddressConfirmation();
    }

    @And("User chooses shipping and payment method")
    public void userChoosesShippingAndPaymentMethod() throws InterruptedException {
        OrderPage onOrderPage = new OrderPage(driver);
        onOrderPage.shippingAndPaymentMethod();
    }

    @And("User clicks OrderWithAnObligationToPay Button")
    public void userClicksOrderWithAnObligationToPayButton() {
        OrderPage onOrderPage = new OrderPage(driver);
        onOrderPage.clickOrderWithAnObligationToPay();
    }

    @Then("Order is made")
    public void orderIsMade() {
        OrderConfirmationPage onOrderConfirmationPage = new OrderConfirmationPage(driver);
        onOrderConfirmationPage.checkOrderConfirmationVisibility();
    }
}
