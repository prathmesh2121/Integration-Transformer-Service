# Integration Transformer Service

A Spring Boot REST API to convert XML to JSON and JSON to XML.

## Features
- XML → JSON conversion
- JSON → XML conversion
- Global exception handling
- Layered architecture (Controller + Service)

## Tech Stack
- Java
- Spring Boot
- Jackson (ObjectMapper, XmlMapper)

## APIs

### 1. JSON → XML
POST /api/json-to-xml

### 2. XML → JSON
POST /api/xml-to-json

## Sample JSON
{
  "user": {
    "name": "Prathmesh",
    "age": 22
  }
}

## Sample XML
<user>
  <name>Prathmesh</name>
  <age>22</age>
</user>