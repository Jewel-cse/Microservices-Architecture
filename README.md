# Deployment using Docker and kubernetes
## Step 1:
>Create a spring boot application
>Build an image using maven plugin
```
  mvn spring-boot:build-image -DskipTests
```
> -DskipTest for faster build
###Some docker image command
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
>###Container Run
>>hostPort:containerPort and when docker desktop is restart the container is run automatically
```
  docker run -p 5000:5000 -d —restart=always projectName:tagName
```

>Memory use maxi 512megabyts and cpu 5% = 5,000 bcz  (100,000 = 100%)  check it by <docker system dif>
```
  docker run -p 5001:5000 -m 512m —cpu-quota 5000 - projectname:tagename
```
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

## Some other Docker Commands
>Displays real-time events from the Docker daemon, showing what is happening with Docker
```
  docker events
```
>Lists all running processes within a specific container
```
  docker top <container id>
```
>Shows a live stream of system resource usage statistics (CPU, memory, network, etc.) for running containers
```
  docker stats
```
>Downloads an image from the Docker registry to the local system
```
  docker pull <image name>
```
>Searches the Docker Hub for images matching the specified term
```
  docker search
```














