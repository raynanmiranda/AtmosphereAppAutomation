Feature: Access Wi-fi

Background:

Given I open the App
And Access the menu 'Alert'

#Scenario: Scan connection wi-fi
#
#When Click on Scan
#Then Will be able to find wi-fi connection
#
#
#Scenario Outline: Try to use right menu without wi-fi connected
#
#When I Click on right menu
#And click on <menu>
#Then Will not change
#
#Examples:
#
#|menu	  	   |
#|Add Alerts	   |
#|Remove Alerts  |
#|Update Alerts  |
#|Reset		   |
#|Get Alert	   |
#|Set Time	   |
#|Get Time	   |
#|Change Password|

Scenario: Connect to Wi-fi Atmosphere component

When I click on the Atmosphere Wi-fi
Then I will be start to have conection with the component

