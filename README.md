# DB-Tester Tool
Tool to test leading DBMS Platforms using JDBC Connections, so Java is required to execute the tool.

# Technologies


# BUILD

./gradlew fatJar

This Gradle task will build the jar including all the drivers


# EXECUTION EXAMPLES

USAGE: java -jar DBCTest.jar <driver> <host> <user> <password>

MySQL: java -jar DBCTest.jar mysql 192.168.1.196:3306/TestDB dbuser dbpass

ORACLE: java -jar DBCTest.jar oracle 192.168.1.196:1521/XE system oracle

PostreSQL: java -jar DBCTest.jar postgre 192.168.1.196:5432/TestDB?sslmode=require dbuser dbpass

MSSQL: java -jar DBCTest.jar mssql "192.168.1.196:1433;databaseName=TestDB" dbuser dbpass


