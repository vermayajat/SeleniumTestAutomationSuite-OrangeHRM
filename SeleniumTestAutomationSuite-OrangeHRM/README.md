


# **Selenium Test Automation Suite - OrangeHRM**

## Overview

This project is a **Test Automation Suite** designed to validate the key functionalities of the **OrangeHRM** application using **Selenium WebDriver** and **TestNG**. The automation suite covers critical operations such as login, employee management (add, search, delete), and logout, ensuring the platform's stability and reliability.

By automating these processes, this project reduces the manual testing effort and accelerates the feedback loop for detecting issues, ultimately improving the quality of the OrangeHRM system.

## Table of Contents

1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Project Setup](#project-setup)
4. [Test Execution](#test-execution)
5. [Test Report](#test-report)
6. [Project Structure](#project-structure)
7. [Future Improvements](#future-improvements)
8. [License](#license)

## Features

- **Login Automation**: Verifies the login functionality with valid credentials.
- **Employee Management**: Automates the process of adding, searching, and deleting employees.
- **Logout Automation**: Validates the logout functionality of the application.
- **Page Object Model**: Organized and maintainable code structure for easy scalability.
- **Data-Driven Testing**: Allows for reusability and efficient test execution with different sets of data.
- **Error Handling and Logging**: Provides robust error handling with logs for debugging purposes.

## Technologies Used

- **Selenium WebDriver**: Automates browser interactions for UI testing.
- **TestNG**: Framework for managing test execution and reporting.
- **Java**: Programming language used for writing the test scripts.
- **Maven**: Project management tool for handling dependencies.
- **Eclipse IDE**: Development environment for writing and executing tests.
- **Git**: Version control system for code collaboration and tracking changes.
- **ChromeDriver**: WebDriver implementation for automating Google Chrome.

## Project Setup

### Prerequisites

Before setting up this project, ensure you have the following installed:

1. **Java Development Kit (JDK)** version 8 or above
2. **Maven** (for managing dependencies)
3. **Eclipse IDE** (or any other IDE of your choice)
4. **Google Chrome** browser
5. **ChromeDriver** corresponding to your Chrome version

### Clone the Repository

```bash
git clone https://github.com/Aryaman2063/SeleniumTestAutomationSuite.git
```

### Install Dependencies

Navigate to the project folder and install the required dependencies using Maven:

```bash
mvn clean install
```

This will download all the necessary libraries and set up the environment.

## Test Execution

### Running the Tests

1. Open **Eclipse IDE**.
2. Import the project by selecting **File > Import > Existing Maven Projects** and choosing the project folder.
3. Right-click on the project folder and select **Run As > TestNG Test** to execute the automated test cases.

Alternatively, you can run the tests from the terminal using Maven:

```bash
mvn test
```

This will run all the tests defined in the `TestNG` suite.

### Test Reports

Once the tests are executed, you can find detailed test execution results in the `target/test-classes` folder in the project directory.

You can also integrate **Allure** or **ExtentReports** for more sophisticated reporting.

## Project Structure

The project is organized into the following structure:

```
/SeleniumTestAutomationSuite
|-- /src
|   |-- /main
|   |   |-- /java
|   |       |-- /base       # Contains BaseTest class for initialization
|   |       |-- /pages      # Contains Page Object Model classes (LoginPage, PIMPage, etc.)
|   |-- /test
|   |   |-- /java
|   |       |-- /tests      # Contains test classes (OrangeHRMTest)
|
|-- /target                # Contains compiled files, test reports
|-- /pom.xml               # Maven configuration file
|-- /README.md             # Project documentation
```

- **BaseTest**: Contains common setup and teardown logic.
- **Pages**: Contains individual classes representing different pages of the application (e.g., `LoginPage`, `DashboardPage`).
- **Tests**: Contains the actual test scripts that implement the test cases.

## Future Improvements

- **Parallel Test Execution**: Implement parallel test execution using TestNG's `@Test` annotation to speed up the testing process.
- **Cross-Browser Testing**: Extend the automation suite to support multiple browsers (Firefox, Safari, etc.) by using WebDriverManager for driver management.
- **Integration with CI/CD**: Integrate the test automation suite with a Continuous Integration/Continuous Deployment (CI/CD) pipeline (e.g., Jenkins, GitHub Actions).
- **Extended Coverage**: Add more test cases for advanced features like leave management, time management, and user roles.

## License

This project is open-source and available under the [MIT License](LICENSE).

---



```md
![Build Status](https://img.shields.io/travis/Aryaman2063/SeleniumTestAutomationSuite.svg)
![License](https://img.shields.io/github/license/Aryaman2063/SeleniumTestAutomationSuite.svg)
```

---

