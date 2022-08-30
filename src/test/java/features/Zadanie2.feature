Feature: New user's order

  Scenario: Ordering a sweater on the webside https://mystore-testlab.coderslab.pl/
    Given User in on the "https://mystore-testlab.coderslab.pl/" website
    When User clicks "Sing in" button
    And User inputs email address and password and clicks SingIn button
    And User clicks MyStore logo to get back to the main page
    And User chooses to buy HummingbirdPrintedSweater
    And User chooses size, quantity and adds product to cart
    And User proceeds to checkout
    And User confirms their address
    And User chooses shipping and payment method
    And User clicks OrderWithAnObligationToPay Button
    Then Order is made
