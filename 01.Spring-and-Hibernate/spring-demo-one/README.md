# Spring Demo One 

#### Inversion of Control (IoC)

## Outsource to an object factory
- The approach of outsourcing the construction and management of objects.

## Spring Container

#### Primary functions:
1. Create and manage objects **(Inversion of Control)**
2. Inject object's dependencies **(Dependency Injection)**

#### Configuring Spring Container

- XML configuration file
- Java annotations 
- Java Source Code

#### Spring Development Process

1. Configure Spring Beans
	- file applicationContext.xml

2. Create a Spring Container
	- Spring container is known as **ApplicationContext**
		- Specialized implementations: 
		-> ClassPathXmlApplicationContext.
		-> AnnotationConfigApplicationContext.
		-> GenericWebApplicationContext.

3. Retrieve Beans from Spring Container
	- retrieve bean.

