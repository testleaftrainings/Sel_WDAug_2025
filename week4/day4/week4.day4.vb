10:00 to 11:00 ---> Sequential and parallel execution
11:00 to 11.30 ---> Breakout 
11.30to 12.30 ---> TestNG Annotations
12.30 to 1:00 ---> Breakout

Seq execution:
--------------
1)select the testcases--->right click--->testng---->convert to testng--->filename--->click on finish
2)open the xml file and execute it.
reports:
-------
1)after the execction--->right click the project--->refresh--->test-output--->open-->right click the index.html-->open with s/y editor.
Parallel execution:
------------------
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file


TestNG Annotations:

@Before sUITE--trigerred at the beginning of the project(once before all the tests are run)
 @Before test---set up the testlevel info
  @Before class---testcase details
   @BeforeMethod---preconditions
    @Test----testcase
   @AfterMethod---postcondns
 @Afterclass
@aFTER Test
@Aftersuite----end of the project