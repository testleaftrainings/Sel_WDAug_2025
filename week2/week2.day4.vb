10:00 to 10:30---> Dropdown
10:30 to 10:50 ---> Breakout
10:45 to 11:45 ---> Absolute & Basic Xpath
11:45 to 12:10 ---> Breakout+Break
12:10to 1:00 --->Advanced xpath

a.Basic xpath

Attribute based xPath: Syntax: //tagname[@attributename='attributeValue'] Example:  //input[@id='password'] //input[@id='twotabsearchtextbox']

Text based xPath: Syntax: //tagname[text()='textvalue'] Example:  //a[text()='Leads'] //span[text()='Hello, sign in']

Partial Attribute based xpath: Syntax: //tagname[contains(@attributename,'partialattributevalue')] Example: //input[contains(@class,'decorative')] //input[contains(@id,'twotab')]

Partial Text based xpath:
Syntax: //tagname[contains(text(),'partialtextvalue')]  Example: //a[contains(text(),'SFA')]
//span[contains(text(),'Hello')]

Index based xpath: Syntax: (//tagname[@attributename='attributeValue'])[2]
(//tagname[text()='textvalue'])[3] Example: (//a[contains(text(),'Lead')])[3] 

b.Advanced xPath(Axes based xPath)

Parent to Child: Syntax: BasicRelativeXpathforParent/childTagname Example: (//form[@id='login']/p)[2] 

Child to Parent: Syntax:  BasicRelativeXpathforChild/parent::parenttagname Example:  //label[text()='Password']/parent::p //p[@class='top']/parent::form

GrandParent to GrandChild: Syntax: BasicRelativeXpathforGrandParent//grandchildTagname Example: (//form[@id='login']//input)[3] 

GrandChild to GrandParent: Syntax:  BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname
Example: //input[@class='decorativeSubmit']/ancestor::form
