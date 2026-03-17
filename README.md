# eventApp

A Java console application for managing events, built following the **MVC (Model-View-Controller)** architectural pattern with MySQL database integration.

## 📋 Description

`eventApp` allows users to create, list, update and delete events through an interactive console menu. Data is persisted in a MySQL relational database using JDBC.

## 🏗️ Project Structure

```
eventApp/
├── src/main/java/org/mvc1/
│   ├── Main.java                        # Application entry point
│   ├── config/
│   │   └── DBManager.java               # Database connection management
│   ├── controller/
│   │   └── EventController.java         # Business logic & orchestration
│   ├── model/
│   │   └── Event.java                   # Event entity / POJO
│   ├── repository/
│   │   └── EventRepositoryImpl.java     # CRUD operations via JDBC
│   └── view/
│       └── EventView.java               # Console UI & user input
└── pom.xml
```

## 🛠️ Tech Stack

| Layer        | Technology          |
|--------------|---------------------|
| Language     | Java 25             |
| Build tool   | Maven               |
| Database     | MySQL               |
| DB Connector | mysql-connector-j 9.6.0 |

## ⚙️ Requirements

- Java 25+
- Maven 3.6+
- MySQL 8.0+ running locally (or via XAMPP)

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone <repository-url>
cd eventApp
```

### 2. Configure the database

Create a database in MySQL and update the connection settings in `DBManager.java`:

```java
private static final String URL  = "jdbc:mysql://localhost:3306/your_database";
private static final String USER = "your_user";
private static final String PASS = "your_password";
```

Then create the `events` table:

```sql
CREATE TABLE events (
    id    INT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(255) NOT NULL,
    date  DATE         NOT NULL,
    place VARCHAR(255)
);
```

### 3. Build and run

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.mvc1.Main"
```

## 📦 Dependencies

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.6.0</version>
</dependency>
```

## 📄 License

```
MIT License

Copyright (c) 2026

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
