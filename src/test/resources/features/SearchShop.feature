# language: en
@searchShop
Feature: Search Stores nearby de zipcode
  I want to use this template for my feature file

  Scenario Outline: Access site and locate shops neaby the zip code
    Given I want to locate the shops nearby me
    When I send my zip code "<zipCode>"
    Then I can see the shops nearby me

    Examples: 
      | zipCode   |
      | 01310-200 |
