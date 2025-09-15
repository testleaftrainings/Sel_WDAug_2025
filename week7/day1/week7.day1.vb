>10:00 -  10:45 -> POM-Cucumber 
> 10:45 - 11:15 -> Breakout+Break
> 11:15 - 12:00 -> Pom-ThreadLocal
> 12:00 - 12:30 -> BreakOut
> 12:30 - 1:00  ->Pom-ExcelIntegration

POM with Cucumber:
For TestNG _POM : - with driver as static -> sequential execution is possible - To have sequential and parallel execution declare Parameterized Constructor in each pages
For Cucumber_POM: - Constructor should not be defined - With driver as static -> sequential execution is possible

private-accessed only with in the class
static-belong to class and not to any instance and it ensures on copy for each of the class.
final-once the ocject is initialized,it cannot change it.

Java class which is used to access each thread independently private static final ThreadLocal chDriver = new ThreadLocal();
private: - This variable can be accessed only within the class static+final - constant -> cannot change the value.