# booklibrary

#####project structure
booklibrary/
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
├── .gitignore
├── HELP.md
├── gradle/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── com/example/booklibrary/
│   │   │       ├── Book.kt
│   │   │       ├── BookRepository.kt
│   │   │       ├── BookController.kt
│   │   │       ├── GlobalExceptionHandler.kt
│   │   │       └── BookLibraryApplication.kt
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   └── test/kotlin/
│       └── com/example/booklibrary/
│           └── BookLibraryApplicationTests.kt

####################
Book.kt – for data class

BookController.kt – for controller

BookRepository.kt – for JPA repository

BookService.kt – for optional service logic

GlobalExceptionHandler.kt – for exception handling

BookLibraryApplication.kt – your main Spring Boot app

###################
How to Select on start.spring.io
Visit: https://start.spring.io

Choose:

Project: Gradle - Kotlin

Language: Kotlin

Spring Boot: 3.5.3 or latest

Group: com.example

Artifact: booklibrary

Packaging: Jar

Java: 17 or higher

Click “Add Dependencies” and add:

✅ Spring Web

✅ Spring Data JPA

✅ H2 Database

✅ Validation

✅ Kotlin JPA

✅ Kotlin Reflection

Click Generate and unzip the project.

#########
Install JDK If Not Installed
Download JDK 17 or 21 from:
https://adoptium.net/en-GB/temurin/releases/

Install it, then come back and select it in IntelliJ

######
How to Run
Click the green ▶️ run button next to fun main() in BookLibraryApplication.kt
or
Run via terminal:

./gradlew bootRun

Once it's running, try visiting:
http://localhost:8080/books
