# 🛍️Online Retail System — Full Stack Microservices Application

An enterprise-grade, full-stack online retail system built using Angular for the frontend, and a set of backend microservices developed with Node.js, connected via an API Gateway. This system is containerized using Docker and orchestrated using Docker Compose — designed for scalability, modularity, and production-readiness.

## 🚀 Features
### 🧑‍💼 User Functionality

#### User Registration & Login (JWT Auth)

Profile Management

Secure Checkout Process

🛒 Shopping Experience

Product Catalog with Search & Filter

Product Details Page

Add to Cart / Update Quantity / Remove

Checkout with Order Summary

📦 Orders & Payments

Order History & Order Details

Payment Gateway Integration (Mock or Real)

Real-time Order Confirmation

🧾 Admin Panel (Optional)

Product Management (CRUD)

Inventory Updates

Order Management Dashboard

🧱 Tech Stack
🎨 Frontend

Angular

Angular Routing, Services, Reactive Forms

SCSS / Material UI or TailwindCSS

🛠️ Backend Microservices

Node.js with Express.js or NestJS

RESTful APIs / gRPC (optional)

MongoDB & PostgreSQL

Redis (Optional – for caching)

JWT Authentication

Centralized API Gateway (Express.js or NestJS)

⚙️ DevOps & Tools

Docker & Docker Compose

NGINX (for frontend hosting)

RabbitMQ or Kafka (optional – async messaging)

GitHub Actions (optional – CI/CD)

Postman or Swagger for API documentation

📁 Folder Structure
online-retail-system/
│
├── frontend-angular/           → Angular Single Page Application
├── api-gateway/                → Central gateway routing to services
├── services/
│   ├── user-service/           → Auth & User Profile
│   ├── product-service/        → Product Catalog
│   ├── order-service/          → Cart & Orders
│   ├── payment-service/        → Payment Handling
│   └── inventory-service/      → Inventory Tracking
├── docker-compose.yml
└── README.md

🐳 Running Locally with Docker Compose
1. Clone the Repository
git clone https://github.com/your-username/online-retail-system.git
cd online-retail-system

2. Start All Services
docker-compose up --build

3. Access the App

Frontend: http://localhost:4200

API Gateway: http://localhost:8080

🔐 Authentication

JWT tokens stored in local storage

Protected routes via Angular route guards

Token validation in API Gateway before routing requests

📌 Status

✅ MVP Complete – Basic features implemented
🚧 In Progress – Admin Panel, Payments Integration
📦 Future – Kafka event-driven orders, CI/CD pipeline

🤝 Contributing

Fork the repo

Create a feature branch (git checkout -b feature/my-feature)

Commit your changes

Push to the branch (git push origin feature/my-feature)

Open a pull request

📄 License

MIT License
