Feature: New user's address

  Scenario Outline: Adding a user's address on the webside https://mystore-testlab.coderslab.pl/
    Given User in on the "https://mystore-testlab.coderslab.pl/" website
    When User clicks "Sing in" button
    And User inputs email address and password and clicks SingIn button
    And User clicks Addresses
    And User clicks +CreateNewAddress
    And User fills the address form with "<alias>", "<address>", "<city>", "<zip code>", "<country>", "<phone>" and clicks Save button
    Then User's address is added
    Examples:
      | alias       | address   | city     | zip code | country        | phone        |
      | MainAddress | Street 47 | New York | 55543    | United Kingdom | 222 478 5573 |