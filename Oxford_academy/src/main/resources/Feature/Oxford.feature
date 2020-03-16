@Oxford_website
Feature: Oxford_website

@tc01_File_download
Scenario:
download Csv.file from adaptation journal
	
	Given the user launched the chrome browser 
	When user opens the oxford website
	When click the journalAtoZ button
	Then click dispatch date button
	Then select a journal
	Then download the adaptation file
	And close the page

@tc02_Print_email_id
Scenario:
print the user mail id

Given user launch the chrome browser
When user opens oxford website
Then print the user email id

@tc03_Check_file
Scenario:
Check the downloaded file

Given user launch chrome browser
When user should open oxford website
Then checkFile
