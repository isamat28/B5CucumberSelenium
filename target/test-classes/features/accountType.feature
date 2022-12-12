Feature: Account Type

  Background:
    Given The user is on the login page

  Scenario: Teacher User
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains"Teacher"

  Scenario: Student User
    When The user logs in using "studentB5@ets.com" and "studentB5"
    Then The welcome message contains"student"

  Scenario: Developer User
    When The user logs in using "developerB5@ets.com" and "developerB5"
    Then The welcome message contains"developer"

  @wip
  Scenario Outline: Different User Type
    When The user logs in using "<username>" and "<password>"
    Then The welcome message contains"<name>"
    Examples:
      | username            | password    | name      |
      | eurotech@gmail.com  | Test12345!  | Teacher   |
      | studentB5@ets.com   | studentB5   | student   |
      | developerB5@ets.com | developerB5 | developer |
