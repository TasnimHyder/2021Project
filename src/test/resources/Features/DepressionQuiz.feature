
@tag
Feature: Depression Quiz Feature
  This feature is for Depression Quiz functionality

  @tag1
  Scenario: Verify that user is able to take Depression Quiz
		Given I land on the WebMD homepage
    And I move the mouse over the tab "Health A-Z"
    And I click on link "Depression"
    And I land on Depression page
    And I click on menu button
    And I click on Quizzes link
    And I land on Depression Quizzes Page
    And I click on Myths and Facts About Depression Symptoms link
    And I land on the page with first quiz
    And  I am able to select the answers and complete the quizzes
    Then I am able to see the quiz result

