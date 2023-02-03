- ./gradlew --refresh-dependencies
- ./gradlew clean build
- ./gradlew :services:booking-config-server:bootRun -Dspring.profiles.active=local

run with multiple active profile and on specific port
- ./gradlew :services:instant-credit-service:bootRun --args='--spring.profiles.active=local,secret,local-load-test  --server.port=8087'
