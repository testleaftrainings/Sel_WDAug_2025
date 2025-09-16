>10:00 -  10:45 -> Extent Reports
> 10:45 - 11:15 -> Breakout+Break
> 11:15 - 12:30 -> ExcelIntegration
> 12:30 - 1:00 -> BreakOut

Annotations
@BeforeSuite---->start reports()
 @BeforeTest--->setvalues()
  @BeforeClass-->testcaseDetails()
   @dataProvider--->sets of data to the testcase
    @BeforeMethod--->precondns
     @Test---->testcase
    @AfterMethod--->postcondns
  @AfterClass
 @AfterTest
@AfterSuite--->stop reports