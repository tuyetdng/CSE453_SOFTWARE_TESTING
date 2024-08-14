Feature: Dropdown Interaction

  Scenario Outline: Dropdown Interaction 
    Given I go to "https://letcode.in/dropdowns"
    When I pick apple from the first sDropdown
    Then The text is now your "<Full name>"
    When I append "<Student Id>" according to their Full name to TextBox
    Then The text is now I am good "<Student Id>"
		When I press TAB
		Then I read from the third TextBox and The text I received are "ortonikc"
		When I clear the fourth TextBox
		Then It is empty now
		When I check the fifth TextBox
		Then It is disabled
		When I check the sixth TextBox
		Then It is read-only
    Examples: 
      | Student Id | Full name    |
      | 2931200006 | Bag Man      |
      | 2131200085 | Water Man    |
      | 2031209001 | Hu Man       |
      | 2031200023 | Two Kick Man |
      | 2011311424 | Ok Girl      |
      


  Feature: Dropdown Interaction

  Scenario Outline: Dropdown Interaction
    Given I go to "https://letcode.in/dropdowns"
    When I pick apple from the first Dropdown
    Then You have selected Apple pop up
    When I chose Aquaman in the next Dropout
    Then You have selected Aquaman pop up
    When I chose the last programming language
    Then "You have selected C#" pops up
    When Select India using value
    Then Success


Feature: Radio & Checkbox Interaction

  Scenario Outline: Radio & Checkbox Interaction
    Given I go to "https://letcode.in/radio"
    When I pick Yes option in the first Radio
    Then The Yes is ticked
    When I try to tick all options in the second Radio
    Then Confirm you can select only one radio button
    When I try to tick all options in the third Radio
    Then Confirm you can select all radio button
    When I check if Bar is selected
    Then Bar is selected
    When I check if last field is disabled
    Then last field is disabled
    When I check if Remember me is selected
    Then Remember me is selected
