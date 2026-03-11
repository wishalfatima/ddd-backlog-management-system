# Domain-Driven Design Backlog Management System

## Project Overview
This project demonstrates a **Domain-Driven Design (DDD) implementation in Java** based on a backlog management domain model.  
The project also applies the **4+1 Architectural View Model** and UML modeling to represent system structure, interactions, and components.

The system models a backlog system used in agile development environments where product owners, developers, and scrum masters interact with backlog items.

The goal of this project is to:
- Implement a **DDD-based domain model in Java**
- Model system architecture using the **4+1 View Model**
- Represent system diagrams using **PlantUML**

---

# Features

The system supports the following backlog management operations:

- Add Backlog Item
- Update Backlog Item
- View Backlog Item
- Assign Backlog Item to Product
- Assign Backlog Item to Release
- Assign Backlog Item to Sprint
- View Related Release Items

---

# Actors

The system supports three main actors:

**Product Owner**
- Add backlog items
- Update backlog items
- Assign backlog items to products
- Assign backlog items to releases

**Scrum Master**
- Assign backlog items to sprints

**Developer**
- View backlog items
- View related release items

---

# Domain-Driven Design (DDD)

The system follows Domain-Driven Design principles:

### Core Domain
Backlog Management

### Main Domain Entities
- Backlog
- BacklogItem
- Task
- ProductID
- ReleaseID
- SprintID

The IDs represent references to external services.

In a full system implementation these would refer to actual:
- Product objects
- Release objects
- Sprint objects

However, in this prototype they are represented as identifiers only.

---

# External Services

The backlog system interacts with external services through REST APIs:

- **Product Management Service**
- **Release Management Service**
- **Sprint Management Service**

These services provide information about products, releases, and sprints.

---

# 4+1 View Model

The system architecture is designed using the **4+1 Architectural View Model**.

### Logical View
Represents the **domain model and class structure** using UML class diagrams.

### Development View
Represents the **system components and their organization** using UML component diagrams.

### Process View
(Not deeply implemented in this prototype.)

### Physical View
(Not required for this prototype.)

### Use Case View (+1)
Represents system functionality using a **Use Case Diagram**.

---

# Implemented Diagrams

The following UML diagrams were created using **PlantUML**:

- Use Case Diagram
- UML Class Diagram (DDD Logical View)
- Component Diagram (Development View)
- Domain Context Map (DDD)

PlantUML was used to generate these diagrams programmatically.

Tool used:  
https://www.plantuml.com  
Interactive editor:  
https://www.planttext.com

---

# Project Structure

Example structure of the project:
