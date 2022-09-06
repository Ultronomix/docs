# Jakarta Enterprise Edition Architecture

Formerly known as J2EE (Java 2 Enterprise Edition), Jakarta EE is a set of specifications, extending Java SE 8 with specifications for enterprise features such as distributed computing and web services.

![Jakarta EE Architecture](https://s3.amazonaws.com/revature-note-assets/J2EE+Architecture.jpeg)
*A Generic Implementation of Jakarta EE Architecture*

---

## Jakarta EE Specifications

Jakarta EE includes several specifications that serve different purposes, like generating web pages, reading and writing from a database in a transactional way, managing distributed queues.

The Jakarta EE APIs include several technologies that extend the functionality of the base Java SE APIs, such as Enterprise JavaBeans, connectors, servlets, JavaServer Pages (JSPs) and several web service technologies.

### Web Specifications

- Servlet
  - Defines how to manage HTTP requests, in a synchronous or asynchronous way. It is low level and other Java EE specifications rely on it.


- WebSocket
  - The Java API for WebSocket specification defines a set of APIs to service WebSocket connections.


### Web Service Specifications

- Java API for RESTful Web Services
  - Provides support in creating web services according to the Representational State Transfer (REST) architectural pattern.


- Java API for JSON Processing
  - A set of specifications to manage information encoded in JSON format.


- Java API for JSON Binding
  - Provides specifications to convert JSON information into or from Java classes.


- Java Architecture for XML Binding (JAX-B)
  - Allows mapping XML into Java objects


- Java API for XML Web Services (JAX-WS)
  - Used to create SOAP web services.


### Enterprise Specifications

- Contexts and Dependency Injection (CDI)
  - A specification to provide a dependency injection container, as in Spring.

- Enterprise Java Bean (EJB)
  - A specification which defines a set of lightweight APIs that an object container that will support the application in order to provide transactions (using JTA), remote procedure calls (RPCs), concurrency control, dependency injection and access control for business objects.


- Java Persistence API (JPA)
  - Specifications about object-relational mapping between relation database tables and Java classes.


- Java Transaction API (JTA)
  - Contains the interfaces and annotations to interact with the transaction support offered by Java EE.


- Java Message Service (JMS)
  - Provides a common way for Java programs to create, send, receive and read an enterprise messaging system's messages.