# library-management-bookstore-spring-boot-security-validation-logging
Secure and efficient MVC app using Spring framework, integrating security, validation, and logging features. Implements CRUD operations with admin-exclusive entity management, user registration/login, and Spring Security for authentication and authorization.


This project is a simple MVC application created using the Spring framework. It includes the implementation of security, validation, and logging features in the framework of IntelliJ IDEA.

### **Functionality:** 

The application is designed to perform CRUD (Create, Read, Update, Delete) operations on a single entity using DTO pattern. The entity can be managed only by the ADMIN users. Any user can view the records, but only ADMIN users can create, delete, and update them. The project also includes a sign-up page for user registration and a login page for user authentication.

### **Prerequisites:** 

To run this application, you need to have the following prerequisites installed on your system:

Java 8 or higher
IntelliJ IDEA
Maven
MySQL (or any other database of your choice)

### **Installation:**

#### **To install and run the application, follow these steps:**

Clone the project from the GitHub repository: git clone https://github.com/SITE-ADA/as2-spring-security-and-validation-fahminmahili.git.
Open the project in IntelliJ IDEA.
Configure the database settings in src/main/resources/application.properties file.
Run the following Maven command to install dependencies and build the application: mvn clean install.
Run the application using the mvn spring-boot:run command.

### **Usage:**

Once the application is up and running, you can access it using the URL http://localhost:8080. The home page provides necessary links to navigate through the application.

To access the CRUD operations, click on the corresponding links provided on the home page. Only ADMIN users can perform create, delete, and update operations on the entity.

To register as a new user, click on the Sign-up link on the home page. You can then use the registered credentials to login on the Login page.

### **Logging:**

The application includes logging functionality to display info, warning, and error messages in the controller actions. Different logging levels have been used for each controller.

### **Security:**

The application uses Spring Security to provide authentication and authorization. Two default users are created during the application startup - one with the ADMIN role and another with the USER role. Only ADMIN users can perform create, delete, and update operations on the entity, while any user can view the records. A logout mechanism is provided on any existing page.

### **Conclusion:**

This Spring Boot MVC application with security, validation, and logging features provides a basic template for creating more complex applications. By using this project as a starting point, you can easily build and customize your own applications.


