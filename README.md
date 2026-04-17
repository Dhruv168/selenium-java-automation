This Automation project follows Selenium WebDriver with Java with TestNG and Maven. 
Page Object Model (POM) strategy is used as design pattern where we have separate the locator identification and testing logic.

To Run the tests:
1. Navigate to project folder
2. Open cmd and run: mvn clean test

Project Automation Architecture:
Here, POM design pattern is used.
1. Test package: It contains the test classes.
2. Page package: It contains the page classes where locators and their actions methods are defined.
3. POM.xml: All the project related depenedencies are defined here.