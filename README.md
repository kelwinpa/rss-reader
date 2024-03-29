# rss-reader

The goal of this application is to be able to distribute data from different feeds including images to clients.

The project is a microservice that polls a news feed from http://feeds.nos.nl/nosjournaal?format=xml and stores the data in an SQL database.

All layers have been tested with Junit, AssertJ, Suite and Spring Test.

## Technologies

* [SpringBoot] - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".!
* [H2] - H2 is a relational database management system written in Java. It can be embedded in Java applications or run in client-server mode
* [Maven] - Maven is a build automation tool used primarily for Java projects.
* [Junit] - JUnit is a unit testing framework for the Java programming language
* [Swagger] - Swagger is an open-source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services
* [Git] - Git is a distributed version-control system for tracking changes in source code during software development.
* [Docker] - Docker is a set of coupled software-as-a-service and platform-as-a-service products that use operating-system-level virtualization to develop and deliver software in packages called containers
* [Jenkins] - Jenkins is an open source automation server written in Java. Jenkins helps to automate the non-human part of the software development process, with continuous integration and facilitating technical aspects of continuous delivery.

## Endpoint to test

After running you can test two endpoints.

```sh
$ http://localhost:8180/swagger-ui.html#/
$ http://localhost:8180/h2-console
```

__Note:__ 
* Swagger request parameter. __format:__ xml 
* Password for H2 db. __password:__ kpayares

## How to run it

There are three different ways to run the project.
 1) run with an IDE, for example Spring Tools 4.
 2) By using Docker engine (DokckerFile and Docker Compose are provided)
 3) By using Jenkins (JenkinsFile is provided)

### Running with Docker

__Note__: Docker engine must be installed.

Open cmd in the root project and type

```sh
$ mvn clean package docker:build
```

This previous command will generate the docker image: __kpayares/rss-service:latest__ 

There are two options to run the container
#### Via docker-compose file
__note__: you must be in the root of the project
```sh
$ docker-compose up
```
#### Via docker command

Run the container with the following command.

```sh
$ docker run -p 8180:8180 --name rss-service kpayares/rss-service:latest
```
## Deploying with Jenkins

1) Install Jenkins.
2) Fork the project into your own repository.
3) Connect Jenkins with your repository.
4) Create a multibranch pipeline and associate your own repository with Jenkins.
5) Make a change in the repository to start the workflow process in Jenkins.

__Note__: associate jdk8 and maven with the Jenkins global configuration


***
This file was generated by https://dillinger.io/

   [SpringBoot]: <https://spring.io/projects/spring-boot>
   [H2]: <https://www.h2database.com/>
   [Maven]: <https://maven.apache.org/>
   [Junit]: <https://junit.org/junit5/>
   [Swagger]: <https://swagger.io/>
   [Git]: <https://git-scm.com/>
   [Docker]: <https://www.docker.com/>
   [Jenkins]: <https://jenkins.io/>
