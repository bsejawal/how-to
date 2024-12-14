
- ./gradlew --refresh-dependencies
- ./gradlew clean build
- ./gradlew :services:service-name:bootRun -Dspring.profiles.active=local

run with multiple active profile and on specific port
- ./gradlew :services:service-name:bootRun --args='--spring.profiles.active=local,secret,local-load-test  --server.port=8087'
