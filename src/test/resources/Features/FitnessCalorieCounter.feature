

Feature: Fitness Calorie Counter Feature
	This feature is for WebMD Fitness Calorie Counter
  
  @Sprint2
  Scenario Outline: Verify that user is able to use the Fitness Calorie Counter Functionality of WebMD page
    Given I land on the WebMD homepage
    And I click on Fitness Calorie Counter
		And I land on Fitness & Exercise page
    And I click "<Excercise>" from the visible popular exercises
		And I click Excersice Type from the Select an Exercise list
    And I enter "<lbs>" in the weight text box
    And I enter "<hrs>" and "<mins>" in the duration text boxes
    And I click Calculate button
    Then I can see the number of calories I burned


    Examples: 
     | Excercise |     lbs   |  hrs  | mins  |
     | Bicycling |     80    |   2   |  2    |
     |  Swimming |     90    |   1   |  0    |
     |  Dancing  |     100   |   3   |  1    |
  

