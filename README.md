# QA Automation Framework – Online Application Testing

This repository contains a scalable and maintainable test automation framework built using **Selenium WebDriver with Java** for UI testing and REST-assured for API testing. The framework follows the **Page Object Model (POM)** design pattern and includes utility classes, configuration management, and helper methods to support future test expansion.

---

## **Project Structure**

```
project-root/
│
├── pom.xml                    # Maven dependencies
├── README.md                   # Project documentation
│
├── src/main/java/
│   ├── config/
│   │   └── Config.java         # Configuration for URL, browser, timeouts
│   ├── pages/
│   │   ├── BasePage.java       # Generic reusable page actions
│   │   ├── ContactPage.java    # Page Object for Contact form
│   │   └── ProductPage.java    # Page Object for Product and Cart
│   └── utils/
│       └── Helper.java         # Utility/helper methods
│
└── src/test/java/
    ├── tests/
    │   ├── ContactFormTest.java # UI tests for Contact form
    │   └── CartTest.java        # UI tests for Cart functionality
    └── api/
        └── APITests.java        # API layer tests (if any)
```

---

## **Features**

1. **UI Testing**
   - Form submission validation
   - Add to cart and update quantity
   - Verification of validation and success messages

2. **Scalable Framework**
   - Page Object Model (POM) design
   - Configurable environment variables (URL, browser, etc.)
   - Helper classes for reusable code

3. **API Testing (Optional)**
   - Can be extended to test REST API endpoints

---

## **Prerequisites**

- Java JDK 11+
- Maven 3+
- IntelliJ IDEA or any IDE
- ChromeDriver (or other browser driver)

---

## **Setup & Running Tests**

1. **Clone the repository**

```bash
git clone https://github.com/yourusername/qa-automation-framework.git
cd qa-automation-framework
```

2. **Install dependencies**

```bash
mvn clean install
```

3. **Run tests**

```bash
# Run all tests
mvn test

# Or run a specific test class
mvn -Dtest=ContactFormTest test
```

---

## **Design Choices**

- **Page Object Model (POM):** Improves maintainability and reusability.
- **Helper/Utility Classes:** Encapsulates common actions like waits, random data generation, and input handling.
- **Config Management:** Centralizes environment settings (URL, browser type) for flexibility.
- **Scalability:** Framework can easily accommodate new UI pages or API endpoints.

---

## **Future Enhancements**

- Integrate **TestNG or JUnit** for advanced reporting.
- Add **Cross-browser support**.
- Implement **API testing with REST-assured** for backend verification.
- Add **CI/CD integration** using GitHub Actions or Jenkins.

---

## **Author**

**Your Name** – QA Automation Engineer  

[GitHub Profile](https://github.com/yourusername)

