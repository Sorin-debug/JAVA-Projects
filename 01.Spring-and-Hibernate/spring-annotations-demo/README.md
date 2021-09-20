# Spring Annotations Demo 

#### Example:

Coach interface provides the method dailyworkout.
After will provide also the method dailyfortunes.
The dependency -> New Helper: Fortune Service.

For dependency injection, we will use Spring with auto wiring.
Spring will look for a class that matches the property (class or interface).

## Autowiring example:
1. Injecting FortuneService into a Coach implementation.
2. Spring will scan @Components.
3. If true, will inject. Our example: HappyFortuneService class.

## Spring Injection Types.

#### A. Development Process - Constructor Injection
1. Define the dependency interface and class
2. Create a constructor in the class for injections
3. Configure the dependency injection with @Autowired Annotation.

#### B. Development Process - Setter methods(s) Injection
1. Create the setter method(s) in class for injections
2. Configure the dependency injection with @Autowired Annotation.


#### C. Development Process - Field Injection
 Configure the dependency injection with Autowired Annotation
 - Applied directly to the field
 - No need for setter methods

## Annotation Autowiring and Qualifiers

#### @Qualifier - Can apply to:
1. Constructor injection.
2. Setter injection methods.
3. Field injection.

**Used for specific in multiple implementations.**
Example: @Qualifier("randomFortuneService")

## Bean Scope - Added AnnotationBeanScopeDemoApp.java

- Creating theCoach and alphaCoach, testing for memory location.
	* default type is Singleton.
- Adding @Scope("prototype") in tennisCoach
	* each object will have own memory location.
	* prototype create a new instance every time.

## @PostConstruct and @PreDestroy Method Signatures

#### Development Process 
1. Define methods for init and destroy.
2. Add annotations: @PostConstruct and @PreDestroy.


## Spring Configuration with Java Code (no xml)

#### Development Process
1.	Create a Java class and annotate as **@Configuration**
2.	Add component scanning support : **@ComponentScan** (optional)
3.	Read Spring Java configuration class.
4.	Retrieve bean from Spring Container


## Defining Beans in spring with Java code

#### Development Process
1. Define method to expose bean.
2. Inject bean dependencies.
3. Read Spring Java configuration class.
4. Retrieve bean from Spring container.

## Injecting Values from Properties File 
 - @PropertySource("Classpath:sport.properties")

#### Development Process
1. Create Properties File.
2. Load Properties file in Spring config.
3. Reference values from Properties File.




