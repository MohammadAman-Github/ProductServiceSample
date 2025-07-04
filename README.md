# 🛍️ ProductServiceSample

A backend Spring Boot project that simulates an e-commerce product management system.
It supports multiple product services (like FakeStore API and internal service) and implements RESTful APIs for CRUD operations,along with additional practice modules for database
relationships and advanced JPA concepts.

---

## 🧰 Tech Stack

- **Java** (22)
- **Spring Boot**, **Spring Web**, **Spring Data JPA**
- **MySQL** for local persistence
- **FakeStore API** integration (external REST)
- **DTOs → Models → Services → Controllers** structure
- **Lombok** for boilerplate reduction
- **RestTemplate** for inter-service API calls
- **Maven** for build/dependency management

---

## 📦 Project Structure

src/main/java/com.demo.productservicesample/
├── Controllers – Exposes REST endpoints
├── DTOs – For data transfer objects
├── Models – Represents database entities
├── Repositories – JPA repository interfaces
├── Services
{These services are cleanly handled using Spring's `@Qualifier` annotation to switch between implementations where needed.}
│ ├── FakeStoreProductService.java – REST client implementation using [FakeStore API](https://fakestoreapi.com/)
│ └── ProductServiceImpl.java - Local database-based implementation 
└── practice/
├── inheritance_in_db/
├── cardinalities/
└── db_migration/

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
   - Uses `RestTemplate` to fetch, add, update products via FakeStore ([fakestoreapi.com](https://fakestoreapi.com/))
   - Ideal for rapid prototyping or external API demo
  
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

🧪 API Endpoints
You can test all endpoints using Postman or cURL. Base URL (when run locally):
http://localhost:8081/

Method	   URL	                          Description
POST	   /products	                   Create a new product
GET	     /products	                   List all products
GET	     /products/{id}	               Get product by ID
PUT	     /products/{id}	               Update product by ID
DELETE	 /products/{id}	               Delete product by ID
GET	     /products/search?name=xxx	   Search products whose name contains xxx

---

## 🎯 Why This Project?

This project was built to strengthen backend fundamentals by combining:

- Learning REST and microservice concepts
- Exploring layered architecture in Spring Boot
- Understanding multiple service implementations via @Qualifier
- Practicing JPA with inheritance, migrations, and relationships
- Building an e-commerce backend that consumes external APIs


## 🧑‍💻 Author

Made with 💻 by **Mohammad Aman**  
Backend Developer | Spring Boot Enthusiast | Open to learning  
[GitHub Profile »](https://github.com/MohammadAman-Github)

---
