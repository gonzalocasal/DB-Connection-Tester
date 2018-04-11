# DB Connection Tester Tool
Tool to make a quick connection tests trough CLI on the leading DBMS Platforms. The connections are established through JDBC, so Java is required on the client computer.


![](https://k62.kn3.net/D/E/D/2/0/9/E0A.png)

 
# [DOWNLOAD](https://github.com/gonzalocasal/DB-Connection-Tester-Tool/raw/master/DBCTest.jar) 

# BUILD

./gradlew fatJar

This Gradle task will build the jar including all the drivers


# HOT TO RUN IT
```java -jar DBCTest.jar <DBMS> <host> <user> <password>```

# EXAMPLES

MySQL: ```java -jar DBCTest.jar mysql 192.168.1.196:3306/TestDB dbuser dbpass```

ORACLE: ```java -jar DBCTest.jar oracle 192.168.1.196:1521/XE system oracle```

PostreSQL: ```java -jar DBCTest.jar postgre 192.168.1.196:5432/TestDB?sslmode=require dbuser dbpass```

MSSQL: ```java -jar DBCTest.jar mssql "192.168.1.196:1433;databaseName=TestDB" dbuser dbpass```

*cuotes are required if in one of the arguments uses ; char. Like MSSQL example.

