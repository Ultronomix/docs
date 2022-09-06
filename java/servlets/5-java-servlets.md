# Java Servlets

A Java Servlet is a Java software component that extends the capabilities of a server. Although servlets can respond to many types of requests, they most commonly implement web containers for hosting web applications on web servers and thus qualify as a server-side servlet web API.

All servlets must implement the `javax.servlet.Servlet` interface, which defines servlet lifecycle methods. When implementing a generic service, we can extend the `GenericServlet` class provided with the Java Servlet API. The `HttpServlet` class provides methods, such as `doGet()` and `doPost()`, for handling HTTP-specific services.

To leverage the `javax.servlet` API in our application, we will need to include it as a dependency within our Maven configuration file (pom.xml). The dependency to use is:

```
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
</dependency>
```

---

### Servlet Lifecycle

Three methods are central to the life cycle of a servlet. These are `init()`, `service()`, and `destroy()`. They are implemented by every servlet and are invoked at specific times by the server.

1) During initialization stage of the servlet life cycle, the web container initializes the servlet instance by calling the `init()` method, passing an object implementing the `javax.servlet.ServletConfig` interface. This configuration object allows the servlet to access name-value initialization parameters from the web application.

    - ***The `init()` method is called *once* during the lifetime of a servlet.***

.

2) After initialization, the servlet instance can service client requests. Each request is serviced in its own separate thread. The web container calls the `service()` method of the servlet for every request. The `service()` method determines the kind of request being made and dispatches it to an appropriate method to handle the request.
  
    - ***The `service()` method is called *once per request* during the lifetime of a servlet.***

.

3) Finally, the web container calls the `destroy()` method that takes the servlet out of service.

    - ***The `destroy()` method is called once during the lifetime of a servlet.***

---

### Request/Response Interaction

The following is a typical user scenario, emphasizing the invocation of the servlet lifecycle methods:

1) Assume that a user requests to visit a URL.
    - The browser then generates an HTTP request for this URL.
    - This request is then sent to the appropriate server.
    
    
2) The HTTP request is received by the web server and forwarded to the servlet container.
    - The container maps this request to a particular servlet.
    - The servlet is dynamically retrieved and loaded into the address space of the container.
    
    
3) The container invokes the `init()` method of the servlet.
    - This method is invoked only when the servlet is first loaded into memory.
    - It is possible to pass initialization parameters to the servlet so that it may configure itself.
    
    
4) The container invokes the `service()` method of the servlet.
    - This method is called to process the HTTP request.
    - The servlet may read data that has been provided in the HTTP request.
    - The servlet may also formulate an HTTP response for the client.


5) The servlet remains in the container's address space and is available to process any other HTTP requests received from clients.
    - The `service()` method is called for each HTTP request.


6) The container may, at some point, decide to unload the servlet from its memory. 
    - The algorithms by which this decision is made are specific to each container.


7) The container calls the servlet's `destroy()` method to relinquish any resources such as file handles that are allocated for the servlet; important data may be saved to a persistent store.


8) The memory allocated for the servlet and its objects can then be garbage collected.

---

### Java Servlet API

![Java Servlet API Class Diagram](https://s3.amazonaws.com/revature-note-assets/servlet-api-class-diagram.png)

- `Servlet` (Interface)
  - The base interface of Java Servlet API. This interface declares the life cycle methods of servlet. All the servlet classes are required to implement this interface. 
  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/Servlet.html)

.

- `ServletConfig` (Interface)
  - Used to pass configuration information to a servlet. Every servlet has its own `ServletConfig` object and the servlet container is responsible for instantiating this object. 
  
  - We can provide some initial parameters to a servlet either by specifying them in the deployment descriptor (web.xml) or through use of the `@WebInitParam` annotation. We can use `getServletConfig()` method to get the `ServletConfig` object of the servlet.
  
  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/ServletConfig.html)

.

- `ServletContext` (Interface)
  - Provides access to web application variables to the servlet. The `ServletContext` is unique object within the servlet container and available to all the servlets in the web application. 
  
  - If some initial parameters are required to be available to multiple or all of the servlets in the web application, we can use `ServletContext` object and define parameters in deployment descriptor (web.xml) using `<context-param>` element. 
  
  - The `ServletContext` object can be obtained via the `getServletContext()` method of `ServletConfig`. Servlet engines may also provide context objects that are unique to a group of servlets and which is tied to a specific portion of the URL path namespace of the host.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/ServletContext.html)

.

- `GenericServlet` (Abstract Class)
  - An abstract class that implements `Servlet`, `ServletConfig` and `Serializable` interfaces and provides a default implementation of all the servlet life cycle methods and `ServletConfig` methods.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/GenericServlet.html)

.

- `HttpServlet` (Abstract Class)
  - An abstract class that extends `GenericServlet` and provides the base for creating HTTP based web applications. 

  - There are methods defined to be overridden by subclasses for different HTTP methods: `doGet()`, `doPost()`, `doPut()`, `doDelete()`.

    - `protected void do_(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException { }`

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpServlet.html)

.

- `ServletRequest` (Interface)
  - Used to provide client request information to the servlet. 

  - The servlet container creates `ServletRequest` object from client request and pass it to the servlet `service()` method for processing.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/ServletRequest.html)

.

- `HttpServletRequest` (Interface)
  - Extends the `ServletRequest` interface to provide request information for HTTP servlet, including header and cookie information available within the request.

  - The servlet container creates an `HttpServletRequest` object and passes it as an argument to the servlet's service methods (`doGet`, `doPost`, etc).

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpServletRequest.html)

.

- `ServletResponse` (Interface)
  - Used by servlet in sending response to the client.

  - The servlet container creates the `ServletResponse` object and pass it to servlet `service()` method and later use the response object to generate the HTML response for client.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/ServletResponse.html)

.

- `HttpServletResponse` (Interface)
  - Extends the `ServletResponse` interface to provide HTTP-specific functionality in sending a response. For example, it has methods to access HTTP headers and cookies.

  - The servlet container creates an `HttpServletResponse` object and passes it as an argument to the servlet's service methods (`doGet`, `doPost`, etc).

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpServletResponse.html)

.

- `RequestDispatcher` (Interface)
  - Used to forward a request to another resource, which could be HTML, JSP, or another servlet in the same context. Also used for including the content of another resource to the response. 
  
  - Primarily used for servlet communication between servlets within the same context.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/RequestDispatcher.html)

.

- `Filter` (Interface)
  - Similar to `Servlet` interface, in that it provides the filter lifecycle methods (`init()`, `doFilter()`, and `destroy()`) and is implemented by all filters.

  - Filters are managed by the servlet container, just as servlets are.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/Filter.html)

.

- `HttpFilter` (Abstract Class)
  - An abstract class to be subclassed to create an HTTP filter suitable for a web application.

  - Overwrites the `Filter.doFilter()` method by providing `HttpServletRequest` and `HttpServletResponse` objects, rather than `ServletRequest` and `ServletResponse` objects.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpFilter.html)

.

- `HttpSession` (Interface)
  - The Servlet API provides session management through `HttpSession` interface. We can get a session from `HttpServletRequest` object using one of the `getSession()` methods. `HttpSession` allows us to set objects as attributes that can be retrieved in future requests.

  - [Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpSession.html)
