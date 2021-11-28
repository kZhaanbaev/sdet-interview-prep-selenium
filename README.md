
### 1. What is Automation Testing?
Automation testing or Test Automation is a process of automating the manual process to test the application/system under test. Automation testing involves the use of a separate testing tool which lets you create test scripts which can be executed repeatedly and doesn’t require any manual intervention.

### 2. What are the benefits of Automation Testing?
* Supports execution of repeated test cases
* Enables parallel execution
* Encourages unattended execution
* Improves accuracy thereby reducing human-generated errors
* Saves time and money

### 3. Why should Selenium be selected as a test tool?
* It's an open source tool and therefore free
* Have a large user base and helping communities
* Have cross Browser compatibility (Firefox, Chrome, Internet Explorer, Safari etc.)
* Have great platform compatibility (Windows, Mac OS, Linux etc.)
* Supports multiple programming languages (Java, C#, Ruby, Python, Pearl etc.)

### 4. What is Selenium? What are the different Selenium components?
Selenium is one of the most popular automated testing suites. Selenium is designed in a way to support and encourage automation testing of functional aspects of web-based applications and a wide range of browsers and platforms. Due to its existence in the open source community, it has become one of the most accepted tools amongst the testing professionals.
<br />
Selenium is not just a single tool or a utility, rather a package of several testing tools and for the same reason, it is referred to as a Suite. Each of these tools is designed to cater different testing and test environment requirements.
<br />
The suite package constitutes the following sets of tools:
* __Selenium Integrated Development Environment (IDE)__ – Selenium IDE is a record and playback tool. It is distributed as a Firefox Plugin.
* __Selenium Remote Control (RC)__ – Selenium RC is a server that allows a user to create test scripts in the desired programming language. It also allows executing test scripts within the large spectrum of browsers.
* __Selenium WebDriver__ – WebDriver is a different tool altogether that has various advantages over Selenium RC. WebDriver directly communicates with the web browser and uses its native compatibility to automate.
* __Selenium Grid__ – Selenium Grid is used to distribute your test execution on multiple platforms and environments concurrently.

### 5. When should I use Selenium Grid?
Selenium Grid can be used to execute same or different test scripts on multiple platforms and browsers concurrently so as to achieve distributed test execution, testing under different environments and saving execution time remarkably.

### 6. What are the testing types that can be supported by Selenium?
* functional test
* smoke test
* sanity test
* regression test

### 7. What are the limitations of Selenium testing? 
* Unavailability of reliable tech support: Since Selenium is an open-source tool, it does not have dedicated tech support to resolve the user queries. 
* Tests web applications only: Selenium needs to be integrated with third-party tools like Appium and TestNG to test desktop and mobile applications.
* Limited support for image testing.
* No built-in reporting and test management facility: Selenium has to be integrated with tools like TestNG, or JUnit among others to facilitate test reporting and management.
* May require the knowledge of programming languages: Selenium WebDriver expects the user to have some basic knowledge about programming. 

### 8. What is the same-origin policy and how is it handled?
Same Origin policy is a feature adopted for security purposes. According to this policy, a web browser allows scripts from one webpage to access the contents of another webpage provided both the pages have the same origin. The origin refers to a combination of the URL scheme, hostname, and port number.
<br />
The same Origin Policy prevents a malicious script on one page to access sensitive data on another webpage.
<br />
Consider a JavaScript program used by google.com. This test application can access all Google domain pages like google.com/login, google.com/mail, etc. However, it cannot access pages from other domains like yahoo.com
<br /><br />
Selenium RC was introduced to address this. The server acts as a client configured HTTP proxy and "tricks" the browser into believing that Selenium Core and the web application being tested come from the same origin.

### 9. Can Captcha be automated?
_Short answer is "No", but..._
<br />
The __CAPTCHA__, short for “Completely Automated Public Turing test to tell Computers and Humans Apart,” is a type of challenge-response test used in computing to determine whether or not the user is human. The main purpose of the CAPTCHA is to prevent bots or automated programs from using various types of computing services or collecting certain types of sensitive information. In other words, it is a security feature of the application which generally prevents bots from filling.
<br />
How to handle it? What are my options to test:
<br />
* Turn it off in Test environment
* Apply "wait" and input manually when test reaches that specific part when captcha is triggered.
* Apply image decoding using OCR (Optical Character Recognition).
<br />
  For that, you’ll need to write complex algorithms to sort out the image pattern – and one has to be an expert in image pattern mapping as well. But images, with the passage of time, have become progressively more unreadable, thereby reducing the chances of CAPTCHA automation.

### 10. What are the different types of locators in Selenium?
* ID
* ClassName
* Name
* TagName
* LinkText
* PartialLinkText
* Xpath
* CSS Selector

### 11. How do I launch the browser using WebDriver?**

### 12. What are the different types of navigation commands?**

### 13. Questions:
#### a. How to click on a hyperlink in Selenium?** 
#### b. What is the major difference between driver.close() and driver.quit()?**

### 14. Questions:
#### a. How can we get a text of a web element?***
#### b. How to assert the title of a webpage?***

### 15. How can you find if an element in displayed on the screen?***

### 16. What is an XPath?
The fundamental behind locating elements using XPath is the
traversing between various elements across the entire page and thus
enabling a user to find an element with the reference of another element.

### 17. What is the difference between “/” and “//” in Xpath?
__Single Slash “/”__ – Single slash is used to create Xpath with absolute path
i.e. the xpath would be created to start selection from the document node/start node.

__Double Slash “//”__ – Double slash is used to create Xpath with relative path
i.e. the xpath would be created to start selection from anywhere within the document.

### 18. When do we use findElement() and findElements()?**
__findElement()__: findElement() is used to find the first element in the current web page matching to the specified locator value. Take a note that only first matching element would be fetched.
<br />
__findElements()__: findElements() is used to find all the elements in the current web page matching to the specified locator value. Take a note that all the matching elements would be fetched and stored in the list of WebElements.

### 19. How to find more than one web element in the list? (class)

### 20. How to select value in a dropdown?***

### 21. What are the different types of waits available in WebDriver?***
* __Implicit Wait__: aka Global wait. Using this type of wait we can give certain amount or seconds to allow our action to match with reaction from the browser. This wait applies to all webElements.
* __Explicit Wait__: Explicit waits are used to halt the execution till the time a particular condition is met or the maximum time has elapsed. Unlike Implicit waits, explicit waits are applied for a particular instance only.
* __Fluent Wait__: Custom waits where we can modify each criteria based on our needs.

### 22. What is the difference between assert and verify commands?***
__Assert__: Assert command checks whether the given condition is true or false. Let’s say we assert whether the given element is present on the web page or not. If the condition is true then the program control will execute the next test step but if the condition is false, the execution would stop and no further test would be executed.

__Verify__: Verify command also checks whether the given condition is true or false. Irrespective of the condition being true or false, the program execution doesn’t halt i.e. any failure during verification would not stop the execution and all the test steps would be executed.

### 23. How does Selenium handle web-based pop-ups?***

### 24. How does Selenium handle Windows-based pop-ups?
Selenium was designed to handle web applications. Windows-based features are not natively supported by Selenium. However, third-party tools like AutoIT, Robot, etc can be integrated with Selenium to handle pop-ups and other Windows-based features. 

### 25. How to set browser window size in Selenium?***

### 26. How to handle iframe in WebDriver?***
An inline frame acronym as iframe is used to insert another document within the current HTML document or simply a web page into a web page by enabling nesting.
* by id
* by index
* by name attribute
* by webElement

### 27. How to scroll down a page using JavaScript?***
scrollBy() method is used to scroll down the webpage

### 28. How to mouse hover over a web element?***
Actions class utility is used to hover over a web element in Selenium WebDriver

### 29. Is there a way to type in a textbox without using sendKeys()
Yes! Text can be entered into a textbox using JavaScriptExecutor

### 30. How to login to any site if it is showing an Authentication Pop-Up for Username and Password?***

### 31. How to handle multipe windows?***