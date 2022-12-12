Feature: The user should be able to edit profile
@edit
  Scenario: edit profile
    Given The user is on the login page
    When The user logs in using {eurotech@gmail.com} and {Test12345!}
    And The user navigates to "Edit Profile"
    And The user select status"Instructor"
    And The user slides the slider
    And The user add "company" "Eurotech Study"
    And The user add "website" "http://www.eurotecstudy.com/"
    And The user add "location" "London"
    And The user add "skills" "Java,Cucumber,Junit"
    And The user add "githubusername" "eurotech2022"
    And The user add "bio" "SDET Eurotech"
    Then The user click on the submit button