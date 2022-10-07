# Technology Project Requirements

## Project Description

For the technology module of your training you are tasked with building a web-based expense reimbursement system. This system will manage the process of reimbursing employees for expenses incurred while on company time. All registered employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement.

### Project Design Specifications and Documents

##### Relational Data Model
![Relational Model](https://raw.githubusercontent.com/Ultronomix/docs/main/imgs/ERS%20Relational%20Model.png)

##### Reimbursement Types
Reimbursements are to be one of the following types:
- LODGING 
- TRAVEL 
- FOOD 
- OTHER 

##### System Use Case Diagrams
![System Use Case Diagrams](https://raw.githubusercontent.com/220509-web-dev/activities/main/technology-project/imgs/ERS%20Use%20Case%20Diagram.png)

##### Reimbursment Status State Flow
![Reimbursment Status State Flow](https://raw.githubusercontent.com/220509-web-dev/activities/main/technology-project/imgs/ERS%20State%20Flow%20Diagram.png)

### Technologies

**Persistence Tier**
- PostGreSQL

**Application Tier**
- Java 8
- Spring 5 & Spring Boot
- Apache Maven
- Hibernate & Spring Data
- JSON Web Tokens (Optional)
- JUnit
- Mockito

**Client Tier**
- HTML
- CSS
- TypeScript
- Angular

**Deployment Platform Tools**
- Cloud Provider: Amazon Web Services (AWS)
- Database Deployment: AWS Relational Database Service (RDS)
- Server Deployment: AWS Elastic Beanstalk (EB) + AWS Elastic Compute Cloud (EC2)
- UI Deployment: AWS Simple Storage Service (S3)
- Build Automation: AWS Code Build
- Pipeline Management: AWS Code Pipeline

### Functional Requirements

- An new employee or new finance manager can request registration with the system
- An admin user can approve or deny new registration requests
- A registered employee can authenticate with the system by providing valid credentials
- An authenticated employee can view and manage their pending reimbursement requests
- An authenticated employee can view their reimbursement request history (sortable and filterable)
- An authenticated employee can submit a new reimbursement request
- An authenticated finance manager can view a list of all pending reimbursement requests
- An authenticated finance manager can view a history of requests that they have approved/denied
- An authenticated finance manager can approve/deny reimbursement requests
- An admin user can deactivate user accounts, making them unable to log into the system
- An admin user can reset a registered user's password

### Non-Functional Requirements

- A set of slides will be presented BEFORE the live demo, explaining the application, what problem it solves, and the technologies used.
- Basic validation is enforced to ensure that invalid/improper data is not persisted
- User passwords will be hashed by the system before persisting them to the data source
- Users are unable to recall reimbursement requests once they have been processed (only pending allowed)
- Sensitive endpoints are protected from unauthenticated and unauthorized requesters using JWTs
- Errors and exceptions are handled properly and their details are obfuscated from the user
- The system conforms to RESTful architecture constraints
- The system's is tested with at least 80% line coverage in all service and utility classes
- The system's data schema and component design is documented and diagrammed 
- The system keeps detailed logs on info, error, and fatal events that occur 
- UI and API builds and deployments are automated using a CI/CD pipeline (UI pipeline is optional)
- UI is deployed to a AWS S3 bucket configured for static web hosting

### Suggested Bonus Features
- Authenticated employees are able to upload an receipt image along with their reimbursement request
- The system notifies the user of changes to their account registration status by email
- The system notifies the user of changes to their reimbursement request status by email
- The system supports user-driven password resets by sending a reset link to the user's registered email address
- API is deployed to AWS EC2 (via Elastic Beanstalk) as a Docker container

#### Project Presentations 
- Thursday, October 20th

## Minimal Viable Product Requirements (End-to-end completion)
- Functional: Users are able to register for an account with the system
- Functional: Admin users are able to see a table of system users (sortable and filterable)
- Functional: Admin users are able to approve pending registration requests
- Functional: Admin users are able to change the role of a system user
- Functional: Activated users are able to authenticate with the system
- Functional: Employee users are able to create and submit new reimbursements
- Functional: Employee users are able to see a table of all of their reimbursements (sortable and filterable)
- Functional: Finance managers are able to see a table of all pending reimburesments (sortable and filterable)
- Functional: Finance managers are able to select a reimbursement from the table and see separate view containing that reimbursement's details
- Functional: Finance managers are able to approve or deny pending reimbursements
- Non-Functional: Test coverage of the API's service layer is at least 80%
- Non-Functional: The API's endpoints are exposed in a RESTful manner
- Non-Functional: User passwords are hashed or encrypted before persisting to the database

