# Contact form features allows the user contact UBS
Feature: Contact page

  Scenario: Open the specific contact form for the user
    Given I am on UBS home page
    When I click on contact menu
    And Select the option "Contact Us"
    And Select the country "Panama"
    Then I should see the contact form for "Panama"

  Scenario Outline: User send a message through the contact form
    Given I am on contact form for "Panama"
    And I select the form with my <request-option>
    And Select the <amount> of money that I want to invest
    And Write down my <specific-request>
    And Select my title as <Mr>
    And Fill the form with my <first-name>
    And Fill the form with my <last-name>
    And Fill the form with my <email-address>
    And Fill the form with my <telephone>
    And Select my country "Panama"
    And I click on "Confirmation" to the legal note
    And Submit my request
    Then I should see the confirmation message

    Examples:
      | request-option        | amount | specific-request | Mr   | first-name | last-name | email-address     | telephone |
      | International Banking | true   | I'm so poor!     | true | Wilson     | Ball      | will.ball@not.com | 999999    |