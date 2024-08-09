# 🛒 E-Commerce Java React App

This is a web application project for e-commerce that includes a frontend developed in React and a backend in Spring Boot. The goal of this application is to provide a simple interface that allows users to search for products, add them to the cart, proceed to checkout, and manage their account.

## 🗂️ Project Structure

The project is organized as follows:

- **client/**: Contains the source code for the React frontend.
  - **src/**: Main source code for the frontend.
    - **features/**: Main modules of the application such as `account`, `basket`, `catalog`, `checkout`, etc.
- **javareact/**: Contains the source code for the Spring Boot backend.
  - **src/main/java/com/ecommerce/**: Main source code for the backend.
    - **controller/**: REST controllers to handle HTTP requests.
    - **entity/**: JPA entities representing the database tables.
    - **repository/**: Repositories for data access.
    - **service/**: Business services containing the application logic.
- **docker/**: Currently contains docker compose for mysql and redis services.

## 🚀 Project Initialization

To initialize the project, follow these steps:

1. **Backend (Spring Boot):**
   - Navigate to the `javareact` folder and run the following command to start the Spring Boot server:
     ```bash
     mvn spring-boot:run
     ```

2. **Frontend (React):**
   - Navigate to the `client` folder and run the following command to start the React development server:
     ```bash
     npm run dev
     ```

3. **Docker Compose (Under Development):**
   - Navigate to the `docker` folder and run the following command to bring up the services using Docker Compose:
     ```bash
     docker-compose up
     ```
   - *Note: The main Docker Compose file is pending implementation.*

## 🔑 Login Credentials

Currently, the registration function is not implemented, so you can log in using the following credentials:

- **Username:** `Miguel`
- **Password:** `Password`

## 🛠️ Environment Requirements

To run the project correctly, ensure you have the following versions installed in your development environment:

- **Node.js:** `20.15.1`
- **JDK:** `21.0.4`
- **Maven:** `3.8.7`

## 🚧 Future Work

- Implementation of the user registration feature.
- Complete configuration of the `docker-compose.yml` file.
- Continuous integration and automatic deployment.

---

Enjoy developing and improving this project! 😊
