This repository contains a scalable and maintainable test automation framework built using **Playwright with Java**, **Maven**, and **TestNG** for UI testing. The framework follows the **Page Object Model (POM)** design pattern and includes configuration files, helper utilities, and reusable methods to support future test expansion.

---

## **Project Structure**

```
project-root/
│
├── pom.xml                    # Maven dependencies including Playwright and TestNG
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
    │   ├── ContactTest.java # UI tests for Contact form
    │   └── CartTest.java        # UI tests for Cart functionality
    └── api/
        └── APITests.java        # API layer tests (if any)
```

---

## **Features**

1. **UI Testing with Playwright**
   - Form submission validation
   - Add to cart and update quantity
   - Verification of validation and success messages

2. **Scalable Framework**
   - Page Object Model (POM) design
   - Configurable environment variables (URL, browser, etc.)
   - Helper classes for reusable code

3. **TestNG Integration**
   - Parallel execution
   - Test grouping and prioritization

4. **API Testing (Optional)**
   - Can be extended to test REST API endpoints

---

## **Prerequisites**

- Java JDK 11+
- Maven 3+
- IntelliJ IDEA or any IDE
- Playwright installed via Maven dependencies
- Browser binaries managed by Playwright (automatic download)

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

3. **Run tests using TestNG**

```bash
# Run all tests
mvn test

# Or run a specific test class
mvn -Dtest=ContactFormTest test
```

---

## **Design Choices**

- **Page Object Model (POM):** Improves maintainability and reusability.
- **Helper/Utility Classes:** Encapsulates common actions like waits, input handling, and random data generation.
- **Config Management:** Centralizes environment settings (URL, browser type) for flexibility.
- **Scalability:** Framework can easily accommodate new UI pages or API endpoints.

---

## **Future Enhancements**

- Cross-browser testing using Playwright capabilities.
- Advanced reporting using TestNG listeners or Allure Reports.
- Integration with CI/CD pipelines like GitHub Actions or Jenkins.
- API testing with REST-assured or Playwright API testing capabilities.

---

## **Author**

Md Zabed

[GitHub Profile](https://github.com/Zaved101)

