# Spring Boot
---

Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". It takes an opinionated view of the Spring platform and third-party libraries so you can get started with minimum configuration.

## Advantages of using Spring Boot

Create stand-alone Spring applications
- Embedded Tomcat, Jetty or Undertow directly (no need to deploy WAR files)

- Provide opinionated 'starter' dependencies to simplify your build configuration

- Automatically configure Spring and 3rd party libraries whenever possible

- Provide production-ready features such as metrics, health checks and externalized configuration that can be exposed using Actuator

- Absolutely no code generation and no requirement for XML configuration


---
## Spring Boot Driver Class

	@SpringBootApplication
	public class MyApplication {
		
		public static void main(String[] args) {
			SpringApplication.run(MyApplication.class, args);
		}

	}

- `@SpringBootApplication`
  - an aggregate annotation which implies the following annotations: `@Configuration`, `@EnableAutoConfiguration`, `@ComponentScan`

---
## Spring Boot Actuator

In essence, Actuator brings production-ready features to our application. Monitoring our app, gathering metrics, understanding traffic or the state of our database becomes trivial with this dependency. The main benefit of this library is that we can get production grade tools without having to actually implement these features ourselves.

Here are some of the most common endpoints the actuator provides:

- `/health`
  - Shows application health information (a simple status when accessed over an unauthenticated connection or full message details when authenticated); it's not sensitive by default

- `/info`
  - Displays arbitrary application info; not sensitive by default

- `/metrics`
  - Shows metrics information for the current application; it's also sensitive by default

- `/trace`
  - Displays trace information (by default the last few HTTP requests)
