# Microservices-project

A complete hands-on **Spring Boot Microservices Practice Repository** covering distributed systems fundamentals including API Gateway, Service Discovery, Load Balancing, Centralized Configuration, Circuit Breaker, Messaging Queues, Kafka, Security (JWT + Spring Security), Monitoring & Distributed Tracing, Reactive Programming, and ELK stack.

This repository contains multiple mini-projects demonstrating real-world microservices architecture from communication to security to observability.

---

## 🎯 Objective

To gain deep practical knowledge of **Cloud-Native Distributed System Development** using Spring Boot & Spring Cloud by building individual components of a microservices ecosystem step-by-step.

---

## 🚀 Key Features & Topics Covered

| Module / Project | Purpose / Concept |
|------------------|--------------------|
| **SpringCloudEurekaServer** | ✔ Service Discovery & Registration |
| **SpringCloudOrderService-DiscoveryClient** | Microservice communication using DiscoveryClient |
| **SpringCloudOrderService-FeignClient** | Declarative REST Clients (Feign) |
| **SpringCloudOrderService-LoadBalancerClient** | Client-Side Load Balancing |
| **SpringCloudConfigServer** | Centralized Config Management |
| **SpringCloudAPI-Gateway** | API Gateway with `.properties` |
| **SpringAdminServer** | Admin Dashboard Monitoring |
| **SpringCloudCartService** | Gateway routing practice |
| **SpringCircuitBreakerApp / SpringMSIntercommApp** | Fault Tolerance using Circuit Breaker |
| **SpringCloudSchedulerService** | Scheduling & Cron Expression + Actuator |
| **SpringJWTAuthentication / JwtBasics / JWTAuhtentication** | Security & JWT Token Generation + Validation |
| **SpringSecurityInMemoryAuthentication** | Spring Security Basic Auth |
| **SpringSecurityJdbcAuthentication** | JDBC Authentication |
| **SpringSecurityOrmAuthentication** | DB-based Authentication & Authorization |
| **SpringKafkaProducerApp & SpringKafkaConsumerApp** | Kafka Producer-Consumer communication |
| **SpringConsumerApp1-MQ / 2 / 3 & SpringProviderApp-MQ** | Message Queue Pub-Sub Model |
| **SpringReactivePgm-consumer / publisher** | Reactive Programming (Mono / Flux) |
| **SpringELKExample** | Logging & Monitoring using ELK |
| **SpringServiceA / B / C** | Distributed Tracing using Zipkin & Sleuth |

---

## 🧠 What You Learn

- Microservices architecture & communication patterns  
- Service Discovery, Load Balancing & Gateway Routing  
- Resilience & fault tolerance using Circuit Breaker  
- Sync & Async inter-service calls  
- Pub-Sub Messaging using MQ / Kafka  
- API Security using JWT & Spring Security  
- Centralized configuration & Admin Monitoring  
- Distributed tracing & logging with Zipkin, Sleuth & ELK  
- Reactive asynchronous non-blocking workflows  
- Real-time cloud-native application components

---

## 🛠 Tech Stack

- **Java 8 / 11**
- **Spring Boot**
- **Spring Cloud**
- **Eureka / Feign / Gateway / Circuit Breaker**
- **Spring Security / JWT**
- **Kafka & Message Queue**
- **Redis / H2 / MySQL**
- **Zipkin / Sleuth / ELK**
- **WebClient / RestTemplate**
- **Reactive Programming (Mono / Flux)**
- **Maven**

---

## 📦 Project Structure

```text
Microservices-project
 ├── JwtBasics
 ├── JWTAuhtentication
 ├── SpringAdminServer
 ├── SpringCircuitBreakerApp
 ├── SpringCloudAPI-Gateway
 ├── SpringCloudCartService
 ├── SpringCloudConfigServer
 ├── SpringCloudEurekaServer
 ├── SpringCloudOrderService-DiscoveryClient
 ├── SpringCloudOrderService-FeignClient
 ├── SpringCloudOrderService-LoadBalancerClient
 ├── SpringCloudSchedulerService
 ├── SpringConsumerApp1-MQ
 ├── SpringConsumerApp2-MQ
 ├── SpringConsumerApp3-MQ
 ├── SpringELKExample
 ├── SpringJWTAuthentication
 ├── SpringKafkaConsumerApp
 ├── SpringKafkaProducerApp
 ├── SpringMSIntercommApp
 ├── SpringProviderApp-MQ
 ├── SpringReactivePgm-consumer
 ├── SpringReactivePgm-publisher
 ├── SpringSecurityInMemoryAuthentication
 ├── SpringSecurityJdbcAuthentication
 ├── SpringSecurityOrmAuthentication
 ├── SpringServiceA
 ├── SpringServiceB
 └── SpringServiceC
