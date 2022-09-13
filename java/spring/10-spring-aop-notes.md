# Spring AOP

The Spring Framework has its own Aspect-Oriented Programming framework, which is based on AspectJ. Aspect-oriented Programming (AOP) complements Object-oriented Programming (OOP) by providing another way of thinking about program structure. The key unit of modularity in OOP is the class, whereas in AOP the unit of modularity is the **aspect**. Aspects enable the modularization of concerns (such as transaction management, logging, security, etc.) that cut across multiple types and objects. (Such concerns are often termed **"cross-cutting"** concerns in AOP literature.)

---

## AOP Concepts

Let us begin by defining some central AOP concepts and terminology. These terms are not Spring-specific. Unfortunately, AOP terminology is not particularly intuitive. However, it would be even more confusing if Spring used its own terminology.

- _**Aspect**_
  - A modularization of a concern that cuts across multiple classes. Transaction management is a good example of a crosscutting concern in enterprise Java applications. In Spring AOP, aspects are implemented by using regular classes (the schema-based approach) or regular classes annotated with the `@Aspect` annotation (the AspectJ style).

- _**Join point**_
  - A point during the execution of a program, such as the execution of a method or the handling of an exception. In Spring AOP, a join point always represents a method execution.

- _**Advice**_
  - Action taken by an aspect at a particular join point. Different types of advice include "around", "before", and "after" advice. Many AOP frameworks, including Spring, model an advice as an interceptor and maintain a chain of interceptors around the join point.

- _**Pointcut**_
  - A predicate that matches join points. Advice is associated with a pointcut expression and runs at any join point matched by the pointcut (for example, the execution of a method with a certain name). The concept of join points as matched by pointcut expressions is central to AOP, and Spring uses the AspectJ pointcut expression language by default.

- _**Introduction**_
  - Declaring additional methods or fields on behalf of a type. Spring AOP lets you introduce new interfaces (and a corresponding implementation) to any advised object. For example, you could use an introduction to make a bean implement an IsModified interface, to simplify caching. (An introduction is known as an inter-type declaration in the AspectJ community.)

- _**Target object**_
  - An object being advised by one or more aspects. Also referred to as the "advised object". Since Spring AOP is implemented by using runtime proxies, this object is always a proxied object.

- _**AOP proxy**_
  - An object created by the AOP framework in order to implement the aspect contracts (advise method executions and so on). In the Spring Framework, an AOP proxy is a JDK dynamic proxy or a CGLIB proxy.

- _**Weaving**_
  - linking aspects with other application types or objects to create an advised object. This can be done at compile time (using the AspectJ compiler, for example), load time, or at runtime. Spring AOP, like other pure Java AOP frameworks, performs weaving at runtime.

---

## Spring AOP Advice Types

- _**Before advice**_ (`@Before`)
  - Advice that runs before a join point but that does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception).

- _**After returning advice**_ (`@AfterReturning`)
  - Advice to be run after a join point completes normally (for example, if a method returns without throwing an exception).

- _**After throwing advice**_ (`@AfterThrowing`)
  - Advice to be executed if a method exits by throwing an exception.

- _**After advice**_ (`@After`)
  - Advice to be executed regardless of the means by which a join point exits (normal or exceptional return).

- _**Around advice**_ (`@Around`)
  - Advice that surrounds a join point such as a method invocation. This is the most powerful kind of advice. Around advice can perform custom behavior before and after the method invocation. It is also responsible for choosing whether to proceed to the join point or to shortcut the advised method execution by returning its own return value or throwing an exception.