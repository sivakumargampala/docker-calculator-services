# Calculator Services Containerization POC 

1. This repo contains docker-compose.yml file to spin up square-service,cube-service and factorial service at once using docker-compose.
2. README.md file gives information on building and publishing docker image of each service to docker-hub repository.

## Github repository details

### square-service
- https://github.com/sivakumargampala/square-service

### cube-service
- https://github.com/sivakumargampala/cube-service

### factorial-service
- https://github.com/sivakumargampala/factorial-service

## Docker image creation steps

1. In this section I have explained steps to create docker images and how to publish to docker-hub repo.
2. I have covered sqaure-service app and same steps can be followed for cube-service and factorial-service.

### Square Service App

1. Each application has its own github repo.For example square-service url is given below.
- https://github.com/sivakumargampala/square-service.git
2. Open new instance in docker playground.
3. Clone github repo by executing below command . Once clone is succesful you will be able to see the square-service directory.
- git clone https://github.com/sivakumargampala/cube-service.git
4. As each app is java spring boot based and maven is the package manager we need maven to build the code.
5. So to build the cloned app in docket playground execute the below command.Below command uses maven docker image.
- docker run -it --rm --name square-service -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.3-jdk-8 mvn clean install
6. After succesful completion of step 5 you will be able to see the square-service executable jar file.
7. Cloned git repo has Dockerfile that is required to build docker image,so now to build the docker image execute below command.
- docker build -t sivakumargampala/square-service:v1
8. To spin up the sqaure-service container execute below command.Once the container is up and running try hitting the square service endpoint.
- docker run -d -p 8091:8091 sivakumargampala/cube-service:v1
- http://playground-host-name:8091/square/4
9. To push the created image to docker hub repository execute the below command after you login into your docker account using docker login.
- docker push sivakumargampala/factorial-service:v1


### Running the Applications

1. square-service 

- http://localhost:8091/square/4

```txt
16.0
```

2. cube-service
- http://localhost:8092/cube/3

```txt
27.0
```

3. factorial-service
- http://localhost:8093/factorial/5

```txt
120.0

 
 