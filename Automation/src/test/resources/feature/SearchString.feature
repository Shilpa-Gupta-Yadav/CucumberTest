# Developed By : Shilpa
# Last Modified By: Shilpa

Feature: Search a String in google.com

@searchString
Scenario: Input string in search test field and click on Search Button
Given I have Open application
When I enter search string into test field
And click on Search Button
Then Display the search result 