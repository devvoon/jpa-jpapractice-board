# README
this program is springboot and jpa example

## Environment setting

### Language : Java
#### java 14.0.2 2020-07-14

### Framework : Spring Boot
#### [Spring boot]<https://start.spring.io/>
- Project : Gradle Project
- Language : Java
- Spring Boot : 2.4.5
- Project Metadata 
	- Group : example
	- Artifact : jpaproject
	- Name : jpaproject
	- Description : Demo project for Spring Boot
	- Package name : example.jpaproject
	- Package : jar
	- Java : 11
- Dependencies : 
	- Spring Web 
	- Thymeleaf		  
	- Lombok
	- Spring Data JPA
	- H2 Database
- download : click the "GENERATE" button or use a shortcut key "CTRL+enter"

### IDE (eclipse or IntelliJ)
#### [IntelliJ Community Version]<https://www.jetbrains.com/>


### Run the downloaded IDE program and import bundle.gradle file

## Install Database 
### H2 Database<https://h2database.com/>
- download H2 Database and install it in your local pc
- open H2 Console or run ./h2.bat or ./h2.sh
- create your project DB driver 
   - Saved Settings: Generic H2 (Serve)
   - Setting Nanme: Generic H2 (Serve)
   - JDBC URL: jdbc:h2:~/jpaproject
   - click the "Connect" button
- check the DB Stories file 'jpaproject.mv.db' in your pc
- next connection you can jdbc:h2:tcp://localhost/~/jpashop 







