Feature: Functions of Alert

Background:

Given I connected on wi-fi atmosphere already


Scenario: Validate DeviceName

When I click on refresh button
Then I will see the name of device Connected

Scenario: Access the Alert Modal

When I click on the icon on the botton
Then Will open a alert Modal

Scenario: Insert Time on the Alert Modal

And  I click on the icon on the botton
When Click on the Set Time
And  Select the hour and minute
And  Will click on OK
Then Will insert on the Time description

Scenario: Select Time on the Alert Modal and Cancel

And  I click on the icon on the botton
When Click on the Set Time
And  Select the hour and minute
And  Will click on Cancel
Then Will not insert on the Time description

Scenario: Update Time on the Alert Modal

And  I click on the icon on the botton
And  Click on the Set Time
And  Select the hour and minute
And  Will click on OK
When Click again on the Set Time
And  update the hour and minute
Then Will update on the Time description

Scenario: Insert Duration on the Alert Modal

And  I click on the icon on the botton
When Click on the Set Duration
And  Select the hour and minute of Duration
And  Will click on OK
Then Will insert on the Duration description

Scenario: Select Duration on the Alert Modal and Cancel

And  I click on the icon on the botton
When Click on the Set Duration
And  Select the hour and minute of Duration
And  Will click on Cancel
Then Will not insert on the Duration description

Scenario: Update Duration on the Alert Modal

And  I click on the icon on the botton
And  Click on the Set Duration
And  Select the hour and minute of Duration
And  Will click on OK
When Click again on the Set Duration 
And  update the hour and minute of Duration
Then Will update on the Duration description

Scenario: Select weekday on the alert

And  I click on the icon on the botton
When I select any Weekday
Then Will be selected on the alert

Scenario: Create alert without Weekday

And  I click on the icon on the botton
When Click on the Set Time
And  Select the hour and minute
And  Select the hour and minute of Duration
And  Will click on OK
And  Will click on Save
Then Will not create alert
And  Will show the Weekday message

Scenario: Create alert without Duration

And  I click on the icon on the botton
When Click on the Set Time
And  Select the hour and minute
And  Will click on OK
And  I select any Weekday
And  Will click on Save
Then Will not create alert
And  Will show the Duration message

Scenario: Salve alert sucessfuly

And I click on the icon on the botton
When Click on the Set Time
And  Select the hour and minute
And  Will click on OK
And  Click on the Set Duration
And  Select the hour and minute of Duration
And  Will click on OK
And  I select any Weekday
And  Will click on Save
Then Will create alert sucessfuly

