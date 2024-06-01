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

