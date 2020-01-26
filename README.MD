# SpringBoot + Docker + Logs

> Based on [spring.io - Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/#initial) example.

### Deploy To GCP CloudRun

> Install the [Google Cloud SDK](https://cloud.google.com/sdk/install)

> Log with your account
 ```sh 
$ gcloud auth login
```
> Define which project you are going to use
 ```sh 
$ export CLOUDSDK_CORE_PROJECT=<Project ID>
```
> 
 ```sh 
$ gcloud builds submit --tag gcr.io/<Project ID>/hellocloud
```
> 
 ```sh 
$ gcloud run deploy --image gcr.io/<Project ID>/hellocloud --platform managed --region us-central1 --allow-unauthenticated hellogpc
```