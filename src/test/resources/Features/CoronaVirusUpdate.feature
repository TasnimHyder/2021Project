Feature: Corona Virus Update Feature
  This feature is for Corona Virus Update feature

  @Sprint2
  Scenario Outline: Verify that the user is able to get Corona Virus update for each states in the United States
    Given I land on the WebMD homepage
    And I click on the Corona Virus Update Link
    And I land on the Corona Virus Update page
    And I click on "<State>" on the United States map
    Then I am shown Corona Virus updates for the State

    Examples: 
      | State   |
      | Wyoming |    
      | Kansas  |    
