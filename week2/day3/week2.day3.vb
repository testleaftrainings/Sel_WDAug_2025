10:00 to 10:30---> launch browser
10:30 to 10:45 ---> Breakout
10:45 to 11:45 ---> Locators
11:45 to 12:15 ---> Breakout+Break
12:15 to 1:00 --->Dropdown

The HTML structure is composed of various tags like <html>, <a>, <button>, <div>, <iframe>, <img>, <input>, <option>, <select>, <span>, and <table>.
Each tag has a specific purpose, such as defining hyperlinks, sections in a document, or input fields. Knowing these tags helps in identifying elements for Selenium to interact with.
To Locate Element in DOM

Different locators such as id, name, className, linkText, partialLinkText, xpath are used to find elements in the DOM.
Each locator has a specific use case, for example, id is used when the element has a unique identifier, while xpath are used when elements are dynamic or duplicate name, class, or ID.
How to Use Locators?

Locators are used with the Syntax:
`driver.findElement(By.locator("value"))` 
For instance, By.id("login") would locate an element with the ID of 'login'.

When to/Not to Use Locators

Guidelines are provided on when to use specific locators.
For example, id should be used when it's available,
name if id does not exist,
linkText for links,
className when the class attribute is unique,
tagName for collections,
xpath if no other locator works.