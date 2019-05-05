Feature: hello world tests

# Gherkin is the syntax feature files are written in.  It has the traditional Given/When/Then
Scenario: Home page
  When I go to the Hello World homepage
  Then "Hello!" should be displayed

# Fill this in. Note that when you go to your web site, clicking the hello button will give you some json as a response
Scenario: Using the link on the page
  Given I am on the Hello World homepage
  When I click the link with id "helloLink"
  Then The JSON returned has the message "Hello World"

# Fill this in, or the prior one. Note that when you go to your web site, clicking the hello button will send the browser to http://localhost:8080/hello
Scenario: Link navigates to hello subpage
  Given I am on the Hello World homepage
  When I click the link with id "helloLink"
  Then I am taken to the hello subpage