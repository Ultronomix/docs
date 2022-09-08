# Testing
- Testing is absolutely essential for applications
  - Code is well organized and readable
  - Code is tested
- If your code is not tested DO NOT ASSUME that it works
- How most test frameworks design test
  - Give you a way to run a snippet of code
  - Run that snippet of code
    - If it completes without throwing an uncaught error or exception => PASS
    - If throws an uncaught exception => FAIL
  - Assertions are provided
    - Methods that throw an error if the assertion is not true
- *pro tip*
  - Methods that return void are DIFFICULT to write tests for
    - You can always ignore the return of a method if you do not need it
    - You are better off having it and not using it than needing it and not having it
  - Writing tests while you code will help your code be better designed

## TDD
- Test Driven Development
- Testing does more than verify functionality
  - Testing is essential for planning your application
  - Desiging your interfaces

1. Develop an interface
2. Create test cases that verify the functionality of that interface
3. You might end up refactoring your interface and method signature
4. Develop your implemenation of the interface
5. Run your tests to verify functionality