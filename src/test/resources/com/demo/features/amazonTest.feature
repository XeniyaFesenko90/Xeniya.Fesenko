Feature: The application should be running

  @Smoke
  Scenario: simple search
    Given I am on the home page
    When I search for "iphone 11"
    Then I should see the results

