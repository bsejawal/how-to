### Install Gradle 
```
https://gradle.org/install/
```

-  install with package manager SDKMAN
  ``` sdk install gradle 8.11.1 ```
  
- OR install with package manager brew
  ``` brew install gradle ```

- Install Manually
  ```
  download from https://gradle.org/releases/
  click on complete and unzip
  mkdir /opt/gradle
  unzip -d /opt/gradle gradle-8.11.1-bin.zip
  add following to the .zshenv file
  vim ~/.zshenv
  export PATH=$PATH:/opt/gradle/gradle-8.11.1/bin
  ```

### Gradle command
- create a project
  ```
  gradle init
  ```
- list all the dependencies ``` ./gradlew --refresh-dependencies ```
- ./gradlew clean build
- in multi module project, run single service/app with specific profile
```
./gradlew :services:service-name:bootRun -Dspring.profiles.active=local
```

run with multiple active profile and on specific port
- ./gradlew :services:service-name:bootRun --args='--spring.profiles.active=local,secret,local-load-test  --server.port=8087'
