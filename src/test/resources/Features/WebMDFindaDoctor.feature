#Author: Dikesh Shrestha
Feature: Find a Doctor Feature
  This feature is for WebMD Find a Doctor functionality

@Sprint1
Scenario Outline: Verify that user is able to use the Find a Doctor functionality of WebMD page 
Given I land on the WebMD homepage
When I click on the Find a Doctor Link
And I land on Find a Doctor page
And I enter "<condition>" in the first search bar
And I press Tab button in the keyboard
And I enter "<Zip>" in the second search bar
And I press Tab button in the keyboard
And I press Enter button in the keyboard
Then I am able to see the list of doctors.
Examples:
| condition |    Zip  |
| Diabetes  |  66012  |
| Back Pain |  66160  |
| Sinus     |  66115  |	

@Sprint1 @Regression
 Scenario Outline: Verify that user is not able to use the Find a Doctor functionality of WebMD page entering invalid zipcode
 Given I land on the WebMD homepage
	When I click on the Find a Doctor Link
	And I land on Find a Doctor page
	And I enter "<condition>" in the first search bar
	And I press Tab button in the keyboard
	And I enter "<Zip>" in the second search bar
	And I press Tab button in the keyboard
	And I press Enter button in the keyboard
	Then I am able to see error message.
	Examples:
	| condition |    Zip   |
	| abc       |  11289   |
	| Bgh       |  112     |
	| aaaa      |  123464  |

	