# Todo Application

A simple Todo Application built with Spring Boot and Thymeleaf.

## Description
This is a basic Todo application that allows users to manage their tasks efficiently. Users can add new tasks, mark them as completed or incomplete, and delete tasks when no longer needed. The application follows the MVC architecture and integrates with a simple database to store task details.

## Features
- Add new tasks
- View all tasks
- Mark tasks as completed/incomplete
- Delete tasks

## Technologies Used
- Java 17
- Spring Boot 3
- Spring MVC
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- Mysql Database
  
## Getting Started

### Prerequisites
- Java 17+
- Maven

### Clone the Repository
```sh
git clone https://github.com/sajansuvarnan/todoapp.git
cd todoapp
```

### Build and Run the Application
```sh
mvn spring-boot:run
```

The application will be accessible at `http://localhost:8080`

## Project Structure
```
├── src/main/java/com/app/todoapp
│   ├── controller/TaskController.java
│   ├── models/Task.java
│   ├── repository/TaskRepository.java
│   ├── service/TaskService.java
│
├── src/main/resources/templates/
│   ├── tasks.html
│
├── src/main/resources/application.properties
│
└── README.md
```

## Screenshots
Portal:
![image](https://github.com/user-attachments/assets/0e70a54b-08b1-4edd-8ad8-cfb7a9ab9b5c)

MySQL DB:
![image](https://github.com/user-attachments/assets/68ab90eb-e41c-4aae-800b-46dc47174d2e)



## License
This project is open-source and available under the MIT License.

