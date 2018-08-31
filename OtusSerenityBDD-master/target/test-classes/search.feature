Feature: Search

  Scenario: Positive search test
    Given I browse to sputnik.ru
    When I enter "Области Россия" in search field
    And I click search button
    Then I see results page
    And I see result container
    And I see result list

  Scenario: Negative search test
    Given I browse to sputnik.ru
    When I enter ""cmeokdmceokmrbntgbirrfv,=)lp"" in search field
    And I click search button
    Then I see results page
    And I see error message