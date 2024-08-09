# 🛒 E-Commerce Java React App

Este es un proyecto de aplicación web de comercio electrónico que incluye un frontend desarrollado en React y un backend en Spring Boot. El objetivo de esta aplicación es ofrecer una interfaz sencilla que permite a los usuarios buscar productos, añadirlos al carrito, realizar el checkout y gestionar su cuenta.

## 🗂️ Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

- **client/**: Contiene el código fuente del frontend en React.
  - **src/**: Código fuente principal del frontend.
    - **features/**: Módulos principales de la aplicación como `account`, `basket`, `catalog`, `checkout`, etc.
- **javareact/**: Contiene el código fuente del backend en Spring Boot.
  - **src/main/java/com/ecommerce/**: Código fuente principal del backend.
    - **controller/**: Controladores REST para manejar las solicitudes HTTP.
    - **entity/**: Entidades JPA que representan las tablas de la base de datos.
    - **repository/**: Repositorios para el acceso a datos.
    - **service/**: Servicios de negocio que contienen la lógica de la aplicación.
- **docker/**: Contendrá en el futuro los archivos de configuración para Docker Compose.

## 🚀 Inicialización del Proyecto

Para inicializar el proyecto, sigue los pasos a continuación:

1. **Backend (Spring Boot):**
   - Navega a la carpeta `javareact` y ejecuta el siguiente comando para iniciar el servidor Spring Boot:
     ```bash
     mvn spring-boot:run
     ```

2. **Frontend (React):**
   - Navega a la carpeta `client` y ejecuta el siguiente comando para iniciar el servidor de desarrollo de React:
     ```bash
     npm run dev
     ```

3. **Docker Compose (En desarrollo):**
   - Navega a la carpeta `docker` y ejecuta el siguiente comando para levantar los servicios utilizando Docker Compose:
     ```bash
     docker-compose up
     ```
   - *Nota: El archivo principal de Docker Compose está pendiente de implementación.*

## 🔑 Credenciales de Inicio de Sesión

Actualmente, la función de registro no está implementada, por lo que puedes iniciar sesión utilizando las siguientes credenciales:

- **Username:** `Miguel`
- **Password:** `Password`

## 🛠️ Requisitos de Entorno

Para ejecutar el proyecto correctamente, asegúrate de tener las siguientes versiones instaladas en tu entorno de desarrollo:

- **Node.js:** `20.15.1`
- **JDK:** `21.0.4`
- **Maven:** `3.8.7`

## 🚧 Trabajo Futuro

- Implementación de la función de registro de usuarios.
- Configuración completa del archivo `docker-compose.yml`.
- Integración continua y despliegue automático.

---

¡Disfruta desarrollando y mejorando este proyecto! 😊
