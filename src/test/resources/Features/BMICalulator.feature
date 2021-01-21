Feature: BMI Calculator Feature
  This feature is for WebMD BMI Calculator functionality


  @Sanity
  Scenario Outline: Verify that user is able see warning error message if user enters invalid data in BMI Calculator
    Given I land on the WebMD homepage
    And I click on the BMI Calcular link
    And I land on BMI Calculator Page
    And I enter "<feet>" in feet text box
    And I eneter "<inches>" in inches text box
    And I eneter "<pounds>" in pounds text box
    Then I am able to see error message

    Examples: 
      | feet | inches | pounds |
      |    0 |     11 |     80 |
      |   10 |      0 |    800 |
      |    5 |     12 |     88 |

  @Sanity @Regression
  Scenario Outline: Verify that user is able see warning error message if user enters valid data in BMI Calculator
    Given I land on the WebMD homepage
    And I click on the BMI Calcular link
    And I land on BMI Calculator Page
    And I enter "<feet>" in feet text box
    And I eneter "<inches>" in inches text box
    And I eneter "<pounds>" in pounds text box
    And I click calculate button
    Then I am able to see BMI Result

    Examples: 
      | feet | inches | pounds |
      |    6 |      0 |     88 |
      |    8 |      5 |    100 |
      |    6 |     11 |    500 |
