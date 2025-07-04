# 🛍️ ProductServiceSample

A backend Spring Boot project that simulates an e-commerce product management system.
It supports multiple product services (like FakeStore API and internal service) and implements RESTful APIs for CRUD operations,along with additional practice modules for database
relationships and advanced JPA concepts.

---

## 🧰 Tech Stack

- **Java** (22 SDKs)
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **REST APIs**
- **Lombok**
- **Postman** (for API testing)

---

## 📦 Project Structure

- `Controller/` – Exposes REST endpoints
- `DTOs/` – For data transfer objects
- `Models/` – Represents database entities
- `Repositories/` – JPA repository interfaces
- `Services/`  
  - `ProductServiceImpl` – Local database-based implementation  
  - `FakeStoreProductService` – REST client implementation using [FakeStore API](https://fakestoreapi.com/)

These services are cleanly handled using Spring's `@Qualifier` annotation to switch between implementations where needed.

---

## 🚀 Features

- Add a product
- Get product by ID
- Get all products
- Update product by ID
- Delete product by ID
- Search product by name (LIKE query)
- Use of **DTOs** for data encapsulation
- Integration with **FakeStore API**
- Custom `@Qualifier` usage to switch between services
- Standard REST conventions

---

## 🔀 Dual Service Implementation

This project demonstrates working with two service implementations:

1. **`FakeStoreProductService`**  
   Connects with FakeStore's external REST API to fetch, add, and update product details.

2. **`ProductServiceImpl`**  
   Interacts with the local MySQL database using Spring Data JPA.

🔧 These are managed cleanly using Spring’s `@Qualifier`, allowing seamless switching and flexibility.

---

## 🧠 Learning & Practice Modules

This project includes additional sub-packages focused on learning and deepening backend understanding:

- 📚 **`inheritance_in_db/`** – JPA inheritance strategies (`@Inheritance`, `@DiscriminatorColumn`, etc.)
- 🔗 **`cardinalities/`** – Practice entity relationships like OneToOne, OneToMany, ManyToMany
- ⚙️ **`db_migration/`** – Understand how database schema can evolve with model changes
- 🌐 **FakeStore API Integration** – Demonstrates consumption of third-party REST APIs

These were added for **learning purposes** and represent practical understanding of backend software engineering.

---

## 🧪 API Testing

You can test all endpoints using Postman or cURL. Base URL (when run locally):

http://localhost:8081/


Example endpoints:

- `GET /products/1`
- `POST /products`
- `PUT /products/2`
- `DELETE /products/3`
- `GET /products/search?name=shirt`

---

## 🎯 Why This Project?

This project was built to strengthen backend fundamentals by combining:
- Real REST API consumption
- Local DB operations
- Clean architecture with service layers
- Practice with database design and migrations

## 🧑‍💻 Author

Made with 💻 by **Mohammad Aman**  
Backend Developer | Spring Boot Enthusiast | Open to learning  
[GitHub Profile »](https://github.com/MohammadAman-Github)

---
