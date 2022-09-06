# Deployment Descriptor

A deployment descriptor refers to a configuration file for an artifact that is deployed to some container/engine. It describes how a component, module or application (such as a web application or enterprise application) should be deployed. It directs a deployment tool (Tomcat's Catalina servlet container in our case) to deploy a module or application with specific container options, security settings and describes specific configuration requirements. XML is used for the syntax of these deployment descriptor files.

For web applications, the deployment descriptor must be called web.xml and must reside in the WEB-INF directory in the web application root.

---

## web.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
	version="2.5">

	<display-name>my-app</display-name>

    <!-- 
        The container will search the web application directory for one of the following
        files to serve up if a request is made to the root of the web application's context
        path (http://localhost:8080/my-app/).
    -->
	<welcome-file-list>
		<welcome-file>index.html</welcome-file>
		<welcome-file>index.htm</welcome-file>
		<welcome-file>index.jsp</welcome-file>
		<welcome-file>default.html</welcome-file>
		<welcome-file>default.htm</welcome-file>
		<welcome-file>default.jsp</welcome-file>
	</welcome-file-list>

    <!-- Provide parameters to the ServletContext (available to all servlets in this context)-->
    <context-param>
        <param-name>someParam</param-name>
        <param-value>someValue</param-value>
    </context-param>

    <servlet>
        <servlet-name>UserServlet</servlet-name> <!-- Mandatory tag -->
        <servlet-class>com.revature.servlets.UserServlet</servlet-class> <!-- Mandatory tag -->

        <!-- Provide parameters to the ServletConfig (specific to this servlet) -->
        <init-param> <!-- Optional tag -->
            <param-name>someParam</param-name>
            <param-value>someValue</param-value>
        </init-param>
    </servlet>

    <servlet-mapping>
        <servlet-name>UserServlet</servlet-name> <!-- Mandatory tag -->
        <url-pattern>/users/*</url-pattern> <!-- Mandatory tag -->
    </servlet-mapping>

    <filter>
        <filter-name>CorsFilter</filter-name> <!-- Mandatory tag -->
        <filter-class>com.revature.filters.CorsFilter</filter-class> <!-- Mandatory tag -->
        
        <init-param> <!-- Optional tag -->
            <param-name>someParam</param-name>
            <param-value>someValue</param-value>
        </init-param>
    </filter>

    <filter-mapping>
        <filter-name>CorsFilter</filter-name> <!-- Mandatory tag -->
        <url-pattern>/*</url-pattern> <!-- Mandatory tag (unless servlet-name is specified) -->
    </filter-mapping>
</web-app>
```

---

## Annotations

Since `javax.servlet` API version 3, XML configuration of our servlet container is optional. An annotation-based approach to servlet registration and configuration simplifies the process by allowing developers the ability to configure their servlets and filters using simple and intuitive annotations in place of the former XML configuration. However, the web.xml is still required to be present, even if no servlets or filters are registered within it. Below are some commonly used Servlet API annotations ([Documentation](https://javaee.github.io/javaee-spec/javadocs/javax/servlet/annotation/package-summary.html))

- `@WebServlet`
  - Annotation used to declare a servlet.

  - This annotation is processed by the container at deployment time, and the corresponding servlet made available at the specified URL patterns.

.

- `@WebInitParam`
  - This annotation is used on a `Servlet` or `Filter` implementation class to specify an initialization parameter.

.

- `@WebFilter`
  - Annotation used to declare a servlet filter.

  - This annotation is processed by the container at deployment time, and the corresponding filter applied to the specified URL patterns, servlets, and dispatcher types.