10:00 - 11:00 -> TestNg Attributes
11:00 - 11:20 -> ExplicitWait
11:20 - 11:40 -> Breakout
11:40 - 11:50 ->BreakOut
11:50 - 12:15 -> ScreenShot
12:15 - 12:30  -> BreakOut
12:30-12:45 -->StaticKeyword
12:45-1:00 -->Breakout

TestNG Attributes:
priority

Definition: This attribute sets the priority level for the methods; lower numbers indicate higher priority.
Use case: Used when you want to control the order of test method execution.
Syntax: @Test(priority=2)
enabled

Definition: This attribute determines whether a test method is enabled or disabled.
Use case: Used to enable or disable a test method without removing its code.
Syntax: @Test(enabled=false)
invocationCount

Definition: This attribute indicates how many times a test method should be invoked.
Use case: Used when you want to execute a test method multiple times for the same data.
Syntax: @Test(invocationCount=10)
threadPoolSize

Definition: The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. NOTE: this attribute is ignored if invocationCount is not specified
Use case: Used when you want to perform parallel execution of methods with invocationCount.
Syntax: @Test(invocationCount=10,threadPoolSize=5)
invocationTimeOut

Definition: The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.
Use case: Used to limit the total time for repeated test method invocations.
Syntax: @Test(invocationTimeOut=10000)
dependsOnMethods

timeOut

Definition: The maximum number of milliseconds this test should take.
Use case: Used to fail a test if it takes longer than a specified amount of time.
Syntax: @Test(timeOut=3000)

Frequently asked Interview Questions on Attributes
If a TestNG class contains multiple test methods without any specified priority or dependencies, in what order would you expect these methods to execute?

In TestNG, if test methods within a class are assigned priorities, how does this affect their execution order?

Consider a TestNG class with a mix of test methods where some have a specified priority and others don't. Explain the order in which these methods will execute.

What happens in TestNG when two test methods have the same priority value? How does TestNG decide which method to run first?

If test methods have a combination of priority and dependsOnMethods attributes. Explain the execution order of these methods and the reason behind it.