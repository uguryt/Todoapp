# Dependencies for Spring

Spring Data JPA

Spring Web

Lombok

H2 Database

# NPM Dependencies

react

react-router-dom

axios

# How to Run

todoapp file contains the Java and Spring Boot backend files. Importing this file in your preffered IDE should make you have all the necessary tools for running this project. Running TodoappApplication.java(under the src/main/java file) as a Java Application should start up the project. From this point on i would recommend Postman application for manipulating the data in our database. If not you can connect to H2 Database in address:

localhost:8080/h2-console

And have the JBDC URL as:

jdbc:h2:mem:todoapp

------

And after getting the dependencies for React side of the project, you could run the React application by writing in the terminal:

npm start

After starting your project it should open the main page in your web browser.

# CORS policy will makes things hard for frontend so i suggest using Moesif Origin extension in your web browser.
