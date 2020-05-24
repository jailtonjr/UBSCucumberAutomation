# This feature performs the global search on www.ubs.com

Feature: Global Search

  Scenario Outline: Searching for information on USB main website and validates weather it's works or not
    Given I am an user on UBS Home Page
    When I search for any <search-keyword>
    Then I should see the search page results

    Examples:
      | search-keyword |
      | Poland         |
      | Italy          |
      | Norway         |