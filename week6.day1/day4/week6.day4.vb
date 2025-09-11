
>10:00 -  11:00 ->POM Introduction
> 11:00 - 11:30 -> Sequential execution
> 11:30 - 12:00 -> BreakOut+Break
> 12:00 - 12:30 -> Parallel execution
> 12:30 - 1:00  ->Breakout


Page object model:

LoginPage--->class
 -enter username
 -enter password
 -login
Welcomepage
 -click crmsfa
Homepage
 -click on leads
MyLeadsPage
 -click on createLead
createLead
 -entercName
 -enterfName
 -EnterLname
 -click on createLead
ViewLeads
-verify the leads


Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
For Sequential Execution:
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file