# Java Enterprise Foundations Project Requirements

## Project Description

For the foundations module of your training you are tasked with building an API that will support a new internal expense reimbursement system. This system will manage the process of reimbursing employees for expenses incurred while on company time. This system will work closely with the internal PRISM application - which is used for processing payments to employees. All registered employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. Finance managers can log in and view all reimbursement requests and past history for all employees in the company. Finance managers are authorized to approve and deny requests for expense reimbursement.

### Project Design Specifications and Documents

##### Relational Data Model
![Relational Model](https://github.com/220207-java-enterprise/assignments/blob/main/foundations-project/imgs/ERS%20Relational%20Model.png)

##### Reimbursement Types
Reimbursements are to be one of the following types:
- LODGING 
- TRAVEL 
- FOOD 
- OTHER 

##### System Use Case Diagrams
![System Use Case Diagrams](https://raw.githubusercontent.com/220207-java-enterprise/assignments/main/foundations-project/imgs/ERS%20Use%20Case%20Diagram.png)

##### Reimbursment Status State Flow
![Reimbursment Status State Flow](https://raw.githubusercontent.com/220207-java-enterprise/assignments/main/foundations-project/imgs/ERS%20State%20Flow%20Diagram.png)

### Technologies

**Persistence Tier**
- PostGreSQL (running on AWS)

**Application Tier**
- Java 8
- Apache Maven
- JDBC
- Java EE Servlets
- JUnit
- Mockito

### Functional Requirements

- An new employee or new finance manager can request registration with the system
- An admin user can approve or deny new registration requests
- The system will register the user's information with the PRISM application for payment processing
- A registered employee can authenticate with the system by providing valid credentials
- An authenticated employee can view and manage their pending reimbursement requests
- An authenticated employee can view their reimbursement request history (sortable and filterable)
- An authenticated employee can submit a new reimbursement request
- An authenticated finance manager can view a list of all pending reimbursement requests
- An authenticated finance manager can view a history of requests that they have approved/denied
- An authenticated finance manager can approve/deny reimbursement requests
- An admin user can deactivate user accounts, making them unable to log into the system

### Non-Functional Requirements

- Basic validation is enforced to ensure that invalid/improper data is not persisted
- User passwords will be encrypted by the system before persisting them to the data source
- Users are unable to recall reimbursement requests once they have been processed (only pending allowed)
- Errors and exceptions are handled properly and their details are obfuscated from the user
- The system conforms to RESTful architecture constraints
- The system's is tested with at least 80% line coverage in all service and utility classes
- The system's data schema and component design is documented and diagrammed 
- The system keeps detailed logs on info, error, and fatal events that occur 

### Suggested Bonus Features
- Sensitive endpoints are protected from unauthenticated and unauthorized requesters using JWTs or Sessions
- Authenticated employees are able to upload an receipt image along with their reimbursement request
- The system notifies the user of changes to their account registration status by email
- The system notifies the user of changes to their reimbursement request status by email
- Document your API using a tool like OpenAPI/Swagger
- Run your application within a Docker container
- Automate builds using GitHub Actions

## Scoring and Milestones

### Technical Scoring Rubric

| Requirement                                                                                       | Functional/Non-Functional | Value |
|---------------------------------------------------------------------------------------------------|---------------------------|-------|
| An new employee or new finance manager can request registration with the system                   | Functional                | 10    |
| An admin user can approve or deny new registration requests                                       | Functional                | 5     |
| The system will register the user's information with the PRISM application for payment processing | Functional                | 5     |
| A registered employee can authenticate with the system by providing valid credentials             | Functional                | 10    |
| An authenticated employee can view and manage their pending reimbursement requests                | Functional                | 10    |
| An authenticated employee can view their reimbursement request history (sortable and filterable)  | Functional                | 10    |
| An authenticated employee can submit a new reimbursement request                                  | Functional                | 10    |
| An authenticated finance manager can view a list of all pending reimbursement requests            | Functional                | 10    |
| An authenticated finance manager can view a history of requests that they have approved/denied    | Functional                | 10    |
| An authenticated finance manager can approve/deny reimbursement requests                          | Functional                | 10    |
| An admin user can deactivate user accounts, making them unable to log into the system             | Functional                | 5     |
| Basic validation is enforced to ensure that invalid/improper data is not persisted                | Non-Functional            | 10    |
| User passwords will be encrypted by the system before persisting them to the data source          | Non-Functional            | 5     |
| Users are unable to recall reimbursement requests once they have been processed                   | Non-Functional            | 10    |
| Errors and exceptions are handled properly and their details are obfuscated from the user         | Non-Functional            | 10    |
| The system conforms to RESTful architecture constraints                                           | Non-Functional            | 10    |
| The system's is tested with at least 80% line coverage in all service and utility classes         | Non-Functional            | 10    |
| The system's data schema and component design is documented and diagrammed                        | Non-Functional            | 5     |
| The system keeps detailed logs on info, error, and fatal events that occur                        | Non-Functional            | 5     |

### Soft Skill Scoring Rubric 

| Metric                                                                                            | Value |
|---------------------------------------------------------------------------------------------------|-------|
| The associate is able to speak clearly and articulately                                           | 5     |
| The associate adheres to the presentation time limit                                              | 5     |
| The associate is able to correctly use technical terminology when discussing system functionality | 5     |
| The associate's demonstration is easy to follow and well-prepared                                 | 5     |

### Developer Scoring Rubric

| Metric                                                                                            | Value |
|---------------------------------------------------------------------------------------------------|-------|
| The application's codebase adheres to best practice naming conventions                            | 33    |
| The application's codebase follows some kind of organizational structure                          | 33    |
| The commit history of the project is detailed with concise and descriptive commits                | 34    |

## Milestones

#### 01Sept2022 
- Project requirements delivered

#### 02Sept2022
- Remote DB instance running (can reuse P0 DB)
- Remote repository is created and can be pushed to
- Core model classes are created
- App to DB connection made
- Registration/Authentication/User service-layer operations in progress

#### 09Sept2022 
- Specified tables created with proper constraints
- Registration/Authentication/User service-layer operations complete
- Reimbursement service-layer operations in progress
- Basic persistence layer operations in progress
- Testing of business logic is in progress
- Rudimentary logging (to file) with a logging framework is in place

#### 14Sept2022 
- Reimbursement service-layer operations complete
- Registration/Authentication web endpoints are accessible and functional
- Reimbursement web endpoints are accessible and functional
- User passwords are encrypted when persisted to the DB
- Testing of business logic is in progress

#### 16Sept2022 
- Project Presentations
