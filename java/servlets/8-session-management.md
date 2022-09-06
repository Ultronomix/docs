# Session Management

The HTTP protocol and our web servers are stateless, which means that every request to our web server is a new request to process and they can’t identify if it’s coming from client that has been sending request previously. However, we will likely want to maintain some sort of session with users so that their interaction with the server can be smooth and seamless.

A session is a conversional state between the client and the server, and consists of multiple requests and responses between the two. Since HTTP and our web server both are stateless, we have two options for maintaining session state: server-side or client-side state management. 

Performing server-side state management means that our web server is ***stateful***. If we require that the client be responsible for maintaining their own session state (client-side state management), then our web server is said to be ***stateless***.

---

### Stateful Session Management

If we choose to manage session state on the server side, we will need an object which can persist some information across multiple HTTP requests. The primary advantage of this design choice is increased security. Since we maintain the client's session data on our server, their data is enclosed within our organization's security architecture. Disadvantages to this design choice are related to scalability, while there are solutions available (sticky sessions, distributed caching, etc.) they usually require increased complexity on the operational layer.

#### `HttpSession`

Using the Servlet API, we can use the `HttpSession` interface to perform this task. The servlet container can create an object that implements this interface, each object created will contain a unique session ID. This object can be used to perform two tasks:

- bind objects

- view and manipulate information about a session, such as the session identifier, creation time, and last accessed time.

---

### Stateless Session Management

Choosing to manage session state on the client side means that we will not use any server-side object to persist client data. Instead, tokens will be used to verify authentication and authorization. The primary advantages of this design choice are the simplified implementation and resiliency. The primary disadvantage of this design choice is the need for a more complex security architecture. Since tokens are managed by the client and sent with each request, this increases the risk of token hijacking - which is where an attacker obtains an authentication token from an HTTP request (usually by way of a man-in-the-middle attack) and uses it to interact with our web server, effectively allowing the attacker to impersonate the actual user.


#### JSON Web Tokens (JWTs)

See Google Slides document on JWTs in the batch Google Drive.

---