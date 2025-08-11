Today's Agenda:

10:00 to 11:00---> Methods and Objects
11:00 to 11:30 ---> Breakout & Break
11:30 to 12:30 ---> Strings
12:30 to 12:45 ---> Breakout  
12:45 to 1.00   ---> Recap
Methods:
Definition: A method in Java is a set of instructions or a block of code encapsulated within a named unit. It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. They are defined by the method's signature, which includes its name, parameters, and return type.
Explanation: Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.
Objects:
Definition: In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.
Explanation
Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.
Arrays:
Definition: An array in Java is a data structure that stores a fixed-size, ordered collection of elements of the same data type. Arrays provide a convenient way to group related data items under a single name. The elements in an array are accessed using an index, starting from 0. Arrays are useful for efficiently managing and manipulating large sets of data.

method:

Access specifier

Return type

methodName

Input arguments

String Creation in Java
String Literal:

When you create a string using string literals (e.g., String name = "TestLeaf";), Java stores it in the String Pool, a special area in the Java heap memory.
If another string with the same value is declared (e.g., String name2 = "TestLeaf";), Java reuses the string from the pool instead of creating a new object.
This is efficient in terms of memory.
String Instantiation (with new keyword):

When strings are created using the new keyword (e.g., String str = new String("TestLeaf");), a new object is created in the heap memory outside the String Pool.
This means even if two strings have identical values, they will be different objects in memory (e.g., str and str2).
String Comparison in Java
Using == Operator:

The == operator checks for reference equality, meaning it checks whether two references point to the same object in memory.
For example, name == str checks if the string literal and the string object created with new refer to the same memory location, which they do not, hence it prints "Both are not equal".
Using equals Method:

The equals method checks for value equality, meaning it compares the contents of the strings.
For example, str and str2 are different objects, str.equals(str2) returns true because their contents are the same. Thus, it prints "Both are equal".
Using equalsIgnoreCase Method:

This method compares two strings, ignoring case differences.
In the example, name.equalsIgnoreCase(name2) returns true because it ignores the case of the characters. Thus, it prints "Cases ignored and both are equal", assuming name2 is intended to be "TestLeaf" for case difference demonstration.
Notes on Java String Behavior
Immutability: Strings in Java are immutable. Once created, their values cannot be changed. Any modification results in a new string.
Efficiency: Using string literals is often more memory-efficient due to the String Pool mechanism.
Case Sensitivity: By default, string comparison in Java is case-sensitive. Use equalsIgnoreCase for case-insensitive comparisons.