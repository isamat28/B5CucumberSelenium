
Feature: Login as different user and go to navigate menu
Background:
  Given The user is on the login page

  Scenario: Login as a teacher and verify welcome message and go to developer page and verify "Filter Profiles by Skill or by Location"
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains"Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location" message

  Scenario: User navigates to All Post Menu
    When The user logs in using "studentB5@ets.com" and "studentB5"
    Then The welcome message contains"student"
    And The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts" message

  Scenario: User navigates to My Account Menu
    When The user logs in using "developerB5@ets.com" and "developerB5"
    Then The welcome message contains"developer"
    And The user navigates to "My Account" menu
    Then The user should be able to see header as "Dashboard" message
@Task
    Scenario Outline: User navigates different Menu
      When The user logs in using "<username>" and "<password>"
      Then The welcome message contains"<name>"
      And The user navigates to "<menuName>" menu
      Then The user should be able to see header as "<headerName>" message


      Examples:
        | username |password|name|menuName|headerName|
        | eurotech@gmail.com |Test12345!|Teacher|Developers|Filter Profiles by Skill or by Location|
        | developerB5@ets.com |developerB5|developer|My Account|Dashboard|