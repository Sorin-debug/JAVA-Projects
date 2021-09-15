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
1. Configure the dependency injection with Autowired Annotation
 - Applied directly to the field
 - No need for setter methods
