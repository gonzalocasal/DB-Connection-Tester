# DB-Tester Tool
Tool to make a quick connection test on the leading DBMS Platforms, using JDBC Connections. Java is required to execute the tool.




 
# [DOWNLOAD](https://github.com/gonzalocasal/DB-Connection-Tester-Tool/raw/master/DBCTest.jar) 

# BUILD

./gradlew fatJar

This Gradle task will build the jar including all the drivers


# USAGE
```java -jar DBCTest.jar <DBMS> <host> <user> <password>```

# EXAMPLES

MySQL: ```java -jar DBCTest.jar mysql 192.168.1.196:3306/TestDB dbuser dbpass```

ORACLE: ```java -jar DBCTest.jar oracle 192.168.1.196:1521/XE system oracle```

PostreSQL: ```java -jar DBCTest.jar postgre 192.168.1.196:5432/TestDB?sslmode=require dbuser dbpass```

MSSQL: ```java -jar DBCTest.jar mssql "192.168.1.196:1433;databaseName=TestDB" dbuser dbpass```

*cuotes are required if in one of the arguments uses ; char. Like MSSQL example.

