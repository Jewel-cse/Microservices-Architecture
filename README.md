# Deployment using Docker and kubernetes
## Step 1:
>Create a spring boot application
>Build an image using maven plugin
```
  mvn spring-boot:build-image -DskipTests
```
> -DskipTest for faster build
##Some docker image command
>To see the list of images
```
   docker images
````
>Displays the history of an image, showing the commands used to create each layer
```
  docker image history <image id>
```
>Provides detailed information about a specific image, including its configuration and layers
```
  docker image inspect <image id>   : gives the info about images
```
>Deletes the specified image from the local system
```
  docker image remove <image id> : remove from local
```


## Step 2:
>Container Run
docker run -p 5000:5000 -d —restart=always projectName:tagName
>hostPort:containerPort and when docker desktop is restart the container is run automatically
## docker container related commands
>Pauses all processes within a container
```
  docker container pause <image id>
```
>Resumes all processes within a paused container
```
  docker container unpause <image id>
```
>Provides detailed information about a specific container
```
  docker container inspect <image id>
```
>Lists all containers, including stopped ones
```
  docker container ls -a
```
>Removes all stopped containers
```
  docker container prune
```
>Follows and displays real-time logs from a container.
```
  docker container logs -f <container id>
```
>Gracefully shutdown a running container
```
  docker container stop
```
>Immediately shutdown a running container
```
  docker container kill <container id>
```

