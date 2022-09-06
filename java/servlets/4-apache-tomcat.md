# Apache Tomcat

Apache Tomcat implements several Jakarta EE specifications including Java Servlet, JavaServer Pages (JSP), Java EL, and WebSocket, and provides a "pure Java" HTTP web server environment in which Java code, packaged within a web archive (WAR) file, can run.

Tomcat is developed and maintained by an open community of developers under the auspices of the Apache Software Foundation, released under the Apache License 2.0 license, and is open-source software.

---

## Web Server vs Web Client

A web server is software that can process the client request and send the response back to the client. For example, Apache Tomcat is one of the most widely used web server. Web Server runs on some physical machine and listens to client request on specific port.

#### Examples of Web Servers:

- Apache Tomcat
- Apache Geronimo
- Red Hat WildFly
- Eclipse Jetty
- Nginx

A web client is a software that helps in communicating with the server. When we request something from server (through URL), web client takes care of creating a request and sending it to server and then parsing the server response and present it to the user.

#### Examples of Web Clients:

- Chrome
- Firefox
- Safari
- Opera
- Edge

---

## Tomcat Components

### Catalina

Catalina is Tomcat's servlet container. Catalina implements Sun Microsystems's specifications for servlet and JavaServer Pages (JSP). 

### Coyote

Coyote is a Connector component for Tomcat that supports the HTTP 1.1 protocol as a web server. This allows Catalina, nominally a Java Servlet or JSP container, to also act as a plain web server that serves local files as HTTP documents. 

Coyote listens for incoming connections to the server on a specific TCP port and forwards the request to the Tomcat Engine to process the request and send back a response to the requesting client. Another Coyote Connector, Coyote JK, listens similarly but instead forwards its requests to another web server, such as Apache, using the JK protocol. This usually offers better performance.

### Jasper

Jasper is Tomcat's JSP Engine. Jasper parses JSP files to compile them into Java code as servlets (that can be handled by Catalina). At runtime, Jasper detects changes to JSP files and recompiles them.
