# Banking App

## Overview
This is a Quarkus-based banking application that allows users to perform banking operations such as checking balance, depositing, and withdrawing funds.

## Project Structure
```
banking-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── bank
│   │   │           ├── controller
│   │   │           │   └── BankingController.java
│   │   │           ├── model
│   │   │           │   └── BankAccount.java
│   │   │           ├── service
│   │   │           │   └── BankingService.java
│   │   │           └── dto
│   │   │               └── TransactionDTO.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── META-INF
│   │           └── resources
│   │               └── index.html
│   └── test
│       └── java
│           └── com
│               └── bank
│                   └── BankingControllerTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd banking-app
   ```

2. **Build the project**:
   ```bash
   ./mvnw clean package
   ```

3. **Run the application**:
   ```bash
   ./mvnw quarkus:dev
   ```

## Usage
- Access the banking operations through the provided endpoints in the `BankingController`.
- The main HTML interface can be accessed at `http://localhost:8080`.

## Testing
- Unit tests for the `BankingController` can be found in the `BankingControllerTest.java` file.
- Run tests using:
   ```bash
   ./mvnw test
   ```

## Dependencies
This project uses Maven for dependency management. The required dependencies are specified in the `pom.xml` file.

## License
This project is licensed under the MIT License.
