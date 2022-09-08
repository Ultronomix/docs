# Java Language Features

## Language Overview 

Java is an [object-oriented](../../common-glossary/object-oriented-programming.md) programming language developed by Sun Microsystems in 1995 (Sun Microsystems was later acquired by Oracle in 2010). It is a [general-purpose](../../common-glossary/general-purpose-language.md) programming language intended to let programmers write once, run anywhere (**WORA**), meaning that [compiled](../../common-glossary/compilation.md) Java code can run on all [platforms](../../common-glossary/software-platform.md) that support Java without the need for recompilation.


## Language Features

### Platform independence

All [operating systems](../common-glossary/operating-system.md) are different, and as a result Java source code (written by a developer) is compiled into **bytecode** by the [Java compiler](./3-jdk-overview.md#java-compiler). The compiled bytecode is then converted into operating system instructions by the [Java Virtual Machine (JVM)](./jvm-overview.md). 

### Clear, verbose syntax

Java has C-like syntax like C++ and C#, many syntax elements of the language are readable and widely used in programming. The Java API (Application Programming Interface) is also written using verbose, descriptive naming conventions making it simple to parse large code bases.

### Automatic Memory Management

The JVM contains a subroutine known as a "garbage collector". Its role is to automatically deallocate memory addresses for unused/unreferenced objects at [runtime](../../common-glossary/runtime-environment.md). Because of this feature, Java applications can be written without the need for complex memory management.

### Secure 

Since Java applications run within a runtime environment provided by the JVM, there is a layer of abstraction between them and the underlying operating system. Unlike C/C++, Java does not allow a programmer to explicitly create pointers. As a result improper access to a particular variable if we do not initialize it properly.

Programs run in a virtual machine sandbox – A separate environment that allows users to execute their applications without affecting the underlying system.

It has a bytecode verifier that checks the code fragments for any illegal code that violates the access right.

### Multi-paradigm 

As an object-oriented language, Java has obvious support for [imperative] (../../common-glossary/imperative-paradigm.md) syntax and styles of programming. In modern versions of the Java language support [declarative](../../common-glossary/declarative-paradigm.md)) syntax has been added to offer more flexibility in the way that developers can write their systems.

### Multithreading

A **thread** is an independent path of execution within an application, executing concurrently or in parallel. The Java language supports multithreading by allowing multiple threads to be executed either [concurrently](../common-glossary/concurrency.md) or in [parallel](../common-glossary/parallelism.md).