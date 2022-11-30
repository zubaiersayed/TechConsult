# Welcome to SasBookingSystem!

This project is a simple web project about a norwegian flight company called Sas and their booking system (my version). The main reason I created this project was to dig deeper into the basics of **Spring Boot, JUnit5, SQL and Log4j**. I might also add other topics into this project as I continue to develop it, and one of my goals is to involve the cloud, spesifically **Microsoft Azure** somehow.

### **Steps to run the project**

Before following the steps below you need Maven installed. You can follow [this](https://maven.apache.org/install.html) guide.

 1. Clone the project 
 2. Open the project in your favorite IDEA
 3. Run the following commands:
	> mvn clean install
	
	> mvn spring-boot:run

## Project structure

The main source code is in the src folder. I have added three folders inside the no/sas/ folder which includes controller, models and service. The pom.xml file in the main folder includes all the dependencies for the project.

- Controller: 
	 - Contains the request mapping for different pages
- Models:
	- Models contain the basic Java objects that will be used in the project
- Service:
	- Service includes the business logic of the application

## Things that will be added later
- Junit5 tests
- CI/CD pipeline
- Simple frontend page based on HTML and CSS


### Project details ###
- **Language**: Java 17 (soon to come: HTML, CSS and Javascript)
- **Programming approach**: OOP and functional programmering with Streams api
- **Framework**: Spring boot
- **Build tool**: Maven
- **Topics to be covered**: Azure, CI/CD pipelines, Junit5, Security & Authentication, SQL
