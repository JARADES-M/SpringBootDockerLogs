# SpringBoot + Docker + Logs

> Based on [spring.io - Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/#initial) example.

### Run The Project (maven)

> Clean And Build The Project
```sh 
$ mvn clean package
```

> A faster way to launch the app

```sh 
$ mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
```
> Build the Docker image
```sh 
$ docker build -t exampleimage .
```
> Run the Docker app
```sh 
$ docker run -p 8080:8080 -t exampleimage
```

> You can use Ctrl+C to exit the container console. 
> Then you can check the logs using the following command.
 ```sh 
$ docker exec -t <container name> cat tmp/myapplogs/application_logs.log
```

> Access the app
 [http://localhost:8080](http://localhost:8080)

 > See the containers
 ```sh 
$ docker ps
```
> Stop a container
 ```sh 
$ docker stop <container name>
```
> Delete a container
 ```sh 
$ docker rm <container name>
```
> See the images
 ```sh 
$ docker images -a
```
> Delete an image
 ```sh 
$ docker rmi <image id>
```