# Jasper Report Example
Application built with Spring Boot integrating Jasper Report and MySQL as database. 

GET - localhost:8080/getEmployees

GET - localhost:8080/report/{format}

This endpoint requires a parameter for the format (HTML or PDF), and after sending a request, it will generate a report file inside the project's folder.
