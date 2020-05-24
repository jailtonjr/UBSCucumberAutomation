# "Services in your region" feature redirects the user to the proper page regarding its choose.Feature:

Feature: Services in your region
  Scenario: Jump the user for its respective region page
    Given I am user on UBS Home Page
    When I select my "domicile" and "country"
    Then I should see the my "country" page
