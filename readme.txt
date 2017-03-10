# Triangle Challenge

This is a Triangle challenge implementation developed as a step in the interview process for TradeShift.

## ** Problem to be solved: **

Write a program that will determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

## ** Considerations to be taken into account: **

* Shall have a good testing set
* Code readability/maintainability will be checked.
* The code should be easy to escalate into a ore complex domain 

## ** Assumptions: **
* The input will be received from the command line, however it shall be easy to use from other inputs (swing, rest, externall calls)
* The application run as a stand alone call

## ** Design explanation: **

1. The test has been implemented using TDD, therefore most of the actual "business" code is tested

2. There are two big points to be taken into account in the proposed solution:

	2.1 First, the shape classes are extending from a "Shape" interface, this allows for flexibility and scalability if new shapes are needed (I have implemented the quadrilateral shape for example).
	2.2 Second, the shapes are being obtained by using a factory method, this will allow the input to be centralized and flexible given that we aim to return a interface implementation and not a specific object.
	
3. Potential for improvement:
	
	Given the time and scope constraints (is a test!) there are some extra features that could be implemented but will not, for example: 
	
	3.1 We could have a predefined "polygon shape" to process invalid requests
	3.2 We could use AOP in order to log the process
	3.3 This could be easily turn into a rest API (using spring boot for example) allowing for standard web usage
	3.4 There are plenty of specific behaviors that could be easily implemented adding them into the interface and/or making the interface into an abstract class so that we have predefined outputs for some of them.

4. Usage:

	Run the program from the main class (com.tradeshift.shapechallenge.main.Main) and it will ask you to enter the sides of the shape in the console.

5. Technologies used:

	* Java
	* JUnit
	* Maven
	
	
### ** Developer: **
Edgar Fabian Garcia Hernandez
edguitar000@gmail.com