# Learn Spring AOP

This repository demonstrates the use of **Aspect-Oriented Programming (AOP)** in the Spring Framework. AOP allows for separating cross-cutting concerns like logging, security, transaction management, and more from the business logic, making the code cleaner and easier to maintain.

## Features

- Implementing **cross-cutting concerns** using AOP
- **@AspectJ** annotations for defining aspects
- Demonstrating **logging, security, and performance monitoring** as aspects
- Focus on modularizing concerns that affect multiple layers in a Spring application
- Code examples showcasing **before, after, and around** advice

## Technologies Used

- **Spring Framework**
- **Spring AOP** (Aspect-Oriented Programming)
- **Maven** for dependency management
- **Java 11** or higher

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven
- IDE (IntelliJ, Eclipse, etc.)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/ShrunalNimje/Learn-Spring-Aop.git
   
2. **Navigate to the project directory**
   
   ```bash
   cd Learn-Spring-Aop
   
3. **Build the project using Maven**
   
   ```bash
   mvn clean install
   
4. **Run the application**
   
   ```bash
   mvn spring-boot:run
   
### Usage

Once the application is running, the AOP aspects will automatically be applied to the methods specified in the configuration. You can test the functionality by calling the methods in the provided services or controllers.

## AOP Concept Demonstrated

- **Before Advice**: Executes before the method execution.
- **After Advice**: Executes after the method completes, regardless of its outcome.
- **Around Advice**: Surrounds the method execution and can control whether the method gets executed.
- **Pointcuts**: Define where the advice should be applied.
- **Join Points**: Specific points in the program where the advice can be applied.

## Acknowledgements

- [Spring Framework](https://spring.io/projects/spring-framework)
- [Spring AOP](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop)
- [Maven](https://maven.apache.org/)

## Contact

For any questions or feedback, please reach out to [Shrunal Nimje](https://github.com/ShrunalNimje).
