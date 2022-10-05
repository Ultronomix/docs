*Angular is going to be our front end framework of choice, it’s going to power up and simplify (hopefully) our good old HTML/CSS/JS workflows. As an associate I found Angular a little overwhelming to learn since there are so many moving parts, but I’m going to do my best to explain how everything fits together. There are a couple tools we’re going to need in order to use with Angular, which we’ll talk about first. They are...*

**NodeJS**

- Open-source **run-time environment** built on Chrome’s V8 JS engine used to execute JS outside a web browser. **We need this in order to run Angular apps**. 
- It provides a large library of various JS modules which can simplify development for web applications. 
- NodeJS has been used for development by many large companies including: Netflix, Facebook, Walmart, Linkedin, Uber etc. 
  - It has helped companies create various applications like social media apps, video/text chat engines, web browser-based games, and collaboration tools.

**Node Package Manager (npm)**

- This is **Node’s built-in package manager.** It is similar to things like Scoop or Homebrew and allows for **downloading and installing frameworks/applications/libraries** for development. 
- **“Angular and its dependencies are installed with npm and runs on a NodeJS environment (server) which is why we need them”** -Good start to an answer in QC
- CLI commands for Node Package Manager start with “npm”. 
  - When you pull any angular project, you will likely have to run “npm install” to get all the dependencies. npm install is also a fun debugging trick, similar to gradle refresh

**\*Installing NodeJS, NPM, Angular\***

-First, we need NodeJS. <https://nodejs.org/en/download/>

`	`**-Go ahead and check “Automatically install necessary tools”.**

-Otherwise ”Next” your way through everything. 

-A command prompt will show up, just do what it says. It’ll install a bunch of junk.

`	`-...For a long time…

`	`-Mcafee may stop it… should be fine honestly.

-In git bash, enter: node -v to make sure it’s installed. It’ll tell you the version you have.

-npm has been installed too by the way!! Try npm -v to prove it. This shows the version of npm.

-Now we just need Angular itself.

`	`-In git bash, enter: npm install -g @angular/cli

`	`-Might get some deprecation warnings - it’s fine.

`		`-You can do this multiple times, it’ll update your stuff.

`	`-ng version (no dash) to make sure it worked. WOW! Cool art. Very nice workmanship.

# Angular

- Is a front end framework designed by Google, for developing **Single Page Applications (SPA).** It will make your webpage development a lot easier than what you’ve been using.
  - An SPA is a reactive webpage that may give the impression of being multiple webpages that a client navigates through, but is in fact a single webpage with “components” that move in and out responsively to change the user’s view. 
- Angular Versioning: **Angular vs AngularJS**
  - **AngularJS was the first “Angular”** in 2010 and was a JavaScript based SPA framework. 
  - Angular or Angular 2 - 2016 A complete rewrite of the AngularJS framework in TypeScript.** 
    - Angular 2+ is generally used now to denote anything after AngularJS. So **Angular 2+ will be relevant to us, JS won’t be.** 
  - Angular 4 in 2017 was used to “reset” the naming convention to be clear going forward. It skipped Angular 3 entirely. 
  - Angular 14 - mid 2022. Current version today. 

- **Angular applications are fundamentally composed of Components, Services, and Modules.** It supports **directives, data binding, and dependency injection**. 
  - **Components are sections of web pages** that are easily added or removed to our base HTML web page, or within other components. 
  - **Services are pure logic files. (Typescript files).** They hold functions and variables shared across components. They give our web pages functionality!**  
  - **Modules organize our application** by making collections of components, services, and even other modules (Analogous to Java packages) 

- Angular comes prepackaged with a CLI that helps us create projects and components with short commands! Angular’s CLI commands start with “ng”
  - Eg.`ng generate component [component-folder]/[component-name]`


**Single Page Applications (SPA)**

- A Single Page Application (SPA) is a **web application that fits on a single page in the browser.** All our JavaScript, HTML, CSS code is retrieved by the browser with a single page load. 
  - **Navigation between “pages” is performed without refreshing the page**
  - So with Angular, we don’t navigate between pages at all. The webpage is like a canvas/whiteboard with parts moving in and out as the user navigates the page. TypeScript logic executes to move components around, thus changing the user’s view
- Examples of SPAs we use all the time: Twitter, Gmail, YouTube, Paypal

- **Advantages**
  - Fast and responsive. Since it only updates the required content, we don’t have to wait for an entire page to load when navigating.
  - High Caching capabilities. The page will cache all received data locally, which then can be reused even if offline. If the user has limited connectivity, local data can be synchronized with the server when connection allows. 
- **Disadvantages** 
  - While overall performance is better, more data is frontloaded (loaded in the beginning) so the first page load can be slower. Notice how long gmail takes to load? 
  - Does not perform well with Search Engine Optimization (SEO), Ironic because google designed this stuff.  
    - SEO is basically how you ensure your website is as high on the list of results returned by a search engine. 
  - Security - SPAs have some increased vulnerabilities to Cross-Site Scripting (XSS) attacks. 
    - XSS is a bad actor (hacker?) inserting malicious js into the page load from a third party location. 

**TypeScript (know the differences between JS, cause QC will ask)**

- TypeScript is the language we’ll use to provide functionality to our Angular front ends, essentially replacing the role of JavaScript.
- **TypeScript is a superset of JavaScript** (Superset - A **programming** language that contains all the features of a given language and has been expanded or enhanced to include other features as well.)
  - **All valid JavaScript (JS) is valid TypeScript (TS).** But the reverse is not true.
  - TS must be **“transpiled”** into JS for a browser to run it. Browsers do not have built-in support for TS.
    - “Transpiling is a specific term for taking source code written in one language and transforming into another language that has a similar level of abstraction.”
    - So while Java COMpiles into bytecode, TS TRANSpiles into JS.
  - TS is open-source, object oriented, portable, strongly typed
    - OOP - it supports classes, inheritance, interfaces etc. MUCH easier than we could with JS. 
    - Portable? Means you can use it in different environments 
    - Strongly typed - When you declare a variable, you need to declare a type. 
    - TS files have the file extension “.ts”

**TypeScript Decorators**

- Decorators are essentially the same as **annotations in Java**. They use the @ symbol and **provide additional functionality to your code.**
- Decorators can be attached to classes, methods/functions, properties, parameters, etc.

**TypeScript Data Types**

- Most TS data types are like JS. 
- Because TS is a **strongly typed** language, we have to declare a datatype when we declare a variable
- We tend to only use let or const, var is possible but it’s considered bad practice.
  - let variable-name : data-type = value;
  - E.g. `let myString : string = “I am a string!”;`
  - `myString = 5; //this will throw an error! TS is not loosely typed like JS`
- **TypeScript has all the basic data types of JS** (number, string, etc) plus more:
  - **Any** - Because TS is transpiled into JS (which is loosely typed), sometimes we need the ability to declare a variable without a specific type. AKA it can be “any” type it needs to be. 
    - E.g. `let myString : any = “I am a string!”;`
    - `myString = 5; //this will NOT throw an error! The data type is “any”`
  - **Arrays** - Arrays in TS are typed like Arrays in Java. So, only values of the declared Array type are acceptable and they’re fixed in size.
    - E.g. `let fruits : string[] = [‘Apple’, ‘Banana’, ‘Pomegranate’, ‘Rambutan’]`
    - E.g. `let fruit : any[] = [‘Apple’, 4, false, ‘Mango’]`
  - **Never** & **Void:** These are function return types
    - **Void:** For a function that doesn’t return anything
    - **Never:** For a function will never return because it “raises” (throws)  an error. So you’d only really use this if you want to create a custom error.


**TypeScript Classes**

- TS is OOP - so it has support for Classes. It uses the “class” keyword to declare them, then the “new” keyword to create an object of that class.

- **TS has inheritance just like in Java**, and uses the “extends” keyword in the same way.
- **Access Modifiers:** 
  - public - same as in Java, but this is also the default access modifier 
  - protected - the class visible to the itself, and any subclasses (we don’t really have packages in TS)
  - private - the class is only visible to itself
- **ReadOnly**:
  - “readonly” marks a class’s properties as unchangeable. It must be initialized at declaration or in the constructor. Same as final in Java. 
- Getters and Setters use the “get” and “set” keywords. 


\*Started todo list demo to look at angular anatomy\* 

# Look here for common Angular CLI commands you’ll use often

\*when we installed angular, we got **Angular CLI**. It lets us generate angular projects, components, services, and more, all from the comfort of commands in git bash :)

-Git bash into the folder where you want your application to be. 

`ng new hello-angular --skip-git --routing` (this creates a new project)

`	`-skip git will bypass the automatic git repo that will be built

`	`-Routing we’ll talk about later but this gives us the ability to navigate through components

`ng serve -o` (to bring (serve) your application to a browser tab)


\*we get sent to the default welcome page. click “Learn Angular” for a very good tutorial

**\*To stop the server in git bash, (so we can build new components etc) the keyboard shortcut is ctrl + c**

`ng generate component components/[component-name]` (generate a new component)

#   

**Angular File Structure** 

- **node\_modules** - this is where npm will place all the dependencies for your angular project. 
  - npm determines dependencies via the **package.json file and the package-lock.json** file. (This is equivalent to the build.gradle for gradle.)
    - Read further below and check further reading if you’d like to know more. 
  - The autogenerated .gitignore file will automatically ignore the node\_modules folder. So the dependencies don’t get pushed to git repos...
    - “npm update” or “npm install” is needed to install the appropriate dependencies to the node\_modules folder after the code is pulled from an online repository. Much like a maven update!!
- **src** contains source code files, which is where we’ll be doing most of our coding. This is where our custom components, services, logic, etc will all go.
  - **app** - this is where all your components live. It comes with a root component called **app.component**. This contains a lot of our baseline web page structure.
    - app.component.ts - root component’s typescript file - logic goes here.
    - app.component.html - is the root component’s html template (snippet)
    - app.component.css - is the root component’s css file.
    - app.component.spec.ts - auto generated testing file for the root component.
    - *We’ll look at these last two more in depth later, just know that they contain more TS logic-*
    - **app.routing.module.ts** - It is an array which holds all the **routes** we need in our project.
    - **app.module.ts** - used on application startup, set links to other modules
  - assets - this is for images or other resources.
  - environments - contains build configuration options for particular target environments. (We won’t be worrying about this)
  - favicon.ico - the icon that gets displayed in the browser tab. 
  - **index.html** - The main html page that is served when someone visits the website. Our components will be moving in and out of this index.html file as the user clicks around.
    - The CLI automatically adds all TS/JS and CSS files when building the application so no link/script tags are necessary. 
  - main.ts - main entry point for the application. Analogous to Java’s main method. We won’t really mess with this, we’ll let it do its thing for the most part.
  - **styles.css** - this is the “global” stylesheet for the project. This styling will be applied to the index.html and all components. 
    - Just remember that each component also has its own .css file, which will only apply to that component in particular. 
  - tests.ts - entrypoint when running tests. 
- **angular.json** -  this holds the CLI configuration defaults for the project. It includes options for building, serving, and testing the project. 
  - So when you run something from the CLI, this is what it checks in order to run.
- karma.conf.js - Karma (our testing tool) configuration.
- **package.json** - lists npm dependencies that are placed in the node\_modules folder in order to actually use them in your project. 
- **package-lock.json** - records dependency version and other meta information about all the dependencies in the node\_modules folder. 
  - So basically, package.json lists all your dependencies, and package-lock.json provides more specific (meta) information about the dependencies.


**Angular Components (one of the main 3 parts of an Angular application)**

- Components are essentially **a “section” of a webpage that can be displayed or removed by our Angular application.** Think of all the different boxes that are displayed when you go onto facebook.com. Those are all components. Your newsfeed, ads, other sidebars, etc.
- We can use the CLI to create a new component in our Angular application. **The command to create a component is “ng generate component <component-folder (optional)> <component-name>.** 
  - This can be shortened to “ng g c <component-folder> <component-name>”
  - Creating a component through the CLI creates four files that make up the component: html, css, spec.ts, ts
- **We can display components in two ways:**
  - 1.) **Statically** - Each component will have a selector associated with the @Component decorator. You can find it in the TS file. An HTML tag with the name of that selector will display that component on your webpage statically. 
    - This is a great choice for a navbar or anything else that won’t move.
    - This isn’t very dynamic though… A big characteristic of angular applications is to have components constantly moving in and out. 
  - 2.) **Dynamically** - A component can be placed in the “routes” array of the app-routing.module as an object with “path” and “component” fields. 
    - \*\*\*Go find the routes array in the app-routing.module, we stick our components in here in order to route them and display them dynamically!
    - The **“path” field will be the url path that will display the component,** and **the “component” field will be the class name of the component.** This will then be displayed when on the appropriate url, thanks to the <router-outlet> in app.component.html
- The **@Component** decorator in a component’s TS file specifies the selector, the html page, and the css sheet associated with the component. 

\*Made a couple components in todo list\*

**NgModule (someone will definitely be asked this in QC)**

- NgModule is a class designed to **organize related parts of our Angular application.** 
  - It is declared with the **@NgModule decorator, found in the app.module.ts file.** 
  - app.module is comparable to com.revature. They’re both ROOT modules/package
- This allows for **modularity**. We can have whole frameworks or libraries in an NgModule which then can be easily added to our own modules. Examples include the FormsModule, HttpClientModule, and even the RouterModule (added to our project’s base NgModule with our --routing tag)
- The best way to think of the NgModule is that **it makes the various parts of Angular aware of each other.** 
  - **Declarations -** These are components that are “native” to this module. In other words, they have been created for this module specifically. 
  - **Imports** - This is where we put other modules that are dependencies of our application. 
    - So when we say --routing when creating a project, the AppRoutingModule gets added here because we are using its routing functionality 
    - Does this sound similar to something in Java? Importing modules is like using Gradle dependencies. We’re adding libraries to give our application more functionality. 
  - **Providers** - This specifies the services native to the module. Services are pure logic files (TS files), as opposed to components which have views (html/css) associated with them. Generally, services contain functions used by multiple components of the module. 
  - Finally, the **“bootstrap”** property defines the root component of the module
- Note that using the Angular CLI to generate components, services, etc. will add them to the root NgModule. If created manually, imports have to be done manually as well. 
  - So you will always see me using the CLI, it saves time and confusion by generating files we need, and automatically connecting them in NgModule



**Webpack (a bit about how Angular is working under the hood)**

- **Webpack is a powerful static module bundler** for JS applications that packages all modules in our application into a bundle and serves it to the browser.
  - This is used by Angular after the TS files have been transpiled into JS. **Angular uses Webpack as a dependency,** but Webpack is not specific to Angular and is used in many other applications 
  - “Webpack is used in the bootstrapping process to bundle all the transpiled JS attached to our Single Page Application that gets returned to the client”
- In previous web applications we would use many JS files added to the HTML pages with <script> tags. For each user request, the browser loads all the scripts inside the HTML page. This is inefficient as the browser requests each script individually. 
  - **Big picture**: Module bundlers are used to bundle together JS scripts and merge them into a single file. This can then be loaded by the browser all at once. **This is why Webpack is useful!** Great for application performance, after a longer frontload


**Data Binding (QC will absolutely positively ask about this)**

- In Angular, **data binding is how we create communication between a component and the DOM.** In other words, we use data binding to connect the logic and data stored in a component’s TS file, to its HTML page. 
  - This is how we’ll add most of our functionality to our SPAs.
- It’s called Data Binding because we **“bind the data” from a component’s html template to a component’s class** (TS File) or vice versa. 
- There are TWO DIFFERENT KINDS of data binding: **one-way and two-way**

- **One-way data binding** allows us to manipulate the views (what the user sees) through model classes. (See MVC below, analogous to Java model classes). If we make a change in our TS class, it gets reflected in the HTML. In Angular, there are **three types of one way binding**
  - **String Interpolation** (often just called interpolation) - **This displays the value of a component’s variable as text in the HTML.** 
    - Syntax is two curly braces: {{var name}} in the HTML
    - E.g. 
      - TS file: `let myVar = ‘Ben’;` 
      - HTML: `<p> Hello {{myVar}} </p>`
      - This displays a paragraph that says “Hello Ben” on the page.
  - **Property Binding** - **This binds values of component variables to the attributes of HTML elements.** When the value of the variables changes, the attribute will change accordingly.
    - Syntax is square brackets: [attribute] = “variable name”
      - (this is done in the HTML tag)
    - E.g. `<img [src] = “image”>` assume image is a TS variable
  - **Event Binding -** This allows us to **bind DOM events such as button clicks, mouse overs etc, to a function in the component.** Similar to how our event handlers/listeners work.
    - Syntax is parenthesis: (event) = “function name”
      - (this is done in the HTML tag)
    - E.g. `<input type=”submit” (click) = “submitFunction()”/>`

- **Two-way Binding combines property binding and event binding together.** It is very useful for **collecting data from the user**. Two-way binding **allows for user inputs to be reflected in the component’s TS class!!!** 
  - You can think of it like how the Java Scanner object can take user input and store it in a variable, to be used. 
- **VERY IMPORTANT: It requires us to import the FormsModule in the imports section of the NgModule in app.module.ts** in order to be available for use in your Angular application. 
  - Syntax is “banana in a boat”:  [(ngModel)] = “variable name”
    - E.g. `<input type=”text” [(ngModel)] = “name”/>`
    - `<p> Hello, {{name}}! </p>`	
    - What’s going on here? The user is getting prompted to enter some text that will be assigned to a variable called “name” in TS. We could then use String Interpolation to display their input in a later tag. 

\*Went back into todos demos\*

**Routing** 

- In a Single Page Application, when a request is sent to the server, **only a single page is returned,** as we should know by now.
  - However, we can **emulate the experience of browsing multiple pages** to the end user, using **routing.** 
  - **“Routes allow for the navigation from one view to another, by manipulating displayed components all within the same page.”** -QC line
- Routing requires the RouterModule in our application, and can be included automatically when we first build our application, with the **--routing tag.**
- **To allow for navigation, we specify a path and a component to display.** These two attributes must be added as an object to the app-routing.module’s **routes array**
  - path is the uri path in the browser that will display a particular component
  - The component class name given in the component field will associate it with that path, and allow it to be displayed using the <router-outlet> tag in the app.component.html

![](Aspose.Words.b047aeec-acb9-40df-b513-eb7481f68b19.001.png)





**Angular Directives** 

- Angular Directives **provide functionality for DOM manipulation in our HTML.** The directive is a marker on a DOM element (in the HTML) that tells Angular to **change the appearance, behavior, and/or layout of an element and its children.** Generally, they begin with “ng”. **They will be your best friend when it comes to writing dynamic functionality for your webpage.**

- **2 Types we’ll talk about:**
  - **Structural Directive:** These **change the structure of the DOM elements.** They are declared generally with a star - \*ng.
    - E.g. \*ngIf, \*ngFor
  - **Attribute Directives:** These **change the look or behavior of an element.** They change the ATTRIBUTES of DOM elements
    - E.g. ngModel, ngClass, ngStyle, (we’ll mostly only use ngModel)

- **Examples of Structural Directives**
  - **\*ngIf -** adds or removes an element based on a boolean expression 
  - **\*ngFor** - repeats a part of the HTML template for each item in an iterable list (generally an Array)
- **Examples of Attribute Directives**
  - **ngClass** - used to change the class of an HTML element to the value of the variable/expression you associate it with. We can give it several things:
    - String - the CSS classes declared as just a string
      - E.g. `[ngClass] = “theString’`
    - Array (of strings) - each element in the Array can be a separate class. 
      - E.g. `[ngClass] = [“firstClass”, “secondClass”]` 
        - (so this element has two classes)
    - Object - you can use an object where the keys are the class, and the values are the booleans that decide if the class is or is not added.
      - E.g. `[ngClass] = “{“first:true”, “second:false”}”`
  - **The idea is that HTML classes are easily changeable when we use ngClass.** Instead of having to go to the document.getElementById, getAttribute(ClassName), THEN change the class... you just have them saved as variables in TS that you can easily call.
  - **ngStyle -** Used to change the style attributes of an HTML element based on some expression. 

User is prompted to enter a username: `<input type = ‘text’ [(ngModel)] = ‘username’>`

`<div [ngStyle] = “{‘background-color’: username == ‘Admin’ ? ‘green’ : ‘red’> </div>`

*(What’s happening here? Based on the username inputted, the background-color will change, thanks to us using ngStyle)*

**ngSwitch - combines both attribute and structural directives**

- The ngSwitch directive will **create an element in the DOM based on a switch statement.** (Thus changing the DOM structure). **BUT, the statement itself is an attribute of the element** 
  - So it’s considered both a structural and attribute directive
- ngSwitch works very much like a switch in Java!! You’re basically building a switch statement directly into your HTML page. 
  - **ngSwitch -** an attribute directive that links to the variable or expression on the TS file. Like the variable/expression in a Java switch statement.
  - **\*ngSwitchCase -** a structural directive that creates an element if the ngSwitch matches the given value. Like a case in a Java switch.
  - **\*ngSwitchDefault -** a structural directive that creates an element if the ngSwitch does not match any of the values identified by the \*ngSwitchCase directives. Like the default case in a Java switch statement.
- E.g. <div [ngSwitch]="num">

`  `<div \*ngSwitchCase="'1'">You entered - One</div>

`  `<div \*ngSwitchCase="'2'">You entered - Two</div>

`  `<div \*ngSwitchCase="'3'">You entered - Three</div>

`  `<div \*ngSwitchCase="'4'">You entered - Four</div>

`  `<div \*ngSwitchCase="'5'">You entered - Five</div>

`  `<div \*ngSwitchDefault> ...default </div>

</div>

- Custom directives can be created using the Angular CLI. The command is: ng generate directive <directive-name>. We won’t get into these but feel free to use/implement one.

\*Finished our todo-list demo with some directives in the HTML (\*ngIf, \*ngFor)\*---------------------------------------------------------------------



\*Started our last demo - ngPokes\*

ng new ngPokes --routing --skip-git

\*we also used bootstrap (not actual bootstrap, but ngx-bootstrap: some guy’s recreation of bootstrap for angular. He did this for free what a guy\*

npm install ngx-bootstrap --save

- You should have ngx-bootstrap already in your node\_modules. If you don’t for some reason, you’ll need the following commands



ng add ngx-bootstrap 

\*You will need to run these commands in order to get your bootstrap styling to work, and sometimes if it stops works\*

npm uninstall @schematics/angular

npm install @schematics/angular@9.1.0

ng add ngx-bootstrap

\*If something is outdated in the version of angular installed: here’s a quick fix:

npm audit fix --force


**RouterLink (how to change the URL through web page navigation)**

- Thus far, we’ve had to manually change our URL to see different components
  - But using the RouterLink attribute in our HTML elements, we can show and hide components with the click of a button

**Route Guards**

- Angular has functionality for “guarding” certain routes in our application’s routing. **Essentially, routes can be labeled as only accessible to certain users.**
  - We don’t necessarily need to implement this, just know it exists as a way to design security into your application. 


**Services (one of the main 3 parts of an Angular application)**

- Services are used to organize and share **business logic, models, data, or functions** with different components of our Angular application.
  - So Services play a big role in giving our components shared functionality. 
- **“An Angular service is a singleton instance that can be injected into multiple components, so that the component can access the fields and functions of the service.”**  Similar to how importing Classes works in Java** 
  - This makes the code very reusable! You can inject one service into multiple components, and one component can have many services.
  - This is what we call **Dependency Injection! (DI)**
  - The Injector will provide the dependencies we list in our Angular class constructors, so we don’t have to create them ourselves.
- **Services are fundamentally tied to Dependency Injection**  in Angular. So much so that they use the **@Injectable** decorator to identify them. (Because we INJECT them into components).
- Generating a Service with the CLI can be done as usual
  - ng generate service services/<service-name> 
    - OR `ng g s services/service-name`
- Giving a parameter in a component’s (or other class’s) TS file’s **constructor with an access modifier identifies to the Injector that it needs to provide that dependency.** (See constructor injection below)

- export class EmployeeNamesComponent {

public employees:object = [ ];

constructor(**private** employeeService : EmployeeService) {

`	`This.employees = employeeService.getEmployees();

}

}

**Dependency Injection (DI)**

- Dependency Injection is a design pattern where **the class receives its dependencies (its data/functionality) from an external source instead of creating them itself.** 
  - Dependency Injection does not use the “new” keyword. We declare all of the necessary members (data/functions) in one class (the service) and give them to the injectee (the component)
  - Angular only uses **Constructor Injection:** We tell our application in the constructor what dependencies we need and it will provide them when we create the object. **Angular uses EXCLUSIVELY Constructor Injection** 

![](Aspose.Words.b047aeec-acb9-40df-b513-eb7481f68b19.002.png)


**MVC Design Pattern in Angular**

- Remember, MVC is just a way to organize the pieces of your full stack application, the display of data is as far away as possible from the data itself.

- **M**odels - These are the **TS classes** we create to store data and make objects.
  - Create Classes with ng g cl 
- **V**iew - Our **components** create the user’s view. The user’s view will change as components move in and out.  
- **C**ontrollers - **Services** form the logic layer, aka the controller layer for our application

**Publisher/Subscriber Design Pattern**

- Describes the **flow of information** between applications, devices, or services. 
  - It’s a design pattern for sending messages between applications. **We’ll be using it when we fetch data from our Java servers (or other APIs) in our angular application.**
- **A publisher** creates and pushes messages to a channel (which is basically a continuous of stream of information/data)
- **The subscribers** who subscribe to this channel/stream are immediately notified. 
  - The subscriber then decides what to do with the message from the publisher. It will get the data the publisher is publishing, and do something with it. 
- Any publisher can also be a subscriber, in that we can set anything up to send and receive messages.   
- Publishers and Subscribers don’t need to be aware of each other

- \*magazine analogy\* A magazine publisher will constantly be publishing issues of a magazine, and sending them off to the mailbox of people who have a subscription. A subscriber can get the magazine from the mailbox, and use it for whatever they wish (get information from it, do nothing with it). A subscriber can unsubscribe at any time, and will no longer get magazines from the publisher. (This last part is a little less accurate, it would be more like the subscriber unsubscribes from looking at their mailbox).

**\*Every time your phone get a push notification, that’s publisher subscriber**

- There is a sub-design pattern called the **Observable Pattern,** which we'll use in Angular

- ![](https://i.stack.imgur.com/vvHEc.png)

- **Angular uses this design pattern with the HttpClient (see below) to manage HTTP requests.** This allows for the use of Observables instead of Promises!!! This is how we get away from promises. (Observables are generally considered better).

# HTTP Requests in Angular

**Observables**

- Provide support for **passing messages/information between parts of your application.** They can be used for event handling, asynchronous programming, and handling multiple values. **We will most often see them with HTTP requests.**
  - **Observables are the publishers** in the publisher/subscriber design pattern (see above). This means **we must subscribe to an observable object in order to get information from it.** 
- Once you have obtained the resources you want from an observable, you can “unsubscribe” from the observable. You can do this even if you haven’t received anything from the observable. 
- Observables have **three callback methods happening under the hood, that we can implement ourselves if we want:**
  - **next()** - next is called when new values enter the stream, (a new resource/message is produced). When the publisher that is being observed publishes a value, as long as it’s not an error, the observable will call this method to emit the value.
  - **error()** - is called if an error occurs
  - **complete()** - when the stream completes returning values
- **Promises vs Observables? There are two major differences.**
  - A promise can only emit a single value, while observables can emit many
  - Promises must return/fulfill the promise (they must complete) while observables can be unsubscribed from any time. 

**RxJS (Reactive Extension for JavaScript)**

- “A framework for **reactive programming** (programming that relies on events happening) **using observables** that make it easier to write **asynchronous code**.” -QC line
  - This is what we’ll be using/importing in order to use observables!!!
- RxJS Subjects are a special type of Observable that allows values to be **multicast** **to many observables.** (This just means we can send values to many places at once)
  - Look back at the diagrams - Subjects are our event channels that Observers are watching in order to get messages from Observables. 
- Subjects have a **notify() method** that allows them to notify all the observers that are watching them. 

**HttpClientModule - Allows HTTP requests/responses in Angular**

- **HttpClientModule is a module** built into Angular that **provides functionality for HTTP requests and responses.** (Hopefully the name makes this apparent)
  - Typed request and response object (e.g. request type, response type)
  - Built in Observables API for asynchronous coding
  - Built in error handling 
  - Testing features
- Comes from (imported from) **@angular/common/http**
  - You will need to import it in your @NgModule in order to use it
- **Methods (should be recognizable)**
  - request() - generic request
  - get()
  - post()
  - patch()
  - put()
  - delete()
  - head()
  - Etc.
- HttpClient has an HttpHeaders service class that is used for configuring headers of a request. You may need to look into this if you start getting CORS errors when trying to GET or POST from your Java server.
- The HttpClient, along with RxJS’s catchError function, allows **easy error handling within each service that uses HttpClient.**

\*Used observables to get pokemon in ngPokes\*

**Angular Pipes**

- Pipes provide a way to **transform values in our Angular template (HTML) files.** 
- Pipes use the pipe character “|” and can take integers, strings, arrays, dates, and more, to return them in some desired format.
  - E.g. by default a date is shown in this format: Sat Aug 03 2019 19:48:11 EST+0530 (Eastern Standard Time)
  - A pipe can turn it into: Saturday, 03 Aug 2019 07:50 PM
  - Syntax: {{<var name> | <pipe name>}}
    - Eg {{name | uppercase}}
- **Angular has plenty of built-in pipes.** There are pipes for:
  - Date
  - Decimal
  - Currency
  - Percent
  - Slice - slices Strings
  - Lowercase/Uppercase
  - TitleCase - makes every word begin with a capital letter
  - Json 
- **You can create your own custom pipes.**
  - CLI command is: ng g pipe <pipe-name>
- Pipe classes use the @Pipe decorator and the transform() function.

**Jasmine and Karma**

- Jasmine and Karma are built in tools to support **testing in Angular**.

- **Jasmine is the actual testing framework** 
  - Jasmine can write different types of tests, but primarily **unit tests.**
  - Jasmine attempts to write tests in a “human readable” way.
  - Jasmine starts by identifying the file under testing with the “describe” keyword and has a callback function to ensure all dependencies are accessible 
    - E.g. describe(‘AppComponent’, callback)
  - Jasmine has beforeEach, afterEach, beforeAll, afterAll, just like JUnit
  - The actual test uses the “it” with the test name/title and a callback function that serves as the actual test function. It will include the “expect” keyword. 
    - E.g it(‘should have the title “myApp”’, () => {

const appTitle = document.getElementById(“title”).value;

`	`expect(appTitle).toEqual(“myApp”);})

- **Karma is a task runner for Jasmine.** It works with Jasmine by default but can be used with other frameworks if configured to do so.
  - Karma will have a configuration file that chooses the testing framework (Jasmine is the default) and other options including what browser to display in. 
  - It will display reports from the tests, hot-reload the tests if changes are made, and otherwise manage the Jasmine tests (check for code coverage, etc)


**Event Emitters** 

- These are **custom events that synchronously or asynchronously send data between components**
  - Uses the @Input and @Output decorators
- This allows for **communication between nested (parent/child) components.** So parent components can emit (send) information/events to children and vice versa.
  - Example of a nested component? Say you have a poker application. There can be one big component holding the actual game, and one component holding the table. During the game, the table can keep track of how much money each player has, what their hands are, etc. When someone wins, the table component would send a message (through an event emitter) to the game component, letting it know that a certain player won, thus ending the game and displaying which player won the game. 

\*Chances are you wont need nested components in your projects. Feel free to look into them but try to simplify things where possible.


