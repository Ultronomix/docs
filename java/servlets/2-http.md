# HTTP

HTTP, or Hypertext Transfer Protocol, is an application protocol for distributed, collaborative, hypermedia information systems. HTTP is the foundation of data communication for the World Wide Web, where hypertext documents include hyperlinks to other resources that the user can easily access, for example by a mouse click or by tapping the screen in a web browser. HTTP was developed to facilitate hypertext and the World Wide Web.

### HTTP Request

![HTTP Request](https://s3.amazonaws.com/revature-note-assets/http-request.png)

### HTTP Response

![HTTP Response](https://s3.amazonaws.com/revature-note-assets/http-response.png)

---

## HTTP Methods

HTTP defines a set of request methods to indicate the desired action to be performed for a given resource. Although they can also be nouns, these request methods are sometimes referred as HTTP verbs. Each of them implements a different semantic, but some common features are shared by a group of them: e.g. a request method can be safe, idempotent, or cacheable.

  - ***GET***
    - The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.


  - ***HEAD***
    - The HEAD method asks for a response identical to that of a GET request, but without the response body.


  - ***POST***
    - The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.


  - ***PUT***
    - The PUT method replaces all current representations of the target resource with the request payload.


  - ***DELETE***
    - The DELETE method deletes the specified resource.


  - ***CONNECT***
    - The CONNECT method establishes a tunnel to the server identified by the target resource.


  - ***OPTIONS***
    - The OPTIONS method is used to describe the communication options for the target resource.


  - ***TRACE***
    - The TRACE method performs a message loop-back test along the path to the target resource.

  - ***PATCH***
    - The PATCH method is used to apply partial modifications to a resource.

#### Safety, Idempotency, and Cacheability

An HTTP method is ***safe*** if it doesn't alter the state of the server. In other words, a method is safe if it leads to a read-only operation. Several common HTTP methods are safe: GET, HEAD, or OPTIONS. All safe methods are also idempotent as well as some, but not all, unsafe methods like PUT, or DELETE.

An HTTP method is ***idempotent*** if an identical request can be made once or several times in a row with the same effect while leaving the server in the same state. In other words, an idempotent method should not have any side-effects. Implemented correctly, the GET, HEAD, PUT, and DELETE method are idempotent, but not the POST method. All safe methods are also idempotent.

A ***cacheable*** response is an HTTP response that can be cached, that is stored to be retrieved and used later, saving a new request to the server.

---

## HTTP Status Codes

Status codes are issued by a server in response to a client's request made to the server. They are included within the header section of the HTTP Response. These codes are used to convey some information about how the server processed, or failed to process, the request. Architectures such as REST require that HTTP status codes be used to convey the success/failure of a client operation.

### Level 100 Codes

This class of status code indicates a provisional response, consisting only of the Status-Line and optional headers, and is terminated by an empty line. There are no required headers for this class of status code.

##### Examples

- `100`: Continue
- `101`: Switching Protocols

### Level 200 Codes

This class of status code indicates that the client's request was successfully received, understood, and accepted.

##### Examples

- `200`: OK
- `201`: Created
- `204`: No Content

### Level 300 Codes

This class of status code indicates that further action needs to be taken by the user agent in order to fulfill the request.

##### Examples

- `301`: Moved Permanently
- `304`: Not Modified

### Level 400 Codes

This class of status code is intended for cases in which the client seems to have erred.

##### Examples

- `400`: Bad Request
- `401`: Unauthorized
- `403`: Forbidden
- `404`: Not Found
- `405`: Method Not Allowed
- `409`: Conflict

### Level 500 Codes

This class of status code indicates cases in which the server is aware that it has erred or is incapable of performing the request.

##### Examples

- `500`: Internal Server Error
- `501`: Not Implemented
- `502`: Bad Gateway
- `503`: Service Unavailable
