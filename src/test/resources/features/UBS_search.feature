# This feature performs the global search on www.ubs.com

Feature: Global Search

  Scenario: Searching for information on UBS main website and validates weather it's works or not
    Given I am an user on UBS Home Page
    When I search for "Poland"
    Then I should see the search page results