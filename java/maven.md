# Maven
- Wise Woman 
- Java Build and **dependency** management tool
  - Dependency
    - Most applications will use code written by other developers
    - How do you incorporate those outside dependencies/code into your programs?
      - Old School: Do it manually by downloadin JAR Files and adding it to your classpath for execution
        - This is Terrible
        - Very tedious
        - Very Error prone
      - Dependency Manager
        - Will automate the entire process for us
- Skyrim => Nexus mods
- Java App => Maven
- Dependency managers for other languages
  - Java
    - Maven
    - Gradle
    - Ant
  - JavaScript
    - npm
    - yarn
  - Rust
    - Cargo
  - Ruby
    - gem
  - Python
    - pip
    - poetry
## Maven Repository
- A huge collection of Java libraries
- We can easily incorprate anythin in the Maven repo into our application

## Maven Project Structure
- ***pom.xml***
  - Project Object Model
  - The main configuration file for any Maven Project
    - Dependencies
    - Author
    - Licensing info
    - Version number
    - Build steps
    - etc...
- src 
  - main
    - java (Where you write the Java code for you app)
    - resources (Any files that your program uses that are *not* java files)
  - test
    - java (Where you write Test code for your app)

## XML Basics
- eXtensible Markup Language
- A format for text files
  - Popular for configration files in Java
- based on tags
- Some xmls files have a **DTD** at the type
  - Data Type Definition  
  - Defines the tags that are used in the xml file
```xml
    <author>
        <name>Adam ranieri</name>
        <profession>Trainer</profession>
        <location>WV</location>
    </author>
```