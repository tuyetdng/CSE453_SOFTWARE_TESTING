#Feature: MainPage
#
#Scenario: Title exists
#Given I have opened the browser
#When I open Selenium test website
#Then Title should exits
#Feature: Title
#				 I want to check the title of a website provided I have its url
#	 Scenario: What is the title
#		Given I have opened the browser
#		When I open this url "https://www.selenium.dev/selenium/web/web-form.html"
#		Then I should receive its title as "Web form"
#Feature: Title
#I want to check the title of a website provided I have its url
#
#Scenario: What is the title
#Given I have opened the browser
#When I open this url "https://www.google.com/"
#Then I should receive its title as "Google"
#
#Scenario: Where is the Index page
#Given I have opened chrome
#When I go to Selenium "https://www.selenium.dev/selenium/web/web-form.html"
#And I click on the link "Return to index"
#Then I should be at index "https://www.selenium.dev/selenium/web/index.html"
#And The index title should be "Index of Available Pages"
Feature: Title
  I want to check the title of a website provided I have its url

  Scenario Outline: What is the title
    Given I have opened the browser
    When I open this url "<mlink>"
    Then I should receive its title as "<mtitle>"

    Examples: 
      | mlink                                               | mtitle   |
      | https://www.google.com/                             | Google   |
      | https://www.selenium.dev/selenium/web/web-form.html | Web form |

  Scenario: Where is the Index page
    Given I have opened chrome
    When I go to Selenium "https://www.selenium.dev/selenium/web/web-form.html"
    And I click on the link "Return to index"
    Then I should be at index "https://www.selenium.dev/selenium/web/index.html"
    And The index title should be "Index of Available Pages"
