Feature: Access Wi-fi

Background:

Given I open the App

#@ScanWI-FI
#Scenario: Scan connection wi-fi
#
#When Click on Scan
#Then Will be able to find wi-fi connection

@connectionWithWI-FI
Scenario: Connect to Wi-fi Atmosphere component

When I click on the Atmosphere Wi-fi
Then I will be start to have conection with the component

