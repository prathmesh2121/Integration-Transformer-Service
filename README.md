# Integration Transformer Service

A production-ready Spring Boot backend application that converts JSON into XML format & XML into JSON format.
The service is containerized using Docker and deployed on AWS EC2

## Architecture
Client → EC2 (AWS) → Docker Container → Spring Boot Application → Response

## Features
- XML → JSON conversion
- JSON → XML conversion
- Layered architecture (Controller + Service)
- Docker containerization
- Cloud deployment on AWS EC2
- Production-ready practices (logging, exception handling, health checks)


## Tech Stack
- Java
- Spring Boot
- Jackson (ObjectMapper, XmlMapper)
- Docker
- AWS EC2

## APIs

### 1. JSON → XML
POST /api/json-to-xml

### 2. XML → JSON
POST /api/xml-to-json


